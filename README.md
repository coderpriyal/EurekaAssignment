Microservices Demo with Eureka and Load Balancing

This project demonstrates a simple microservices architecture using Spring Boot, Eureka Service Registry, and Round-Robin Load Balancing.
It consists of three services: Eureka Server, Payment Service, and Order Service.

| Service         | Port(s)    | Description                                                           |
| --------------- | ---------- | --------------------------------------------------------------------- |
| Eureka Server   | 8761       | Service Registry for service discovery                                |
| Payment Service | 8082, 8083 | Returns sample payment status for a given payment ID                  |
| Order Service   | 8081       | Fetches order details and calls Payment Service to get payment status |

Features:

Service registration and discovery using Eureka

Inter-service communication using RestTemplate

Load balancing across multiple instances using Spring Cloud LoadBalancer (Round-Robin strategy)


OUTPUT

<img width="2940" height="1912" alt="image" src="https://github.com/user-attachments/assets/a1583120-d43d-4256-9f02-042a0ee164ab" />

<img width="1772" height="572" alt="image" src="https://github.com/user-attachments/assets/536bf392-6dd7-45d5-89d6-4fb9ab893000" />

