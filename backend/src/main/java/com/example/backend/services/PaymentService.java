package com.example.backend.services;

import com.example.backend.models.Payment;
import com.example.backend.repositories.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository repository;

    public void savePayment(Payment payment) {
        repository.save(payment);
    }
}