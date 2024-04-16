package com.football.managerback.domain.player.playerdetail;

import com.football.managerback.domain.player.playerdetail.dto.PlayerDetailInfo;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface PlayerDetailMapper {
    @Mapping(source = "playerName", target = "player.name")
    PlayerDetail toPlayerDetailInfo (PlayerDetailInfo playerDetailInfo);

    @Mapping(source = "player.name", target = "playerName")
    PlayerDetailInfo toDto(PlayerDetail playerDetail);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(source = "playerName", target = "player.name")
    PlayerDetail partialUpdate(PlayerDetailInfo playerDetailInfo, @MappingTarget PlayerDetail playerDetail);
}