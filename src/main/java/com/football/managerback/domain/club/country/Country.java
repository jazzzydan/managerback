package com.football.managerback.domain.club.country;

import com.football.managerback.domain.club.Confederation;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "country", schema = "manager")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "confederation_id", nullable = false)
    private Confederation confederation;

    @Size(max = 255)
    @NotNull
    @Column(name = "name", nullable = false)
    private String name;


}