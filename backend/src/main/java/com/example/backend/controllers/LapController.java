package com.example.backend.controllers;

import com.example.backend.models.Lap;
import com.example.backend.services.LapService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/laps")
@RequiredArgsConstructor
@CrossOrigin(origins ="*")
public class LapController {

    private final LapService service;

    @PostMapping("/add")
    public Lap addNewLap(@RequestBody Lap lap) {
        service.addNew(lap);
        return lap;
    }
}
