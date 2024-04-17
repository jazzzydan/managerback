package com.football.managerback.manager.club.league;


import com.football.managerback.manager.club.league.dto.LeagueInfo;
import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class LeagueController {

    private LeagueService leagueService;


    @GetMapping("/leagues/{countryId}")
    @Operation(summary = "Returns leagues from DB with 'ID",
            description = "tagastab ka midagi")

    public List<LeagueInfo> getLeagues(@PathVariable Integer countryId) {
        List<LeagueInfo> leagueInfos = leagueService.getLeagues(countryId);
        return leagueInfos;
    }

}
