package com.ironhack.carrental1.service;

import com.ironhack.carrental1.model.StationModel;
import com.ironhack.carrental1.repository.StationRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class StationService {
    private final StationRepository stationRepository;

    //view all stations
    public List<StationModel> findAll() {
        return stationRepository.findAll();
    }


    //add a new station
    public void addStation(String location) {
        log.info("Add a new station{} " , location);
        StationModel station = new StationModel(location);
        stationRepository.save(station);


    }


    //update a station
    public StationModel updateStation(Long stationId, StationModel stationModel) {
        log.info("Updating station with id{}", stationId);
        var stationToUpdate = stationRepository.findById(stationId).orElseThrow();
        stationToUpdate.setLocation(stationModel.getLocation());
        return stationRepository.save(stationToUpdate);


    }
    }

