package com.football.managerback.manager.club;

import com.football.managerback.domain.club.Club;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface
ClubRepository extends JpaRepository<Club, Integer> {
    @Query("select c from Club c where (c.league.id = :leagueId or 0 = :leagueId) order by c.name")
    List<Club> findClubBy(Integer leagueId);
}