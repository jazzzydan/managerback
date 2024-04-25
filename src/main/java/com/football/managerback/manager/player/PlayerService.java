package com.football.managerback.manager.player;

import com.football.managerback.domain.club.Club;
import com.football.managerback.domain.club.ClubRepository;
import com.football.managerback.domain.player.Player;
import com.football.managerback.domain.player.PlayerMapper;
import com.football.managerback.domain.player.PlayerRepository;
import com.football.managerback.domain.player.playerdetail.PlayerDetail;
import com.football.managerback.domain.player.playerdetail.PlayerDetailMapper;
import com.football.managerback.domain.player.playerdetail.PlayerDetailRepository;
import com.football.managerback.domain.player.playerobservation.PlayerObservationRepository;
import com.football.managerback.infrastructure.validation.ValidationService;
import com.football.managerback.manager.player.dto.PlayerDetailInfo;
import com.football.managerback.manager.player.dto.PlayerInfo;
import com.football.managerback.manager.player.dto.PlayerNameInfo;
import com.football.managerback.manager.player.dto.PlayersRequest;
import com.football.managerback.util.DateConverter;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

@Service
@AllArgsConstructor
public class PlayerService {
    private final PlayerRepository playerRepository;
    private final PlayerDetailRepository playerDetailRepository;
    private final PlayerObservationRepository playerObservationRepository;

    private final PlayerMapper playerMapper;
    private final PlayerDetailMapper playerDetailMapper;

    private final ClubRepository clubRepository;


    public List<PlayerInfo> getPlayers(PlayersRequest request) {

        List<Player> players;
        if (request.getPlayerName().isEmpty()) {
            players = playerRepository.findPlayersBy(
                    request.getConfederationId(),
                    request.getCountryId(),
                    request.getLeagueId(),
                    request.getClubId());
        } else {
            players = playerRepository.searchPlayersBy(request.getPlayerName());
        }

        List<PlayerInfo> playerInfos = playerMapper.toPlayerInfos(players);
        for (PlayerInfo playerInfo : playerInfos) {
            addDetailedInfo(playerInfo);
        }

        return playerInfos;

    }

    public List<PlayerNameInfo> findAllPlayers() {
        List<Player> players = playerRepository.findAllPlayers();
        return playerMapper.toPlayerNameInfos(players);
    }

    private void addDetailedInfo(PlayerInfo playerInfo) {
        PlayerDetail playerDetail = playerDetailRepository.findPlayerDetailBy(playerInfo.getPlayerId());
        playerInfo.setNationality(playerDetail.getNationality());
        playerInfo.setBirthDate(DateConverter.localDateToString(playerDetail.getBirthDate()));
        playerInfo.setHeight(playerDetail.getHeight());
        playerInfo.setWeight(playerDetail.getWeight());
        boolean observationExists = playerObservationRepository.playerObservationExists(playerInfo.getPlayerId());
        playerInfo.setObservationExists(observationExists);
    }

    @Transactional
    public void addNewPlayer(PlayerDetailInfo playerDetailInfo) {
        handlePlayerNameAvailabilityValidation(playerDetailInfo);
        Player player = createNewPlayer(playerDetailInfo);
        playerRepository.save(player);
        PlayerDetail playerDetail = createNewPlayerDetail(playerDetailInfo);
        playerDetail.setPlayer(player);
        playerDetailRepository.save(playerDetail);
    }

    private PlayerDetail createNewPlayerDetail(PlayerDetailInfo playerDetailInfo) {
        PlayerDetail playerDetail = playerDetailMapper.toPlayerDetail(playerDetailInfo);
        LocalDate dateOfBirth = playerDetailInfo.getBirthDate();
        Period age = Period.between(dateOfBirth, LocalDate.now());
        int ageInYears = age.getYears();
        playerDetail.setAge(ageInYears);
        return playerDetail;
    }

    private void handlePlayerNameAvailabilityValidation(PlayerDetailInfo playerDetailInfo) {
        boolean playerNameExists = playerRepository.playerNameExists(playerDetailInfo.getPlayerName());
        ValidationService.validatePlayerNameAvailable(playerNameExists);
    }

    private Player createNewPlayer(PlayerDetailInfo playerDetailInfo) {
        Club club = clubRepository.getReferenceById(playerDetailInfo.getClubId());
        Player player = playerMapper.toPlayer(playerDetailInfo);
        player.setClub(club);
        return player;
    }

    public PlayerInfo getPlayerDetailInfoById(Integer playerId) {
        PlayerDetail playerDetail = playerDetailRepository.getReferenceById(playerId);
        PlayerInfo playerInfo = playerDetailMapper.toPlayerInfo(playerDetail);
        playerInfo.setObservationExists(playerObservationRepository.playerObservationExists(playerId));
        return playerInfo;

    }
}