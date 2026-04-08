package com.example.backend.repositories;

import com.example.backend.models.Kart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KartRepository extends JpaRepository<Kart, Integer> {
}