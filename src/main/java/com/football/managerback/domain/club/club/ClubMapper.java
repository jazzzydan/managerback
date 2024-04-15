package com.football.managerback.domain.club.club;

import com.football.managerback.manager.club.dto.ClubInfo;
import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface ClubMapper {

    @Mapping(source = "id", target = "id")
    @Mapping(source = "league", target = "leagueId")
    @Mapping(source = "city", target = "cityId")
    @Mapping(source = "name", target = "name")
    ClubInfo toClubsInfo(Club club);
    List<ClubInfo> toClubsInfos(List<Club> clubInfos);



}