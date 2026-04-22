package com.example.backend.controllers;

import com.example.backend.models.RaceKart;
import com.example.backend.services.RaceKartService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/race-karts")
@RequiredArgsConstructor
@CrossOrigin(origins ="*")
public class RaceKartController {

    private final RaceKartService service;

    @PostMapping("/create")
    public ResponseEntity<RaceKart> create(@RequestBody RaceKart raceKart) {
        RaceKart saved = service.create(raceKart);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @GetMapping("/get/all")
    public ResponseEntity<List<RaceKart>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/get/{raceId}/{kartId}")
    public ResponseEntity<RaceKart> getById(@PathVariable Integer raceId, @PathVariable Integer kartId) {
        return ResponseEntity.ok(service.getById(raceId, kartId));
    }

    @DeleteMapping("/delete/{raceId}/{kartId}")
    public ResponseEntity<Void> delete(@PathVariable Integer raceId, @PathVariable Integer kartId) {
        service.delete(raceId, kartId);
        return ResponseEntity.noContent().build();
    }
}
