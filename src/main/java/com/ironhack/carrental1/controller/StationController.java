package com.ironhack.carrental1.controller;

import com.ironhack.carrental1.model.StationModel;
import com.ironhack.carrental1.service.StationService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/stations")

public class StationController {
    private final StationService stationService;

    @GetMapping
    public List<StationModel> findAll() {
        return stationService.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void  addStation(@RequestBody @Valid StationModel stationModel) {
        stationService.addStation(stationModel.getLocation());
    }
    @PutMapping("/{stationId}")
    public StationModel updateStation(@PathVariable("stationId") Long stationId, @RequestBody @Valid StationModel stationModel) {
        return stationService.updateStation(stationId, stationModel);
    }
}
