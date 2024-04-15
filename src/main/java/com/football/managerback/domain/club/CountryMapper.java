package com.football.managerback.domain.club;

import com.football.managerback.manager.country.dto.CountryInfo;
import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface CountryMapper {

    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    Country toCountryInfo(Country country);

    List<CountryInfo> toCountryInfos(List<Country>countries);

}