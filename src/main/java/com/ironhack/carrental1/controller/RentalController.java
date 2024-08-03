package com.ironhack.carrental1.controller;

import com.ironhack.carrental1.model.RentalModel;

import com.ironhack.carrental1.service.RentalService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/rentals")

public class RentalController {
    private final RentalService rentalService;

    @GetMapping
    public List<RentalModel> findAll() {
        return rentalService.findAll();
    }

    @PutMapping("/{rentalId}")
    public void updateRental(@PathVariable("rentalId") Long rentalId, @RequestBody @Valid RentalModel rentalModel) {
         rentalService.updateRental(rentalId, rentalModel);
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addRental(@RequestBody @Valid RentalModel rentalModel) {
        rentalService.addRental(rentalModel.getStartDate(), rentalModel.getEndDate(),rentalModel.getCustomer());
    }

}
