package com.example.backend.controllers;

import com.example.backend.models.Lap;
import com.example.backend.services.LapService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/laps")
@RequiredArgsConstructor
@CrossOrigin(origins ="*")
public class LapController {

    private final LapService service;

    @PostMapping("/create")
    public ResponseEntity<Lap> create(@RequestBody Lap lap) {
        Lap saved = service.create(lap);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @GetMapping("/get/all")
    public ResponseEntity<List<Lap>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/get/{raceId}/{kartId}/{lapNumber}")
    public ResponseEntity<Lap> getById(
            @PathVariable Integer raceId,
            @PathVariable Integer kartId,
            @PathVariable Integer lapNumber) {
        return ResponseEntity.ok(service.getById(raceId, kartId, lapNumber));
    }

    @DeleteMapping("/delete/{raceId}/{kartId}/{lapNumber}")
    public ResponseEntity<Void> delete(
            @PathVariable Integer raceId,
            @PathVariable Integer kartId,
            @PathVariable Integer lapNumber) {
        service.delete(raceId, kartId, lapNumber);
        return ResponseEntity.noContent().build();
    }
}
