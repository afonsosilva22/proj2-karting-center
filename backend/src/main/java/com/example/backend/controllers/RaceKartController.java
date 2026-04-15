package com.example.backend.controllers;

import com.example.backend.models.RaceKart;
import com.example.backend.services.RaceKartService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/race-karts")
@RequiredArgsConstructor
@CrossOrigin(origins ="*")
public class RaceKartController {

    private final RaceKartService service;

    @PostMapping("/add")
    public RaceKart addNewRaceKart(@RequestBody RaceKart raceKart) {
        service.addNew(raceKart);
        return raceKart;
    }
}
