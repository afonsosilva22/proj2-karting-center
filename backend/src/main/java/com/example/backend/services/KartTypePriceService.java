package com.example.backend.services;

import com.example.backend.models.KartTypePrice;
import com.example.backend.repositories.KartTypePriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KartTypePriceService {

    @Autowired
    private KartTypePriceRepository repository;

    public void saveKartTypePrice(KartTypePrice kartTypePrice) {
        repository.save(kartTypePrice);
    }
}