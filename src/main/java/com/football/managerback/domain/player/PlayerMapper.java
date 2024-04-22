package com.football.managerback.domain.player;

import com.football.managerback.domain.player.playerdetail.PlayerDetail;
import com.football.managerback.manager.Status;
import com.football.managerback.manager.player.dto.PlayerDetailInfo;
import com.football.managerback.manager.player.dto.PlayerInfo;
import com.football.managerback.manager.player.dto.PlayerNameInfo;
import com.football.managerback.manager.player.dto.PlayersRequest;
import org.apache.catalina.Manager;
import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface PlayerMapper {
    @Mapping(source = "id", target = "playerId")
    @Mapping(source = "name", target = "playerName")
    PlayerInfo toPlayerInfo(Player player);

    List<PlayerInfo> toPlayerInfos(List<Player> players);


    @Mapping(source = "id", target = "playerId")
    @Mapping(source = "name", target = "playerName")
    PlayerNameInfo toPlayerNameInfo(Player players);

    List<PlayerNameInfo> toPlayerNameInfos(List<Player> players);

    @Mapping(source = "playerName", target = "name")
    @Mapping(constant = Status.ACTIVE, target = "status")
    Player toPlayer(PlayerDetailInfo playerDetailInfo);

}