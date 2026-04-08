package com.example.backend.repositories;

import com.example.backend.models.RaceEquipment;
import com.example.backend.models.RaceEquipmentId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RaceEquipmentRepository extends JpaRepository<RaceEquipment, RaceEquipmentId> {
}