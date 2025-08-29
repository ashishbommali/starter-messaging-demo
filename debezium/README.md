Outbox Pattern + Debezium (notes):
- Implement an Outbox table in the orders DB. When creating an order, write a row into outbox (transactionally).
- Debezium connector monitors the outbox table and publishes events to Kafka.
- Example connector JSON below (post to Connect REST API):
