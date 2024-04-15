package com.football.managerback.manager.club.club.dto;

import com.football.managerback.domain.club.Club;
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
    private Integer clubId;
    private String clubName;
}