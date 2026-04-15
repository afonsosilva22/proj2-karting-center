package com.example.backend.controllers;

import com.example.backend.models.Equipment;
import com.example.backend.services.EquipmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/equipments")
@RequiredArgsConstructor
@CrossOrigin(origins ="*")
public class EquipmentController {

    private final EquipmentService service;

    @PostMapping("/add")
    public Equipment addNewEquipment(@RequestBody Equipment equipment) {
        service.addNew(equipment);
        return equipment;
    }
}
