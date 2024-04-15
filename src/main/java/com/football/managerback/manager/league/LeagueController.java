package com.football.managerback.manager.league;

import com.football.managerback.manager.league.dto.LeagueInfo;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class LeagueController {

    private LeagueService leagueService;

    @GetMapping("/leagues")
    public List<LeagueInfo> getLeagues() {
        List<LeagueInfo> allLeagues = leagueService.getAllLeagues();
        return allLeagues;
    }

}
