package com.example.backend.services;

import com.example.backend.models.Payment;
import com.example.backend.repositories.PaymentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PaymentService {

    private final PaymentRepository repository;

    public Payment create(Payment payment) {
        return repository.save(payment);
    }

    public List<Payment> getAll() {
        return repository.findAll();
    }

    public Payment getById(Integer id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Payment not found"));
    }
}
