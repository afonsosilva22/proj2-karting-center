package com.example.backend.services;

import com.example.backend.models.KartTypePrice;
import com.example.backend.repositories.KartTypePriceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KartTypePriceService {

    private final KartTypePriceRepository repository;

    public void addNew(KartTypePrice kartTypePrice) {
        repository.save(kartTypePrice);
    }
}