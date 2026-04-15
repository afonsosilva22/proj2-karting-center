package com.example.backend.services;

import com.example.backend.models.Kart;
import com.example.backend.repositories.KartRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KartService {

    private final KartRepository repository;

    public void addNew(Kart kart) {
        repository.save(kart);
    }
}