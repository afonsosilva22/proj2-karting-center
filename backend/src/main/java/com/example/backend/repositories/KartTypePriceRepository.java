package com.example.backend.repositories;

import com.example.backend.models.KartTypePrice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KartTypePriceRepository extends JpaRepository<KartTypePrice, String> {
}