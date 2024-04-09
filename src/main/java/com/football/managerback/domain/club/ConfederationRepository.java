package com.football.managerback.domain.club;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ConfederationRepository extends JpaRepository<Confederation, Integer> {
    @Query("select l from Confederation l where (l.id = :confederationId or 0 = :cityId) and l.name = :name order by l.name, l.name")
    List<Confederation> findConfederationsBy(Integer confederationId, String name);
}

