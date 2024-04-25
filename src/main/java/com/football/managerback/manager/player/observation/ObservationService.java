package com.football.managerback.manager.player.observation;

import com.football.managerback.domain.player.observationposition.ObservationPosition;
import com.football.managerback.domain.player.observationposition.ObservationPositionRepository;
import com.football.managerback.domain.player.playerobservation.PlayerObservation;
import com.football.managerback.domain.player.playerobservation.PlayerObservationMapper;
import com.football.managerback.domain.player.playerobservation.PlayerObservationRepository;
import com.football.managerback.manager.player.observation.dto.ObservationDetailedInfo;
import com.football.managerback.manager.player.observation.dto.ObservationInfo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ObservationService {

    private final PlayerObservationRepository playerObservationRepository;
    private final ObservationPositionRepository observationPositionRepository;

    private final PlayerObservationMapper playerObservationMapper;

    public List<ObservationInfo> getObservations(Integer userId, Integer playerId) {

        List<PlayerObservation> playerObservations = playerObservationRepository.findObservationsBy(userId, playerId);
        List<ObservationInfo> observationInfos = playerObservationMapper.toObservationInfos(playerObservations);

        return observationInfos;
    }

    public ObservationDetailedInfo getObservation(Integer observationId) {

        PlayerObservation playerObservation = playerObservationRepository.getReferenceById(observationId);
        ObservationDetailedInfo observationDetailedInfo = playerObservationMapper.toObservationDetailedInfo(playerObservation);

        ObservationPosition observationPosition = observationPositionRepository.findObservationPositionBy(observationId);
        observationDetailedInfo.setObservationPositionId(observationPosition.getPosition().getId());

        return observationDetailedInfo;
    }
}
