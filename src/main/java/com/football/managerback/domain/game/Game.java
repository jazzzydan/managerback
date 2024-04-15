package com.football.managerback.domain.game;

import com.football.managerback.domain.club.club.Club;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "game", schema = "manager")
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "home_club_id", nullable = false)
    private Club homeClub;

    @NotNull
    @Column(name = "date", nullable = false)
    private LocalDate date;

}