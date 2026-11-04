# 33. Kafka

**Category:** Messaging  |  **Status:** Scaffold - implement the TODOs

Keyed events, acks=all, consumer groups, commit after processing.

## Sequence
```mermaid
sequenceDiagram
    participant Order
    participant Kafka
    participant Payment
    Order->>Kafka: produce orders.events key 501
    Kafka->>Order: ack offset 4821
    Payment->>Kafka: poll
    Payment->>Kafka: commit offset
```

## Run
```bash
docker compose up -d
mvn spring-boot:run
```

## Part of
[system-design-concepts-master](../../README.md) - see the master repo for the full concept map.
