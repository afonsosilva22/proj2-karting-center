package com.example.backend.repositories;

import com.example.backend.models.BlacklistEntry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlacklistEntryRepository extends JpaRepository<BlacklistEntry, Integer> {
}