# Microservices Communication

Communication between services happens using both synchronous and asynchronous methods.

## Synchronous Communication

Client requests travel through the API Gateway.

Example:

Client → API Gateway → Expense Service

## Asynchronous Communication

Services communicate through Kafka events.

Example:

Expense Service publishes an event when a new expense is created.

Consumers:

* Notification Service
* Analytics Service

This allows services to remain loosely coupled.
