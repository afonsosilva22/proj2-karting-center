package com.example.backend.services;

import com.example.backend.models.Rental;
import com.example.backend.repositories.RentalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RentalService {

    @Autowired
    private RentalRepository repository;

    public void saveRental(Rental rental) {
        repository.save(rental);
    }
}