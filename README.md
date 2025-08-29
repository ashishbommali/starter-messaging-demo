# Starter Messaging Demo (Order + Payment Happy Path)

This project is a starter template demonstrating **order → payment flow** with messaging.

## Contents
- `order-service` (Spring Boot skeleton)
- `payment-service` (Spring Boot skeleton)
- `react-storefront` (React skeleton UI)
- `docker-compose.yml` (Kafka, Zookeeper, RabbitMQ, Postgres, services)
- `helm/` (Helm charts for Kubernetes deployment, minimal)
- `Jenkinsfile` (CI pipeline example)
- `debian/connector` (Debezium connector example)

## Run locally
1. `docker-compose up --build`
2. Create an order:  
   ```bash
   curl -X POST http://localhost:8081/orders \
     -H "Content-Type: application/json" \
     -d '{"itemId": "123", "quantity": 2}'
