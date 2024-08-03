package com.ironhack.carrental1.repository;

import com.ironhack.carrental1.model.RentalModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface RentalRepository extends JpaRepository<RentalModel, Long> {
}
