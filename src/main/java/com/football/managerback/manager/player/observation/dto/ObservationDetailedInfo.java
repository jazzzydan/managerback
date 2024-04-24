package com.football.managerback.manager.player.observation.dto;

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
public class ObservationDetailedInfo implements Serializable {
    private Integer observationId;
    private Integer gameId;
    private String gameHomeClubName;
    private String gameAwayClubName;
    private String gameDate;
    private Integer userId;
    private Integer playerId;
    private String observationDate;
    private String observationPosition;
    private Integer marking;
    private Integer setPieces;
    private Integer technique;
    private Integer heading;
    private Integer passing;
    private Integer agression;
    private Integer decisions;
    private Integer teamwork;
    private Integer acceleration;
    private Integer pace;
    private Integer stamina;
    private Integer strenght;
    private Integer goals;
    private Integer assists;
    private Integer cards;
    private Integer minutes;
    private String comment;
}