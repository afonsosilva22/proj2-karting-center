package com.example.backend.services;

import com.example.backend.models.Equipment;
import com.example.backend.repositories.EquipmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EquipmentService {

    private final EquipmentRepository repository;

    public void addNew(Equipment equipment) {
        repository.save(equipment);
    }
}