package com.example.backend.repositories;

import com.example.backend.models.RaceKart;
import com.example.backend.models.RaceKartId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RaceKartRepository extends JpaRepository<RaceKart, RaceKartId> {
}