package com.example.backend.controllers;

import com.example.backend.models.Track;
import com.example.backend.services.TrackService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tracks")
@RequiredArgsConstructor
@CrossOrigin(origins ="*")
public class TrackController {

    private final TrackService service;

    @PostMapping("/create")
    public ResponseEntity<Track> create(@RequestBody Track track) {
        Track saved = service.create(track);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @GetMapping("/get/all")
    public ResponseEntity<List<Track>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Track> getById(@PathVariable Integer id) {
        return ResponseEntity.ok(service.getById(id));
    }

    @PutMapping("update/{id}")
    public ResponseEntity<Track> update(@PathVariable Integer id, @RequestBody Track track) {
        return ResponseEntity.ok(service.update(id, track));
    }
}
