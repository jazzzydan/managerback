package com.football.managerback.manager.country;

import com.football.managerback.domain.club.country.Country;
import com.football.managerback.domain.club.country.CountryMapper;
import com.football.managerback.domain.club.country.CountryRepository;
import com.football.managerback.manager.country.dto.CountryInfo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CountryService {

    private final CountryRepository countryRepository;
    private  final CountryMapper countryMapper;

    public List<CountryInfo> getCountries(Integer confederationId) {
        List<Country> countries = countryRepository.findCountryBy(confederationId);
        return countryMapper.toCountryInfos(countries);
    }
}
