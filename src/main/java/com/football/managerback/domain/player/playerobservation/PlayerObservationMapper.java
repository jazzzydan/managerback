package com.football.managerback.domain.player.playerobservation;

import com.football.managerback.manager.observation.dto.ObservationInfo;
import com.football.managerback.util.DateConverter;
import org.mapstruct.*;

import java.time.LocalDate;
import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface PlayerObservationMapper {


    @Mapping(source = "id", target = "payerObservationId")
    @Mapping(source = "date", target = "date", qualifiedByName = "localDateToString")
    @Mapping(source = "game.homeClub.name", target = "gameHomeClubName")
    @Mapping(source = "game.awayClub.name", target = "gameAwayClubName")
    @Mapping(source = "comment", target = "comment")
    ObservationInfo toObservationInfo(PlayerObservation playerObservation);

    List<ObservationInfo> toObservationInfos(List<PlayerObservation> playerObservation);

    @Named("localDateToString")
    static String localDateToString(LocalDate date) {
        return DateConverter.localDateToString(date);
    }
}