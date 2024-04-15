package com.football.managerback.manager.league.dto;

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
    private Integer Id;
    private Integer LeagueId;
    private String LeagueName;
}