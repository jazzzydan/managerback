package com.football.managerback.domain.club.confederation;

import com.football.managerback.manager.club.confederation.dto.ConfederationInfo;
import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface ConfederationMapper {

    @Mapping(source = "id", target = "confederationId")
    @Mapping(source = "name", target = "confederationName")
    @Mapping(source = "description", target = "confederationDescription")
    ConfederationInfo toConfederationInfo(Confederation confederation);


    List<ConfederationInfo> toConfederationInfos(List<Confederation> confederations);


}