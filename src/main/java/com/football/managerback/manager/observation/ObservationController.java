package com.football.managerback.manager.observation;

import com.football.managerback.manager.observation.dto.ObservationDetailedInfo;
import com.football.managerback.manager.observation.dto.ObservationInfo;
import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class ObservationController {
    private ObservationService observationService;

    @GetMapping("/observations")
    @Operation(summary = "Finds all observations data for particular player.",
    description = "If no player selected -> for all players. Returns list of observations.")
    public List<ObservationInfo> getObservations(@RequestParam Integer userId, @RequestParam Integer playerId) {
        List<ObservationInfo> observationInfos = observationService.getObservations(userId, playerId);
        return observationInfos;
    }

    @GetMapping("/observation/{observationId}")
    @Operation(summary = "Finds observation by id",
    description = "Returns desired observation")
    public ObservationDetailedInfo getObservation(@PathVariable Integer observationId) {
        return observationService.getObservation(observationId);
    }
}
