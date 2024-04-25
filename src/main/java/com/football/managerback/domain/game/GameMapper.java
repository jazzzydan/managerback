package com.football.managerback.domain.game;

import com.football.managerback.manager.game.dto.GameInfo;
import com.football.managerback.util.DateConverter;
import org.mapstruct.*;

import java.time.LocalDate;
import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface GameMapper {

    @Mapping(source = "id", target = "gameId")
    @Mapping(source = "date", target = "gameDate", qualifiedByName = "localDateToString")
    @Mapping(source = "homeClub.name", target = "gameHomeClubName")
    @Mapping(source = "awayClub.name", target = "gameAwayClubName")
    GameInfo toGameInfo(Game game);

    List<GameInfo> toGameInfos(List<Game> games);

    @Named("localDateToString")
    static String localDateToString(LocalDate date) {
        return DateConverter.localDateToString(date);
    }
}