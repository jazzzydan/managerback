package com.football.managerback.domain.player;

import com.football.managerback.domain.club.Club;
import com.football.managerback.domain.player.playerdetail.PlayerDetail;
import com.football.managerback.manager.club.club.dto.ClubInfo;
import com.football.managerback.manager.player.dto.PlayerInfo;
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

    @Mapping(source = "id", target = "clubId")
    @Mapping(source = "name", target = "clubName")
    ClubInfo toClubInfo(Club club);

    @Mapping(source = "birthDate",target = "birthDate")
    @Mapping(source = "height",target = "height")
    @Mapping(source = "weight",target = "weight")
    @Mapping(source = "nationality",target = "nationality")
    PlayerDetail toPlayerDetailInfo(PlayerDetail playerDetail);
}