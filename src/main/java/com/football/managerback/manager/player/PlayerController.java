package com.football.managerback.manager.player;

import com.football.managerback.infrastructure.error.ApiError;
import com.football.managerback.manager.player.dto.PlayerDetailInfo;
import com.football.managerback.manager.player.dto.PlayerInfo;
import com.football.managerback.manager.player.dto.PlayerNameInfo;
import com.football.managerback.manager.player.dto.PlayersRequest;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class PlayerController {
    private PlayerService playerService;

    @PostMapping("/players")
     @Operation(
            summary = "Finds all players data who's status is ACTIVE.",
            description = "Returns detailed player data. POST service used to send JSON as payload for request (multiply dropdown handling)")
    public List<PlayerInfo> getPlayers(@RequestBody PlayersRequest playersRequest) {
        return playerService.getPlayers(playersRequest);
    }

    @PostMapping("/player")
    @Operation(summary = "Add new player.", description = "If player name is available")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "OK"),
            @ApiResponse(responseCode = "403", description = "Sellise nimega mängija on juba olemas", content = @Content(schema = @Schema(implementation = ApiError.class)))})
    public void addNewPlayer(@RequestBody @Valid  PlayerDetailInfo playerDetailInfo) {
        playerService.addNewPlayer(playerDetailInfo);
    }

    @GetMapping("/players/all")
    public List<PlayerNameInfo> findAllPlayers() {
        return playerService.findAllPlayers();
    }

    @DeleteMapping("/player/{playerId}")
    @Operation(summary = "Player removal by playerId",
            description = "Really just player de-activation in DB")
    public void removePlayer(@PathVariable Integer playerId) {
    playerService.removePlayer(playerId);

    }
}


    //todo: lisada ACTIVE statusega mängijate otsimine (hetkel kuvatakse kõik mängijad)
    //todo: kuvada ainult need mängijad kes on sisselogitud scout'i observation'i all






