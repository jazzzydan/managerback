package com.football.managerback.manager.player.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * DTO for {@link com.football.managerback.domain.player.Player}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlayerInfo implements Serializable {
    private Integer playerId;
    private String playerName;
    private String nationality;
    private String birthDate;
    private Integer height;
    private Integer weight;
    private Boolean observationExists;
}