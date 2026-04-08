package com.example.backend.repositories;

import com.example.backend.models.Lap;
import com.example.backend.models.LapId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LapRepository extends JpaRepository<Lap, LapId> {
}