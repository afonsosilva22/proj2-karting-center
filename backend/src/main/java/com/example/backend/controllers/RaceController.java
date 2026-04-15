package com.example.backend.controllers;

import com.example.backend.models.Race;
import com.example.backend.services.RaceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/races")
@RequiredArgsConstructor
@CrossOrigin(origins ="*")
public class RaceController {

    private final RaceService service;

    @PostMapping("/add")
    public Race addNewRace(@RequestBody Race race) {
        service.addNew(race);
        return race;
    }
}
