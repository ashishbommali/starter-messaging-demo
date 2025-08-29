package com.example.order.controller;

import com.example.order.service.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/orders")
public class OrderController {
    private final OrderService svc;
    public OrderController(OrderService svc){ this.svc = svc; }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody Map<String,Object> payload){
        var id = svc.createOrder(payload);
        return ResponseEntity.ok(Map.of("orderId", id));
    }
}
