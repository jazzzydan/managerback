package com.football.managerback.manager.club;

import com.football.managerback.manager.club.dto.ClubInfo;
import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class ClubController {

    private ClubService clubService;

    @GetMapping("/clubs/{leagueId}")
    @Operation(
            summary = "Leiab süsteemist (andmebaasist country tabelist) kõik riigid confederation ID kaudu.",
            description = "tagastab info CountryName'ga"
    )
    public List<ClubInfo> getClubs(@PathVariable Integer leagueId) {
        return clubService.getClubs(leagueId);

    }
}
