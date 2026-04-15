package com.example.backend.controllers;

import com.example.backend.models.RaceEquipment;
import com.example.backend.services.RaceEquipmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/race-equipments")
@RequiredArgsConstructor
@CrossOrigin(origins ="*")
public class RaceEquipmentController {

    private final RaceEquipmentService service;

    @PostMapping("/add")
    public RaceEquipment addNewRaceEquipment(@RequestBody RaceEquipment raceEquipment) {
        service.addNew(raceEquipment);
        return raceEquipment;
    }
}
