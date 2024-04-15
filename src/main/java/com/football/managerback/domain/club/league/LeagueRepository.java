package com.football.managerback.domain.club.league;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LeagueRepository extends JpaRepository<League, Integer> {
    @Override
    Optional<League> findById(Integer integer);
}