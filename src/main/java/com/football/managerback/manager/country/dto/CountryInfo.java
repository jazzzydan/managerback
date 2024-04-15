package com.football.managerback.manager.country.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * DTO for {@link com.football.managerback.domain.club.Country}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CountryInfo implements Serializable {
    private Integer id;
    private Integer confederationId;
    @NotNull
    @Size(max = 255)
    private String country_name;
}