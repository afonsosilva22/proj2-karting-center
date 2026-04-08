package com.example.backend.services;

import com.example.backend.models.Equipment;
import com.example.backend.repositories.EquipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EquipmentService {

    @Autowired
    private EquipmentRepository repository;

    public void saveEquipment(Equipment equipment) {
        repository.save(equipment);
    }
}