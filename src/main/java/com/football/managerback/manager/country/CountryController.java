package com.football.managerback.manager.country;


import com.football.managerback.manager.country.dto.CountryInfo;
import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class CountryController {

    private CountryService countryService;


    @GetMapping("/countries/{confederationId}")
    @Operation(
            summary = "Leiab süsteemist (andmebaasist country tabelist) kõik riigid confederation ID kaudu.",
            description = "tagastab info CountryName'ga"
    )
    public List<CountryInfo> getCountries(@PathVariable Integer confederationId) {
        return countryService.getCountries(confederationId);
    }

}
