package com.ironhack.carrental1.controller;

import com.ironhack.carrental1.model.CarModel;
import com.ironhack.carrental1.service.CarService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
@RequiredArgsConstructor

public class CarController {
    private final CarService carService;

    @GetMapping
    public List<CarModel> findAll() {

        return carService.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addCar(@RequestBody @Valid CarModel carModel) {
         carService.addCar(carModel.getMake(), carModel.getModel(), carModel.getRentalPrice(), carModel.isAvailable(),carModel.getStation());
    }
    @PutMapping("/{carId}")
    public CarModel updateCar(@PathVariable ("carId")Long carId, @RequestBody @Valid CarModel carModel) {
        return carService.updateCar(carId, carModel);
    }


}








