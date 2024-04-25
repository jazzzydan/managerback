package com.football.managerback.manager.game;

import com.football.managerback.domain.game.Game;
import com.football.managerback.domain.game.GameMapper;
import com.football.managerback.domain.game.GameRepository;
import com.football.managerback.manager.game.dto.GameInfo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class GameService {

    private final GameRepository gameRepository;
    private final GameMapper gameMapper;

    public List<GameInfo> getGames(Integer gameId) {
        List<Game> games = gameRepository.findGamesBy(gameId);
        List<GameInfo> gameInfos = gameMapper.toGameInfos(games);
        return gameInfos;

    }
}
