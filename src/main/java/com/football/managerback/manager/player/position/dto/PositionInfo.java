package com.football.managerback.manager.player.position.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * DTO for {@link com.football.managerback.domain.player.position.Position}
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PositionInfo implements Serializable {
    private Integer positionId;
    private String positionCode;
}