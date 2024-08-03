package com.ironhack.carrental1.service;


import com.ironhack.carrental1.model.CarModel;
import com.ironhack.carrental1.model.StationModel;
import com.ironhack.carrental1.repository.CarRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class CarService {
    private final CarRepository carRepository;

    //view all cars

    public List<CarModel> findAll() {

        return carRepository.findAll();
    }
    //add a single car
    public void addCar(String make, String model, double rentalPrice, boolean available, StationModel station) {
        log.info("Add a new car{}", model);
        CarModel car = new CarModel(make, model, rentalPrice, available,station);
         carRepository.save(car);

    }
    //update car by
    public CarModel updateCar(Long carId, CarModel carModel) {
        log.info("Updating car with id{}", carId);
        var carToUpdate = carRepository.findById(carId).orElseThrow();
        carToUpdate.setMake(carModel.getMake());
        carToUpdate.setModel(carModel.getModel());
        return carRepository.save(carToUpdate);
    }






    }

