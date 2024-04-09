package com.football.managerback.domain.player;

import com.football.managerback.domain.user.User;
import com.football.managerback.domain.game.Game;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "player_observation", schema = "manager")
public class PlayerObservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "game_id", nullable = false)
    private Game game;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "player_id", nullable = false)
    private Player player;

    @NotNull
    @Column(name = "date", nullable = false)
    private LocalDate date;

    @Column(name = "marking")
    private Integer marking;

    @Column(name = "set_pieces")
    private Integer setPieces;

    @Column(name = "technique")
    private Integer technique;

    @Column(name = "heading")
    private Integer heading;

    @Column(name = "passing")
    private Integer passing;

    @Column(name = "agression")
    private Integer agression;

    @Column(name = "decisions")
    private Integer decisions;

    @Column(name = "teamwork")
    private Integer teamwork;

    @Column(name = "acceleration")
    private Integer acceleration;

    @Column(name = "pace")
    private Integer pace;

    @Column(name = "stamina")
    private Integer stamina;

    @Column(name = "strenght")
    private Integer strenght;

    @Column(name = "goals")
    private Integer goals;

    @Column(name = "assists")
    private Integer assists;

    @Column(name = "cards")
    private Integer cards;

    @Column(name = "minutes")
    private Integer minutes;

}