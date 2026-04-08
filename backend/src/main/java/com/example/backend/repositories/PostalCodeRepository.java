package com.example.backend.repositories;

import com.example.backend.models.PostalCode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostalCodeRepository extends JpaRepository<PostalCode, String> {
}