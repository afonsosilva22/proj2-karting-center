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

    @PostMapping("/create")
    public RaceKart create(@RequestBody RaceKart raceKart) {
        service.create(raceKart);
        return raceKart;
    }
}
