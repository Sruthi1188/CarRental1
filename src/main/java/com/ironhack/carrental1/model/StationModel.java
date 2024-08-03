package com.ironhack.carrental1.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@Table(name = "stations")

public class StationModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    @Column(name="location")
    private String location;
    @OneToMany(mappedBy = "station")
    private Set<CarModel> carModels = new HashSet<>();

    public StationModel(String location) {
        this.location = location;
    }
}
