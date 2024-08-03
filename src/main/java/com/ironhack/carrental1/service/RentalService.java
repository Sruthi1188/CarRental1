package com.ironhack.carrental1.service;

import com.ironhack.carrental1.model.CustomerModel;
import com.ironhack.carrental1.model.RentalModel;
import com.ironhack.carrental1.repository.RentalRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j

public class RentalService {
    private final RentalRepository rentalRepository;

    //view all rental
public List<RentalModel> findAll() {

    return rentalRepository.findAll();
}
 //add new rental
    public void addRental(LocalDate startDate, LocalDate endDate, CustomerModel customer) {
    log.info("Adding rental :{}", startDate);
    log.info("Adding rental :{}", endDate);
    RentalModel rental = new RentalModel(startDate, endDate,customer);
    rentalRepository.save(rental);

    }

    //update a rental
    public void updateRental(Long rentalId, RentalModel rentalModel) {
    log.info("Updating rental with id{} ", rentalId);
    var rentalToUpdate = rentalRepository.findById(rentalId).orElseThrow();
     rentalRepository.save(rentalToUpdate);

    }


}


