package com.football.managerback.domain.player.observationposition;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ObservationPositionRepository extends JpaRepository<ObservationPosition, Integer> {


    @Query("select o from ObservationPosition o where o.playerObservation.id = :playerObservationId")
    ObservationPosition findObservationPositionBy(Integer playerObservationId);
}