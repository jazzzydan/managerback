package com.football.managerback.domain.club.country;

import com.football.managerback.manager.club.country.dto.CountryInfo;
import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface CountryMapper {

    @Mapping(source = "id", target = "countryId")
    @Mapping(source = "name", target = "countryName")
    CountryInfo toCountryInfo(Country country);

    List<CountryInfo> toCountryInfos(List<Country> countries);

}