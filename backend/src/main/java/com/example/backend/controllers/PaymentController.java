package com.example.backend.controllers;

import com.example.backend.models.Payment;
import com.example.backend.services.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/payments")
@RequiredArgsConstructor
@CrossOrigin(origins ="*")
public class PaymentController {

    private final PaymentService service;

    @PostMapping("/create")
    public Payment create(@RequestBody Payment payment) {
        service.create(payment);
        return payment;
    }
}
