package com.football.managerback.domain.club.league;

import com.football.managerback.manager.league.dto.LeagueInfo;
import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface LeagueMapper {

    @Mapping(source="id", target="leagueId")
    @Mapping(source="name", target="leagueName")

    LeagueInfo toLeagueinfo(League league);
    List<LeagueInfo> toLeagueInfos(List<League> leagueInfos);


}