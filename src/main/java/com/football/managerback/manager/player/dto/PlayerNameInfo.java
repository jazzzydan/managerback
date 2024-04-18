package com.football.managerback.manager.player.dto;

import lombok.*;

import java.io.Serializable;

/**
 * DTO for {@link com.football.managerback.domain.player.Player}
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PlayerNameInfo implements Serializable {
    private Integer id;
    private String name;
}