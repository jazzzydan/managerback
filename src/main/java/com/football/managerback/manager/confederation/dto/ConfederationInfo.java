package com.football.managerback.manager.confederation.dto;

import com.football.managerback.domain.club.confederation.Confederation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * DTO for {@link Confederation}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConfederationInfo implements Serializable {
    private Integer confederationId;
    private String confederationName;
    private String confederationDescription;
}