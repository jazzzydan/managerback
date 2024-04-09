package com.football.managerback.domain.club;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link Confederation}
 */
@Value
public class ConfederationDto implements Serializable {
    Integer id;
    @NotNull
    @Size(max = 255)
    String name;
}