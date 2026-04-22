package com.example.backend.services;

import com.example.backend.models.KartTypePrice;
import com.example.backend.repositories.KartTypePriceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class KartTypePriceService {

    private final KartTypePriceRepository repository;

    public KartTypePrice create(KartTypePrice kartTypePrice) {
        return repository.save(kartTypePrice);
    }

    public List<KartTypePrice> getAll() {
        return repository.findAll();
    }

    public KartTypePrice getByType(String type) {
        return repository.findById(type)
                .orElseThrow(() -> new RuntimeException("KartTypePrice not found"));
    }

    public KartTypePrice update(String type, KartTypePrice kartTypePrice) {
        kartTypePrice.setType(type);
        return repository.save(kartTypePrice);
    }
}
