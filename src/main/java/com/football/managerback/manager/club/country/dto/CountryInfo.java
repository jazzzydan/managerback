package com.football.managerback.manager.club.country.dto;

import com.football.managerback.domain.club.country.Country;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * DTO for {@link Country}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CountryInfo implements Serializable {
    private Integer countryId;
    @NotNull
    @Size(max = 255)
    private String countryName;
}