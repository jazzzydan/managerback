package com.football.managerback.domain.player;

import com.football.managerback.manager.Status;
import com.football.managerback.manager.player.dto.PlayerDetailInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PlayerRepository extends JpaRepository<Player, Integer> {


    @Query("""
            select p from Player p
            where (p.club.league.country.confederation.id = :confederationId or :confederationId = 0 ) 
            and (p.club.league.country.id = :countryId or :countryId = 0)
            and (p.club.league.id = :leagueId  or :leagueId = 0)
            and (p.club.id = :clubId or :clubId = 0)
            and p.status = :status
            """)
    List<Player> findActivePlayersBy(
            @Param("confederationId") Integer confederationId,
            @Param("countryId") Integer countryId,
            @Param("leagueId") Integer leagueId,
            @Param("clubId") Integer clubId,
            @Param("status") String status);

    @Query("select p from Player p where upper(p.name) like upper(concat('%', :playerName, '%'))")
    List<Player> searchPlayersBy(String playerName);

    @Query("select (count(p) > 0) from Player p where p.name = :playerName")
    boolean playerNameExists(String playerName);

    @Query("select p from Player p order by p.name")
    List<Player> findAllPlayers();

}