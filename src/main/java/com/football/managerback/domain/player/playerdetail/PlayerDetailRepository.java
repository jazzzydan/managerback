package com.football.managerback.domain.player.playerdetail;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;

public interface PlayerDetailRepository extends JpaRepository<PlayerDetail, Integer> {

    @Query("select p from PlayerDetail p where p.player.id = :playerId")
    PlayerDetail findPlayerDetailBy(Integer playerId);

    @Transactional
    @Modifying
    @Query("""
            update PlayerDetail p set p.player = :player
            where p.gender = :gender and p.age = :age and p.birthDate = :birthDate and p.height = :height and p.weight = :weight and p.nationality = :nationality and p.bestFoot = :bestFoot""")
    int updatePlayer(String gender, Integer age, LocalDate birthDate, Integer height, Integer weight, String nationality, String bestFoot);
}