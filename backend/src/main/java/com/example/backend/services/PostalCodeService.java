package com.example.backend.services;

import com.example.backend.models.PostalCode;
import com.example.backend.repositories.PostalCodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostalCodeService {

    @Autowired
    private PostalCodeRepository repository;

    public void savePostalCode(PostalCode postalCode) {
        repository.save(postalCode);
    }
}