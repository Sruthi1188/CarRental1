package com.ironhack.carrental1.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "cars")

public class CarModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
    private Long id;
    @Column(name ="make")
    private String make;
    @Column(name="model")
    private String model;
    @Column(name="rental_price")
    private double rentalPrice;
    @Column(name="available")
    private boolean available;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "station_id")
    private StationModel station;

    public CarModel(String make, String model, double rentalPrice, boolean available,StationModel station) {
        this.make = make;
        this.model = model;
        this.rentalPrice = rentalPrice;
        this.available = available;
        this.station = station;
    }
}
