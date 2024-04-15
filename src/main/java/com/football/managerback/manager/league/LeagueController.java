package com.football.managerback.manager.league;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class LeagueController {

    private LeagueService leagueService;

    public void getAllLeagues() {

    }

}
