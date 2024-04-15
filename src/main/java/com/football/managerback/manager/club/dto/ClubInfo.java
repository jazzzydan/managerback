package com.football.managerback.manager.club.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * DTO for {@link com.football.managerback.domain.club.Club}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClubInfo implements Serializable {
    private Integer id;
    private Integer leagueId;
    private Integer leagueCountryId;
    @NotNull
    @Size(max = 255)
    private String club_name;
}