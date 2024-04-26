package com.football.managerback.manager.player.observation;

import com.football.managerback.domain.game.Game;
import com.football.managerback.domain.game.GameRepository;
import com.football.managerback.domain.player.observationposition.ObservationPosition;
import com.football.managerback.domain.player.observationposition.ObservationPositionRepository;
import com.football.managerback.domain.player.playerobservation.PlayerObservation;
import com.football.managerback.domain.player.playerobservation.PlayerObservationMapper;
import com.football.managerback.domain.player.playerobservation.PlayerObservationRepository;
import com.football.managerback.domain.player.position.Position;
import com.football.managerback.domain.player.position.PositionRepository;
import com.football.managerback.manager.player.observation.dto.ObservationDetailedInfo;
import com.football.managerback.manager.player.observation.dto.ObservationInfo;
import com.football.managerback.manager.player.observation.dto.ObservationUpdateInfo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ObservationService {

    private final PlayerObservationRepository playerObservationRepository;
    private final ObservationPositionRepository observationPositionRepository;

    private final PlayerObservationMapper playerObservationMapper;
    private final GameRepository gameRepository;
    private final PositionRepository positionRepository;

    public List<ObservationInfo> getObservations(Integer userId, Integer playerId) {

        List<PlayerObservation> playerObservations = playerObservationRepository.findObservationsBy(userId, playerId);
        List<ObservationInfo> observationInfos = playerObservationMapper.toObservationInfos(playerObservations);

        return observationInfos;
    }

    public ObservationDetailedInfo getObservation(Integer playerObservationId) {

        PlayerObservation playerObservation = playerObservationRepository.getReferenceById(playerObservationId);
        ObservationDetailedInfo observationDetailedInfo = playerObservationMapper.toObservationDetailedInfo(playerObservation);

        Optional<ObservationPosition> observationPositionOptional = observationPositionRepository.getOptionalObservationPositionBy(playerObservationId);
        if (observationPositionOptional.isPresent()) {
            ObservationPosition observationPosition = observationPositionOptional.get();
            observationDetailedInfo.setPositionId(observationPosition.getPosition().getId());
        } else {
            observationDetailedInfo.setPositionId(0);
        }

        return observationDetailedInfo;
    }

    @Transactional
    public void updateObservation(Integer playerObservationId, ObservationUpdateInfo observationUpdateInfo) {
        PlayerObservation playerObservation = playerObservationRepository.getReferenceById(playerObservationId);
        playerObservationMapper.updatePlayerObservation(observationUpdateInfo, playerObservation);

//        add following if new observation to be added:
//        handleUserUpdate(observationUpdateInfo, playerObservation);
//        handlePlayerUpdate(observationUpdateInfo, playerObservation);

        handleGameUpdate(observationUpdateInfo, playerObservation);
        playerObservationRepository.save(playerObservation);

        handleObservationPositionUpdate(observationUpdateInfo, playerObservation);
    }

    private void handleGameUpdate(ObservationUpdateInfo observationUpdateInfo, PlayerObservation playerObservation) {
        if (!haveSameGameId(observationUpdateInfo, playerObservation)) {
            Game game = gameRepository.getReferenceById(observationUpdateInfo.getGameId());
            playerObservation.setGame(game);
        }
    }

    private boolean haveSameGameId(ObservationUpdateInfo observationUpdateInfo, PlayerObservation playerObservation) {
        return playerObservation.getGame().getId().equals(observationUpdateInfo.getGameId());
    }

    private void handleObservationPositionUpdate(ObservationUpdateInfo observationUpdateInfo, PlayerObservation playerObservation) {
        Integer observationPositionId = observationUpdateInfo.getPositionId();
        Integer playerObservationId = playerObservation.getId();
        if(observationPositionId == 0) {
            observationPositionRepository.deleteObservationPositionBy(playerObservationId);
        } else {
            observationPositionRepository.deleteObservationPositionBy(playerObservationId);
            createAndSaveObservationPosition(observationUpdateInfo, playerObservation);
        }
    }

    private void createAndSaveObservationPosition(ObservationUpdateInfo observationUpdateInfo, PlayerObservation observation) {
        Position position = positionRepository.getReferenceById(observationUpdateInfo.getPositionId());
        ObservationPosition observationPosition = new ObservationPosition();
        observationPosition.setPosition(position);
        observationPosition.setPlayerObservation(observation);
        observationPositionRepository.save(observationPosition);
    }

}
