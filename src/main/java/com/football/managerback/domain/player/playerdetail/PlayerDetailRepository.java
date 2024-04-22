package com.football.managerback.domain.player.playerdetail;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface PlayerDetailRepository extends JpaRepository<PlayerDetail, Integer> {

    @Query("select p from PlayerDetail p where p.player.id = :playerId")
    PlayerDetail findPlayerDetailBy(Integer playerId);

}