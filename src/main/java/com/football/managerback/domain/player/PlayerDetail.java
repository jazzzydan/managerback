package com.football.managerback.domain.player;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "player_details", schema = "manager")
public class PlayerDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "player_id", nullable = false)
    private Player player;

    @NotNull
    @Column(name = "gender", nullable = false, length = Integer.MAX_VALUE)
    private String gender;

    @NotNull
    @Column(name = "age", nullable = false)
    private Integer age;

    @NotNull
    @Column(name = "birth_date", nullable = false)
    private LocalDate birthDate;

    @NotNull
    @Column(name = "height", nullable = false)
    private Integer height;

    @NotNull
    @Column(name = "weight", nullable = false)
    private Integer weight;

    @Size(max = 3)
    @NotNull
    @Column(name = "nationality", nullable = false, length = 3)
    private String nationality;

    @NotNull
    @Column(name = "best_foot", nullable = false, length = Integer.MAX_VALUE)
    private String bestFoot;

}