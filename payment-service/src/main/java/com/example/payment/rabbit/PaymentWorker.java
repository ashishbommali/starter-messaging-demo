package com.example.payment.rabbit;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class PaymentWorker {

    @RabbitListener(queues = "payment.queue")
    public void process(String payload) throws InterruptedException {
        System.out.println("[PaymentWorker] received: " + payload);
        // simulate processing
        Thread.sleep(1500);
        System.out.println("[PaymentWorker] payment succeeded for: " + payload);
        // TODO: publish payments.v1.status to Kafka or update DB
    }
}
