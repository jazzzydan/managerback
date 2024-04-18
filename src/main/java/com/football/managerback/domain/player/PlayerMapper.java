package com.football.managerback.domain.player;

import com.football.managerback.manager.player.dto.PlayerInfo;
import com.football.managerback.manager.player.dto.PlayerNameInfo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface PlayerMapper {
    @Mapping(source = "id", target = "playerId")
    @Mapping(source = "name", target = "playerName")
    PlayerInfo toPlayerInfo(Player player);

    List<PlayerInfo> toPlayerInfos(List<Player> players);

    List<PlayerNameInfo> toPlayerNameInfos(List<Player> players);
}