package com.football.managerback.domain.player.playerdetail;

import com.football.managerback.manager.player.dto.PlayerDetailInfo;
import com.football.managerback.manager.player.dto.PlayerInfo;
import com.football.managerback.util.DateConverter;
import org.antlr.v4.runtime.misc.NotNull;
import org.mapstruct.*;

import java.time.LocalDate;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface PlayerDetailMapper {

    @Mapping(source = "gender", target = "gender")
    @Mapping(source = "birthDate", target = "birthDate", qualifiedByName = "stringToLocalDate")
    @Mapping(source = "height", target = "height")
    @Mapping(source = "weight", target = "weight")
    @Mapping(source = "nationality", target = "nationality")
    @Mapping(source = "bestFoot", target = "bestFoot")
    PlayerDetail toPlayerDetail(PlayerDetailInfo playerDetailInfo);





    @Mapping(source = "player.id", target = "playerId")
    @Mapping(source = "player.name", target = "playerName")
    @Mapping(source = "nationality", target = "nationality")
    @Mapping(source = "birthDate", target = "birthDate", qualifiedByName = "localDateToString")
    @Mapping(source = "height", target = "height")
    @Mapping(source = "weight", target = "weight")
    PlayerInfo toPlayerInfo(PlayerDetail playerDetail);

    @Named("localDateToString")
    static String localDateToString(LocalDate localDate) {
        return DateConverter.localDateToString(localDate);
    }

    @Named("stringToLocalDate")
    static LocalDate stringToLocalDate(String dateString) {
        return DateConverter.stringToLocalDate(dateString);
    }
}