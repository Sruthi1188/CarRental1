package com.ironhack.carrental1.repository;

import com.ironhack.carrental1.model.CarModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CarRepository extends JpaRepository<CarModel,Long> {
}
