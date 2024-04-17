package com.football.managerback.domain.club.league;

import com.football.managerback.domain.club.country.Country;
import com.football.managerback.manager.club.country.dto.CountryInfo;
import com.football.managerback.manager.club.league.dto.LeagueInfo;
import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface LeagueMapper {

    @Mapping(source = "id", target = "leagueId")
    @Mapping(source = "name", target = "leagueName")
    LeagueInfo toLeagueInfos(League league);

    List<LeagueInfo> toLeagueInfos(List<League> leagues);
}