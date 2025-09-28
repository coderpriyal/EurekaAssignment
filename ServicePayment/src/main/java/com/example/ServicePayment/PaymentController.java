package com.example.ServicePayment;

import org.springframework.web.bind.annotation.*;

import java.util.Random;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    @GetMapping("/{id}")
    public String getPaymentStatus(@PathVariable int id) {
        // Simulate random SUCCESS or FAILURE
        String status = new Random().nextBoolean() ? "SUCCESS" : "FAILED";

        return status;
    }
}