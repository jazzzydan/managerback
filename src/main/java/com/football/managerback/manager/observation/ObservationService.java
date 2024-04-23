package com.football.managerback.manager.observation;

import com.football.managerback.domain.player.playerobservation.PlayerObservation;
import com.football.managerback.domain.player.playerobservation.PlayerObservationMapper;
import com.football.managerback.domain.player.playerobservation.PlayerObservationRepository;
import com.football.managerback.manager.observation.dto.ObservationDetailedInfo;
import com.football.managerback.manager.observation.dto.ObservationInfo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ObservationService {

    private final PlayerObservationRepository playerObservationRepository;
    private final PlayerObservationMapper playerObservationMapper;

    public List<ObservationInfo> getObservations(Integer userId, Integer playerId) {

        List<PlayerObservation> playerObservations = playerObservationRepository.findObservationsBy(userId, playerId);
        List<ObservationInfo> observationInfos = playerObservationMapper.toObservationInfos(playerObservations);

        return observationInfos;
    }

    public ObservationDetailedInfo getObservation(Integer observationId) {

        return null;
    }
}
