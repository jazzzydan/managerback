package com.football.managerback.domain.club;

import com.football.managerback.manager.club.club.dto.ClubInfo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface ClubMapper {
    @Mapping(source = "id", target = "clubId")
    @Mapping(source = "name", target = "clubName")
    ClubInfo toClubInfo(Club club);

    List<ClubInfo> toClubInfos(List<Club> clubs);
}