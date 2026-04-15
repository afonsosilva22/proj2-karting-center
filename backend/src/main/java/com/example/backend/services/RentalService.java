package com.example.backend.services;

import com.example.backend.models.Rental;
import com.example.backend.repositories.RentalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RentalService {

    private final RentalRepository repository;

    public void addNew(Rental rental) {
        repository.save(rental);
    }
}