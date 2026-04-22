package com.example.backend.services;

import com.example.backend.models.Kart;
import com.example.backend.repositories.KartRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class KartService {

    private final KartRepository repository;

    public Kart create(Kart kart) {
        return repository.save(kart);
    }

    public List<Kart> getAll() {
        return repository.findAll();
    }

    public Kart getById(Integer id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Kart not found"));
    }

    public Kart update(Integer id, Kart kart) {
        kart.setId(id);
        return repository.save(kart);
    }
}