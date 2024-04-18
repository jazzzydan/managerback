package com.football.managerback.manager.player.dto;

import com.football.managerback.domain.player.playerdetail.PlayerDetail;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * DTO for {@link PlayerDetail}
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PlayerDetailInfo implements Serializable {
    private String playerName;
    private Integer clubId;
    @NotNull
    private String gender;
    @NotNull
    private LocalDate birthDate;
    @NotNull
    private Integer height;
    @NotNull
    private Integer weight;
    @NotNull
    @Size(max = 3)
    private String nationality;
    @NotNull
    private String bestFoot;
}