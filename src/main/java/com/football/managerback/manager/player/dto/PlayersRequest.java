package com.football.managerback.manager.player.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlayersRequest{
    private Integer confederationId;
    private Integer countryId;
    private Integer leagueId;
    private Integer clubId;
    private String playerName;

}
