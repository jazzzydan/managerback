package com.football.managerback.domain.player.observationposition;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

public interface ObservationPositionRepository extends JpaRepository<ObservationPosition, Integer> {


    @Query("select o from ObservationPosition o where o.playerObservation.id = :playerObservationId")
   Optional <ObservationPosition> getOptionalObservationPositionBy(Integer playerObservationId);

    @Transactional
    @Modifying
    @Query("delete from ObservationPosition o where o.playerObservation.id = :playerObservationId")
    void deleteObservationPositionBy(Integer playerObservationId);





}