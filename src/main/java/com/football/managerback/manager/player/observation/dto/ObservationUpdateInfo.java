package com.football.managerback.manager.player.observation.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * DTO for {@link com.football.managerback.domain.player.playerobservation.PlayerObservation}
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ObservationUpdateInfo implements Serializable {
    private Integer gameId;
    private Integer userId;
    private Integer playerId;
    private Integer observationPositionId;
    @NotNull
    private LocalDate date;
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
    @Size(max = 255)
    private String comment;
}