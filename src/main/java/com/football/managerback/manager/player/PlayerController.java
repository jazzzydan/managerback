package com.football.managerback.manager.player;

import com.football.managerback.manager.player.dto.PlayerInfo;
import com.football.managerback.manager.player.dto.PlayersRequest;
import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class PlayerController {
    private PlayerService playerService;

    @PostMapping ("/players")
    @Operation(
            summary = "Finds all players data who's status is ACTIVE.",
            description = "Returns detailed player data. POST service used to send JSON as payload for request (multiply dropdown handling)")
    public List<PlayerInfo> getPlayers(@RequestBody PlayersRequest playersRequest){
       return playerService.getPlayers(playersRequest);
    }

    //todo: lisada ACTIVE statusega mängijate otsimine (hetkel kuvatakse kõik mängijad)
    //todo: kuvada ainult need mängijad kes on sisselogitud scout'i observation'i all

}


