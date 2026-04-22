package com.example.backend.controllers;

import com.example.backend.models.Race;
import com.example.backend.services.RaceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/races")
@RequiredArgsConstructor
@CrossOrigin(origins ="*")
public class RaceController {

    private final RaceService service;

    @PostMapping("/create")
    public ResponseEntity<Race> create(@RequestBody Race race) {
        Race saved = service.create(race);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @GetMapping("/get/all")
    public ResponseEntity<List<Race>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Race> getById(@PathVariable Integer id) {
        return ResponseEntity.ok(service.getById(id));
    }
}
