package com.ironhack.carrental1.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@Table(name="rental")


public class RentalModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")

    private long id;
//    @ManyToOne
//    @JoinColumn(name ="car_id")

// private CarModel carModel;
    @ManyToOne
    @JoinColumn(referencedColumnName ="id")
    private CustomerModel customer;
    @Column(name="start_Date")

    private LocalDate startDate;
    @Column(name="end_Date")
    private LocalDate endDate;

    public RentalModel(LocalDate startDate, LocalDate endDate,CustomerModel customer) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.customer= customer;
    }
}
