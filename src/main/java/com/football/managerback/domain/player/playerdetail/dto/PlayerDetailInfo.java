package com.football.managerback.domain.player.playerdetail.dto;

import com.football.managerback.domain.player.playerdetail.PlayerDetail;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * DTO for {@link PlayerDetail}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlayerDetailInfo implements Serializable {
    private String playerName;
    @NotNull
    private LocalDate birthDate;
    @NotNull
    private Integer height;
    @NotNull
    private Integer weight;
    @NotNull
    @Size(max = 3)
    private String nationality;
}