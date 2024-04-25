package com.football.managerback.domain.game;

import com.football.managerback.manager.game.dto.GameInfo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface GameMapper {

    @Mapping(source = "id", target = "gameId")
    @Mapping(source = "date", target = "gameDate")
    @Mapping(source = "homeClub.name", target = "gameHomeClubName")
    @Mapping(source = "awayClub.name", target = "gameAwayClubName")
    GameInfo toGameInfo(Game game);

    List<GameInfo> toGameInfos(List<Game> games);
}