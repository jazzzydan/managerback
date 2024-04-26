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
import com.football.managerback.manager.Status;
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
    private final ClubRepository clubRepository;

    private final PlayerMapper playerMapper;
    private final PlayerDetailMapper playerDetailMapper;

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

    public PlayerDetailInfo getPlayerDetailInfoById(Integer playerId) {
        PlayerDetail playerDetail = playerDetailRepository.findPlayerDetailBy(playerId);

        Player player = playerRepository.getReferenceById(playerId);
        Integer clubId = player.getClub().getId();

        PlayerDetailInfo playerDetailInfo = playerDetailMapper.toPlayerDetailInfo(playerDetail);
        playerDetailInfo.setClubId(clubId);
        return playerDetailInfo;
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

    @Transactional
    public void updatePlayer(Integer playerId, PlayerDetailInfo playerDetailInfo) {

        PlayerDetail playerDetail = playerDetailRepository.findPlayerDetailBy(playerId);
        playerDetailMapper.toPlayerDetailUpdate(playerDetailInfo, playerDetail);

        Club club = clubRepository.getReferenceById(playerDetailInfo.getClubId());
        Player player = playerRepository.getReferenceById(playerId);
        player.setName(playerDetailInfo.getPlayerName());
        player.setClub(club);
        playerRepository.save(player);

        playerDetailRepository.save(playerDetail);
    }

    private PlayerDetail createNewPlayerDetail(PlayerDetailInfo playerDetailInfo) {
        PlayerDetail playerDetail = playerDetailMapper.toPlayerDetailUpdate(playerDetailInfo);
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

    public void removePlayer(Integer playerId) {
        Player player = playerRepository.getReferenceById(playerId);
        player.setStatus(Status.DEACTIVATED);
        playerRepository.save(player);
    }


}