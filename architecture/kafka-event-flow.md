# Kafka Event Flow

The system uses Apache Kafka for event-driven communication.

## Expense Created Event

When a user creates an expense:

1. Expense Service saves expense to database
2. Expense Service publishes `ExpenseCreatedEvent`
3. Kafka distributes the event

Consumers:

* Notification Service
* Analytics Service

## Event Flow

Expense Service
↓
Kafka Topic: expense-created
↓
Notification Service
Analytics Service
