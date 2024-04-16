package com.football.managerback.manager.player;

import com.football.managerback.manager.player.dto.PlayerInfo;
import com.football.managerback.manager.player.dto.PlayersRequest;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class PlayerController {
    private PlayerService playerService;

    @PostMapping ("/players")
    public List<PlayerInfo> getPlayers(@RequestBody PlayersRequest playersRequest){
       return playerService.getPlayers(playersRequest);
    }


}


