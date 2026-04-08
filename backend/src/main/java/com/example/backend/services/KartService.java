package com.example.backend.services;

import com.example.backend.models.Kart;
import com.example.backend.repositories.KartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KartService {

    @Autowired
    private KartRepository repository;

    public void saveKart(Kart kart) {
        repository.save(kart);
    }
}