## System Architecture

```
                Client
                   |
                   v
             API Gateway
                   |
                   v
       Service Discovery (Eureka)
                   |
        ---------------------------
        |            |            |
        v            v            v
    User Service  Expense Service  Notification Service
        |            |            |
        -----------------------------------------------
                        |
                        v
                      MySQL

                -------------------
                |                 |
                v                 v
              Redis              Kafka
```