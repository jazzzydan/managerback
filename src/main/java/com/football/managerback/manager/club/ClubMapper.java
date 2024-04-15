package com.football.managerback.manager.club;

import com.football.managerback.domain.club.Club;
import com.football.managerback.manager.club.dto.ClubInfo;
import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface ClubMapper {
    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "club_name")
    ClubInfo toClubInfo(Club club);

    List<ClubInfo> toClubInfos(List<Club> clubs);
}