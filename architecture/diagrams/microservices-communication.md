## Microservices Communication

```
                Client
                   |
                   v
               API Gateway
                   |
                   v
             Expense Service
                   |
          +--------------------+
          |                    |
          v                    v
      User Service         Kafka Event
          |
          v
    ----------------------------
    |                          |
    v                          v
Notification Service     Analytics Service
```