package com.football.managerback.domain.player.playerobservation;

import com.football.managerback.manager.player.observation.dto.ObservationDetailedInfo;
import com.football.managerback.manager.player.observation.dto.ObservationInfo;
import com.football.managerback.manager.player.observation.dto.ObservationUpdateInfo;
import com.football.managerback.util.DateConverter;
import org.mapstruct.*;

import java.time.LocalDate;
import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface PlayerObservationMapper {


    @Mapping(source = "id", target = "playerObservationId")
    @Mapping(source = "date", target = "date", qualifiedByName = "localDateToString")
    @Mapping(source = "game.homeClub.name", target = "gameHomeClubName")
    @Mapping(source = "game.awayClub.name", target = "gameAwayClubName")
    @Mapping(source = "comment", target = "comment")
    ObservationInfo toObservationInfo(PlayerObservation playerObservation);

    List<ObservationInfo> toObservationInfos(List<PlayerObservation> playerObservation);

    @Mapping(source = "id", target = "observationId")
    @Mapping(source = "game.id", target = "gameId")
    @Mapping(source = "game.date", target = "gameDate", qualifiedByName = "localDateToString")
    @Mapping(source = "game.homeClub.name", target = "gameHomeClubName")
    @Mapping(source = "game.awayClub.name", target = "gameAwayClubName")
    @Mapping(source = "user.id", target = "userId")
    @Mapping(source = "player.id", target = "playerId")
    @Mapping(source = "date", target = "observationDate")
    @Mapping(source = "marking", target = "marking")
    @Mapping(source = "setPieces", target = "setPieces")
    @Mapping(source = "technique", target = "technique")
    @Mapping(source = "heading", target = "heading")
    @Mapping(source = "passing", target = "passing")
    @Mapping(source = "agression", target = "agression")
    @Mapping(source = "decisions", target = "decisions")
    @Mapping(source = "teamwork", target = "teamwork")
    @Mapping(source = "acceleration", target = "acceleration")
    @Mapping(source = "pace", target = "pace")
    @Mapping(source = "stamina", target = "stamina")
    @Mapping(source = "strenght", target = "strenght")
    @Mapping(source = "goals", target = "goals")
    @Mapping(source = "assists", target = "assists")
    @Mapping(source = "cards", target = "cards")
    @Mapping(source = "minutes", target = "minutes")
    @Mapping(source = "comment", target = "comment")
    ObservationDetailedInfo toObservationDetailedInfo(PlayerObservation playerObservation);



    @Named("localDateToString")
    static String localDateToString(LocalDate date) {
        return DateConverter.localDateToString(date);
    }

    @Named("stringToLocalDate")
    static LocalDate stringToLocalDate(String string) {
        return DateConverter.stringToLocalDate(string);
    }

    @Mapping(source = "date", target = "date", qualifiedByName = "stringToLocalDate")
    @Mapping(source = "marking", target = "marking")
    @Mapping(source = "setPieces", target = "setPieces")
    @Mapping(source = "technique", target = "technique")
    @Mapping(source = "heading", target = "heading")
    @Mapping(source = "passing", target = "passing")
    @Mapping(source = "agression", target = "agression")
    @Mapping(source = "decisions", target = "decisions")
    @Mapping(source = "teamwork", target = "teamwork")
    @Mapping(source = "acceleration", target = "acceleration")
    @Mapping(source = "pace", target = "pace")
    @Mapping(source = "stamina", target = "stamina")
    @Mapping(source = "strenght", target = "strenght")
    @Mapping(source = "goals", target = "goals")
    @Mapping(source = "assists", target = "assists")
    @Mapping(source = "cards", target = "cards")
    @Mapping(source = "minutes", target = "minutes")
    @Mapping(source = "comment", target = "comment")
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    PlayerObservation updatePlayerObservation(ObservationUpdateInfo observationUpdateInfo, @MappingTarget PlayerObservation playerObservation);

}