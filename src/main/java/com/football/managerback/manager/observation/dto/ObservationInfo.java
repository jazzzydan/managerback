package com.football.managerback.manager.observation.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * DTO for {@link com.football.managerback.domain.player.playerobservation.PlayerObservation}
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ObservationInfo implements Serializable {
    private Integer payerObservationId;
    private String date;
    private String gameHomeClubName;
    private String gameAwayClubName;
    private String comment;
}