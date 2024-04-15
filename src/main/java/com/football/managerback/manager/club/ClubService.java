package com.football.managerback.manager.club;

import com.football.managerback.domain.club.Club;
import com.football.managerback.manager.club.dto.ClubInfo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor


public class ClubService {
    private final ClubRepository clubRepository;
    private final ClubMapper clubMapper;

    public List<ClubInfo> getClubs (Integer leagueId){
        List<Club> clubs = clubRepository.findClubBy(leagueId);
        return clubMapper.toClubInfos(clubs);
    }
}
