package com.football.managerback.domain.player.playerdetail;

import com.football.managerback.manager.player.dto.PlayerDetailInfo;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface PlayerDetailMapper {

    @Mapping(source = "gender", target = "gender")
    @Mapping(source = "birthDate", target = "birthDate")
    @Mapping(source = "height", target = "height")
    @Mapping(source = "weight", target = "weight")
    @Mapping(source = "nationality", target = "nationality")
    @Mapping(source = "bestFoot", target = "bestFoot")
    PlayerDetail toPlayerDetailInfo(PlayerDetailInfo playerDetailInfo);

}