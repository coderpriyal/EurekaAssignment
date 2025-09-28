package com.example.ServiceOrder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{id}")
    public Map<String, Object> getOrder(@PathVariable int id) {
        // Sample order
        Map<String, Object> order = new HashMap<>();
        order.put("orderId", id);
        order.put("productName", "Laptop");

        // Call Payment Service via Eureka
        String paymentStatus = restTemplate.getForObject(
                "http://ServicePayment/payments/" + id, String.class
        );

        order.put("paymentStatus", paymentStatus);
        return order;
    }
}

