package com.example.backend.controllers;

import com.example.backend.models.KartTypePrice;
import com.example.backend.services.KartTypePriceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/kart-type-prices")
@RequiredArgsConstructor
@CrossOrigin(origins ="*")
public class KartTypePriceController {

    private final KartTypePriceService service;

    @PostMapping("/create")
    public ResponseEntity<KartTypePrice> create(@RequestBody KartTypePrice kartTypePrice) {
        KartTypePrice saved = service.create(kartTypePrice);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @GetMapping("/get/all")
    public ResponseEntity<List<KartTypePrice>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/get/{type}")
    public ResponseEntity<KartTypePrice> getByType(@PathVariable String type) {
        return ResponseEntity.ok(service.getByType(type));
    }

    @PutMapping("/update/{type}")
    public ResponseEntity<KartTypePrice> update(@PathVariable String type, @RequestBody KartTypePrice kartTypePrice) {
        return ResponseEntity.ok(service.update(type, kartTypePrice));
    }
}
