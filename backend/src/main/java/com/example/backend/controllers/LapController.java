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

    @PostMapping("/create")
    public Lap create(@RequestBody Lap lap) {
        service.create(lap);
        return lap;
    }
}
