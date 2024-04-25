package com.football.managerback.domain.game;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GameRepository extends JpaRepository<Game, Integer> {


    @Query("select g from Game g where (g.id = :gameId or 0 = :gameId) order by g.date DESC")
    List<Game> findGamesBy(Integer gameId);
}