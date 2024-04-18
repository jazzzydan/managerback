package com.football.managerback.domain.player;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PlayerRepository extends JpaRepository<Player, Integer> {


    @Query("""
            select p from Player p
            where (p.club.league.country.confederation.id = :confederationId or :confederationId = 0 ) 
            and (p.club.league.country.id = :countryId or :countryId = 0)
            and (p.club.league.id = :leagueId  or :leagueId = 0)
            and (p.club.id = :clubId or :clubId = 0)""")
    List<Player> findPlayersBy(Integer confederationId,
                               Integer countryId,
                               Integer leagueId,
                               Integer clubId);

    @Query("select p from Player p where upper(p.name) like upper(concat('%', :playerName, '%'))")
    List<Player> searchPlayersBy(String playerName);

    @Query("select p from Player p where ( p.id = :playerId or 0 = :playerId ) order by p.name")
    List<Player> listPlayersBy(Integer playerId);

    @Query("select (count(p) > 0) from Player p where p.name = :playerName")
    boolean playerNameExists(String playerName);

}