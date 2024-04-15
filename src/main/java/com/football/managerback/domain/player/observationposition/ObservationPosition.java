package com.football.managerback.domain.player.observationposition;

import com.football.managerback.domain.player.playerobservation.PlayerObservation;
import com.football.managerback.domain.player.position.Position;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "observation_position", schema = "manager")
public class ObservationPosition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "player_observation_id", nullable = false)
    private PlayerObservation playerObservation;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "position_id", nullable = false)
    private Position position;

}