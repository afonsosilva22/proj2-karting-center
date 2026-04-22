package com.example.backend.controllers;

import com.example.backend.models.Equipment;
import com.example.backend.services.EquipmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/equipments")
@RequiredArgsConstructor
@CrossOrigin(origins ="*")
public class EquipmentController {

    private final EquipmentService service;

    @PostMapping("/create")
    public ResponseEntity<Equipment> create(@RequestBody Equipment equipment) {
        Equipment saved = service.create(equipment);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @GetMapping("/get/all")
    public ResponseEntity<List<Equipment>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Equipment> getById(@PathVariable Integer id) {
        return ResponseEntity.ok(service.getById(id));
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Equipment> update(@PathVariable Integer id, @RequestBody Equipment equipment) {
        return ResponseEntity.ok(service.update(id, equipment));
    }
}
