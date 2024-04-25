package com.football.managerback.domain.player.position;

import com.football.managerback.manager.player.position.dto.PositionInfo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface PositionMapper {

    @Mapping(source = "id", target = "positionId")
    @Mapping(source = "code", target = "positionCode")
    PositionInfo toPositionInfo(Position position);

    List<PositionInfo> toPositionInfos(List<Position> positions);

}