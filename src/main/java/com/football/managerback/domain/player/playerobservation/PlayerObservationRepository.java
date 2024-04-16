package com.football.managerback.domain.player.playerobservation;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PlayerObservationRepository extends JpaRepository<PlayerObservation, Integer> {


    @Query("select (count(p) > 0) from PlayerObservation p where p.player.id = :playerId")
    boolean playerObservationExists(Integer playerId);
}