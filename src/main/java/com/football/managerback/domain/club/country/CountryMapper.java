package com.football.managerback.domain.club.country;

import com.football.managerback.domain.club.country.Country;
import com.football.managerback.manager.country.dto.CountryInfo;
import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface CountryMapper {

    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "country_name")
    CountryInfo toCountryInfo(Country country);

    List<CountryInfo> toCountryInfos(List<Country> countries);

}