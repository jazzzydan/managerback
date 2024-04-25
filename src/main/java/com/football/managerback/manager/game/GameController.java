package com.football.managerback.manager.game;

import com.football.managerback.manager.game.dto.GameInfo;
import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@AllArgsConstructor
public class GameController {

    private GameService gameService;

    @GetMapping("/game/{gameId}")
    @Operation(summary = "Return game by gameId provided by PathVariable",
    description = "if PathVariable = 0 returns list of all available games")
    public List<GameInfo> getGames(@PathVariable Integer gameId) {
        return gameService.getGames(gameId);
    }
}
