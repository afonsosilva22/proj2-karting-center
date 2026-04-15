package com.example.backend.services;

import com.example.backend.models.Payment;
import com.example.backend.repositories.PaymentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PaymentService {

    private final PaymentRepository repository;

    public void create(Payment payment) {
        repository.save(payment);
    }
}