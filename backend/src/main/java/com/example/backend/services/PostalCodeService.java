package com.example.backend.services;

import com.example.backend.models.PostalCode;
import com.example.backend.repositories.PostalCodeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostalCodeService {

    private final PostalCodeRepository repository;

    public void create(PostalCode postalCode) {
        repository.save(postalCode);
    }
}