package com.example.backend.services;

import com.example.backend.models.PostalCode;
import com.example.backend.repositories.PostalCodeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostalCodeService {

    private final PostalCodeRepository repository;

    public PostalCode create(PostalCode postalCode) {
        return repository.save(postalCode);
    }

    public List<PostalCode> getAll() {
        return repository.findAll();
    }

    public PostalCode getByPostalCode(String postalCode) {
        return repository.findById(postalCode)
                .orElseThrow(() -> new RuntimeException("PostalCode not found"));
    }

    public PostalCode update(String postalCode, PostalCode postalCodeBody) {
        postalCodeBody.setPostalCode(postalCode);
        return repository.save(postalCodeBody);
    }
}
