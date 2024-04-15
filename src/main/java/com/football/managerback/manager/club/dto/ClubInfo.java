package com.football.managerback.manager.club.dto;

import com.football.managerback.domain.club.club.Club;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * DTO for {@link Club}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClubInfo implements Serializable {
    private Integer id;
    private Integer leagueId;
    private Integer cityId;
    private String name;
}