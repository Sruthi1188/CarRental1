package com.ironhack.carrental1.demo;

import com.ironhack.carrental1.model.StationModel;
import com.ironhack.carrental1.service.CarService;
import com.ironhack.carrental1.service.CustomerService;
import com.ironhack.carrental1.service.RentalService;
import com.ironhack.carrental1.service.StationService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
@RequiredArgsConstructor
public class DataLoader implements CommandLineRunner {
    private final CarService carService;
    private final StationService stationService;
    private final CustomerService customerService;
    private final RentalService rentalService;

    @Override
    public void run(String... args) throws Exception {


        carService.addCar("Audi", "Sedan", 57.85, true, new StationModel("Berlin"));
        carService.addCar("BMW", "SUV", 60.50, false, new StationModel("Frankfurt"));
        carService.addCar("Honda", "City", 40.35, true, new StationModel("Aachen"));
        carService.addCar("Toyota", "Crysta", 87.75, false, new StationModel("Stuttgart"));

        stationService.addStation("Berlin");
        stationService.addStation("Frankfurt");
        stationService.addStation("Aachen");
        stationService.addStation("Stuttgart");


        var sarahCustomer = customerService.create("Sarah", "Müller", "sarah@gmail.com");
       var janeCustomer= customerService.create("Jane", "Doe", "jane@gmail.com");
       var markCustomer = customerService.create("Mark", "Bay", "mark@gmail.com");
        var joCustomer = customerService.create("Jo", "May", "jane@gmail.com");


        rentalService.addRental(LocalDate.of(2024, 4, 11), LocalDate.of(2024, 4, 15), sarahCustomer);
         rentalService.addRental(LocalDate.of(2024,5,12),LocalDate.of(2024,5,13),janeCustomer);
         rentalService.addRental(LocalDate.of(2024,6,17),LocalDate.of(2024,6,22),markCustomer);
        rentalService.addRental(LocalDate.of(2024,7,22),LocalDate.of(2024,7,25),joCustomer);


    }
}
