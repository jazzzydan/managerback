package com.football.managerback.manager.club.league;

import com.football.managerback.domain.club.league.League;
import com.football.managerback.domain.club.league.LeagueMapper;
import com.football.managerback.domain.club.league.LeagueRepository;
import com.football.managerback.manager.club.league.dto.LeagueInfo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class LeagueService {

    private final LeagueRepository leagueRepository;
    private final LeagueMapper leagueMapper;

    public List<LeagueInfo> getLeagues(Integer countryId) {
        List<League> leagues = leagueRepository.findLeaguesBy(countryId);
        return leagueMapper.toLeagueInfos(leagues);
    }


}
