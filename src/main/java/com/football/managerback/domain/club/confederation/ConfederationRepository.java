package com.football.managerback.domain.club.confederation;

import com.football.managerback.domain.club.confederation.Confederation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ConfederationRepository extends JpaRepository<Confederation, Integer> {
}