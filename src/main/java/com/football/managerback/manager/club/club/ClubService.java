package com.football.managerback.manager.club.club;

import com.football.managerback.domain.club.Club;
import com.football.managerback.domain.club.ClubMapper;
import com.football.managerback.domain.club.ClubRepository;
import com.football.managerback.manager.club.club.dto.ClubInfo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor


public class ClubService {
    private final ClubRepository clubRepository;
    private final ClubMapper clubMapper;

    public List<ClubInfo> getClubs(Integer leagueId) {
        List<Club> clubs = clubRepository.findClubBy(leagueId);
        return clubMapper.toClubInfos(clubs);
    }
}
