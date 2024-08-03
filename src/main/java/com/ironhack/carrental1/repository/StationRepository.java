package com.ironhack.carrental1.repository;

import com.ironhack.carrental1.model.StationModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface StationRepository extends JpaRepository<StationModel, Long> {
}
