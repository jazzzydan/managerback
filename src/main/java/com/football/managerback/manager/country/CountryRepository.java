package com.football.managerback.manager.country;

import com.football.managerback.domain.club.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CountryRepository extends JpaRepository<Country, Integer> {


    @Query("select c from Country c where ( c.confederation.id = :confederationId or 0 = :confederationId) order by c.name")
    List<Country> findCountryBy(Integer confederationId);
}