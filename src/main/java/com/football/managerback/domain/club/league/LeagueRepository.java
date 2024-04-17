package com.football.managerback.domain.club.league;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface LeagueRepository extends JpaRepository<League, Integer> {


    // lisada kõikide liigade kuvamine 0 puhul
//    @Query("select c from Club c where (c.league.id = :leagueId or 0 = :leagueId) order by c.name")
//    List<Club> findClubBy(Integer leagueId);

    @Query("select l from League l where (l.country.id = :leagueId or 0 = :leagueId) order by l.name")
    List<League> findLeaguesBy(Integer leagueId);
}