package com.football.managerback.domain.club.league;

import com.football.managerback.manager.league.dto.LeagueInfo;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface LeagueMapper {
//
//    @Mapping(source = "id", target = "LeagueId")
//    @Mapping(source = "name", target = "LeagueName")
//    LeagueInfo toLeagueInfo(League league);
//


}

