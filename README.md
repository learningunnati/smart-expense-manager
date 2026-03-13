# Smart Expense Manager – Microservices Backend

## Overview

Smart Expense Manager is a scalable microservices-based backend system designed to manage shared expenses between users.

The system supports creating expenses, splitting bills, tracking balances, and generating spending insights.

The architecture is built using modern backend engineering principles including event-driven communication, distributed caching, and containerized deployment.

---

## Architecture

Client → API Gateway → Microservices

Services:

* User Service
* Expense Service
* Notification Service
* Analytics Service

Infrastructure:

* MySQL
* Redis
* Kafka

---

## Tech Stack

Backend

* Java
* Spring Boot
* Spring Security
* Spring Data JPA

Database

* MySQL

Messaging

* Kafka

Caching

* Redis

Infrastructure

* Docker
* Kubernetes

Service Discovery

* Eureka

Configuration

* Spring Cloud Config

---

## Microservices

### User Service

Responsible for:

* user registration
* authentication
* JWT token generation

### Expense Service

Responsible for:

* creating expenses
* splitting expenses
* tracking balances

### Notification Service

Responsible for:

* sending notifications
* consuming Kafka events

### Analytics Service

Responsible for:

* spending analytics
* generating reports

---

## Event Driven Architecture

Expense Service publishes events to Kafka.

Consumers:

* Notification Service
* Analytics Service

---

## Security

* JWT Authentication
* Password hashing (BCrypt)
* HTTPS support

---

## Future Improvements

* WebSocket real-time notifications
* Mobile application
* CI/CD pipeline

