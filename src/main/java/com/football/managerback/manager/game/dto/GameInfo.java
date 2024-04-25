package com.football.managerback.manager.game.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * DTO for {@link com.football.managerback.domain.game.Game}
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class GameInfo implements Serializable {
    private Integer gameId;
    private String gameHomeClubName;
    private String gameAwayClubName;
    @NotNull
    private LocalDate gameDate;
}