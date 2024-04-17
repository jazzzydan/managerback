package com.football.managerback.manager.club.league.dto;

import com.football.managerback.domain.club.league.League;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * DTO for {@link League}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LeagueInfo implements Serializable {
    private Integer leagueId;
    private Integer countryId;
    private String leagueName;
}