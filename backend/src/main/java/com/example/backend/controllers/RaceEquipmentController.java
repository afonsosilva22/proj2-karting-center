package com.example.backend.controllers;

import com.example.backend.models.RaceEquipment;
import com.example.backend.services.RaceEquipmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/race-equipments")
@RequiredArgsConstructor
@CrossOrigin(origins ="*")
public class RaceEquipmentController {

    private final RaceEquipmentService service;

    @PostMapping("/create")
    public ResponseEntity<RaceEquipment> create(@RequestBody RaceEquipment raceEquipment) {
        RaceEquipment saved = service.create(raceEquipment);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @GetMapping("/get/all")
    public ResponseEntity<List<RaceEquipment>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/get/{raceId}/{equipmentId}")
    public ResponseEntity<RaceEquipment> getById(@PathVariable Integer raceId, @PathVariable Integer equipmentId) {
        return ResponseEntity.ok(service.getById(raceId, equipmentId));
    }

    @DeleteMapping("/delete/{raceId}/{equipmentId}")
    public ResponseEntity<Void> delete(@PathVariable Integer raceId, @PathVariable Integer equipmentId) {
        service.delete(raceId, equipmentId);
        return ResponseEntity.noContent().build();
    }
}
