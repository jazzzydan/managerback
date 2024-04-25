package com.football.managerback.manager.player.observation;

import com.football.managerback.manager.player.observation.dto.ObservationDetailedInfo;
import com.football.managerback.manager.player.observation.dto.ObservationInfo;
import com.football.managerback.manager.player.observation.dto.ObservationUpdateInfo;
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

    @PutMapping("/observation/{observationId}")
    @Operation(summary = "Update existing observation",
    description = "Observation date is mandatory field")
    public void updateObservation(@PathVariable Integer observationId, @RequestBody ObservationUpdateInfo observationUpdateInfo) {
        observationService.updateObservation(observationId, observationUpdateInfo);
    }
}
