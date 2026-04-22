package com.example.backend.controllers;

import com.example.backend.models.Kart;
import com.example.backend.services.KartService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/karts")
@RequiredArgsConstructor
@CrossOrigin(origins ="*")
public class KartController {

    private final KartService service;

    @PostMapping("/create")
    public ResponseEntity<Kart> create(@RequestBody Kart kart) {
        Kart saved = service.create(kart);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @GetMapping("/get/all")
    public ResponseEntity<List<Kart>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("get/{id}")
    public ResponseEntity<Kart> getById(@PathVariable Integer id) {
        return ResponseEntity.ok(service.getById(id));
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Kart> update(@PathVariable Integer id, @RequestBody Kart kart) {
        return ResponseEntity.ok(service.update(id, kart));
    }
}
