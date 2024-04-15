package com.football.managerback.manager.club;


import com.football.managerback.manager.club.dto.ClubInfo;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class ClubController {

    public ClubService clubService;

    @GetMapping("/clubs")
    public List<ClubInfo> getClubs() {
        List<ClubInfo> clubsList = clubService.getClubs();
        return clubsList;
    }
}
