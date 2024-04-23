package com.football.managerback.domain.player.playerobservation;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PlayerObservationRepository extends JpaRepository<PlayerObservation, Integer> {

    @Query("select (count(p) > 0) from PlayerObservation p where p.player.id = :playerId")
    boolean playerObservationExists(Integer playerId);

    @Query("select p from PlayerObservation p where p.user.id = :userId and (p.player.id = :playerId or 0 = :playerId) order by p.date DESC")
    List<PlayerObservation> findObservationsBy(Integer userId, Integer playerId);

}