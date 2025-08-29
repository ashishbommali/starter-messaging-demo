package com.example.order.service;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.UUID;

@Service
public class OrderService {
    private final KafkaTemplate<String,String> kafkaTemplate;
    public OrderService(KafkaTemplate<String,String> kafkaTemplate){
        this.kafkaTemplate = kafkaTemplate;
    }

    public String createOrder(Map<String,Object> payload){
        // TODO: persist to DB (Postgres) - simplified for skeleton
        String orderId = UUID.randomUUID().toString();
        String msg = "OrderPlaced|"+orderId+"|"+payload.toString();
        kafkaTemplate.send("orders.v1.placed", orderId, msg);
        return orderId;
    }
}
