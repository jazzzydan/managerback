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

    public ObservationDetailedInfo getObservation(Integer observationId) {

        PlayerObservation playerObservation = playerObservationRepository.getReferenceById(observationId);
        ObservationDetailedInfo observationDetailedInfo = playerObservationMapper.toObservationDetailedInfo(playerObservation);

//        todo: kontrollida, kas parandab observationPosition redigeerimisel

        Optional<ObservationPosition> observationPositionOptional = observationPositionRepository.findById(observationId);
        if (observationPositionOptional.isPresent()) {
            ObservationPosition observationPosition = observationPositionOptional.get();
            observationDetailedInfo.setObservationPositionId(observationPosition.getPosition().getId());
        } else {
            observationDetailedInfo.setObservationPositionId(0);
        }

        return observationDetailedInfo;
    }

    @Transactional
    public void updateObservation(Integer observationId, ObservationUpdateInfo observationUpdateInfo) {
        PlayerObservation observation = playerObservationRepository.getReferenceById(observationId);
        playerObservationMapper.updateObservation(observationUpdateInfo, observation);
//        handleUserUpdate(observationUpdateInfo, observation);
//        handlePlayerUpdate(observationUpdateInfo, observation);
        handleGameUpdate(observationUpdateInfo, observation);
        handleObservationPositionUpdate(observationUpdateInfo, observation);

        playerObservationRepository.save(observation);

    }

    private void handleGameUpdate(ObservationUpdateInfo observationUpdateInfo, PlayerObservation observation) {
        if (!haveSameGameId(observationUpdateInfo, observation)) {
            Game game = gameRepository.getReferenceById(observationUpdateInfo.getGameId());
            observation.setGame(game);
        }
    }

    private boolean haveSameGameId(ObservationUpdateInfo observationUpdateInfo, PlayerObservation observation) {
        return observation.getGame().getId().equals(observationUpdateInfo.getGameId());
    }

    private void handleObservationPositionUpdate(ObservationUpdateInfo observationUpdateInfo, PlayerObservation observation) {
        Integer observationPositionId = observationUpdateInfo.getObservationPositionId();
        if(observationPositionId == 0) {
            observationPositionRepository.deleteObservationPositionBy(observation.getId());
        } else {
            observationPositionRepository.deleteObservationPositionBy(observation.getId());
            createAndSaveObservationPosition(observationUpdateInfo, observation);
        }
    }

    private void createAndSaveObservationPosition(ObservationUpdateInfo observationUpdateInfo, PlayerObservation observation) {
        Position position = positionRepository.getReferenceById(observationUpdateInfo.getObservationPositionId());
        ObservationPosition observationPosition = new ObservationPosition();
        observationPosition.setPosition(position);
        observationPosition.setPlayerObservation(observation);
        observationPositionRepository.save(observationPosition);
    }

}
