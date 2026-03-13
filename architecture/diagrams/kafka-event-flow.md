## Kafka Event Flow

```
            Expense Created Event

              Expense Service
                     |
                     v
        Kafka Topic: expense-created
                     |
                     v
        -------------------------------
        |                             |
        v                             v
 Notification Service          Analytics Service
```