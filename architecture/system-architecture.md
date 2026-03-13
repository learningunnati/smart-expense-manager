# System Architecture

The Smart Expense Manager backend follows a microservices architecture.

## Architecture Overview

Client → API Gateway → Microservices

Microservices:

* User Service
* Expense Service
* Notification Service
* Analytics Service

Infrastructure Components:

* MySQL (persistent storage)
* Redis (caching layer)
* Kafka (event streaming platform)

## Architecture Diagram

Client
↓
API Gateway
↓
-

User Service
Expense Service
Notification Service
Analytics Service
↓
MySQL Database
↓
Redis Cache
↓
Kafka Event Bus

## Key Architectural Principles

* Microservices architecture
* Event-driven communication
* Distributed caching
* Stateless services
