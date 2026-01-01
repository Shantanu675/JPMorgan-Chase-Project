# JPMorganChase Software Engineering Job Simulation (Forage)

This repository contains my implementation and learnings from the **JPMorganChase Software Engineering Job Simulation** hosted on **Forage**. The project focuses on building core backend components of a transaction-processing system using **Java**, **Spring Boot**, **Kafka**, **SQL**, and **REST APIs**, closely simulating real-world backend engineering work at JPMorganChase.

---

## 📌 Overview

During this simulation, I worked on a backend microservice inspired by the **Midas transaction-processing system**. The goal was to design, implement, and test a scalable and reliable service capable of consuming high-volume transaction messages, validating and persisting data, integrating with external services, and exposing RESTful APIs.

This experience provided hands-on exposure to **distributed systems**, **event-driven architecture**, and **clean backend design**, reinforcing my interest in backend and platform engineering roles.

---

## 🚀 Key Features & Responsibilities

### 1. Kafka Integration

* Integrated **Apache Kafka** into a Spring Boot microservice.
* Consumed and deserialized high-volume transaction messages.
* Used a **configurable Kafka topic** for flexibility across environments.
* Implemented and tested message consumption using an **embedded Kafka test framework**.

### 2. Transaction Processing & Persistence

* Implemented **transaction validation logic** to ensure data consistency.
* Designed **JPA entities** for transactions and users.
* Persisted data using **Spring Data JPA** with an **H2 in-memory SQL database**.
* Updated user balances while maintaining **relational integrity** between records.

### 3. External REST API Integration

* Connected the service to an **external Incentive REST API** using `RestTemplate`.
* Processed incentive responses and incorporated them into transactional workflows.
* Ensured fault tolerance and clean separation of concerns between services.

### 4. RESTful API Development

* Developed a **Spring REST controller** to expose user balance data.
* Returned structured **JSON responses**.
* Maintained clean architectural boundaries between controller, service, and repository layers.

### 5. Testing & Verification

* Verified system behavior using **Maven test suites**.
* Used **embedded Kafka** and **H2** for reliable and repeatable tests.
* Debugged and inspected application flow to validate:

  * Message ingestion
  * Database operations
  * External API interactions

---

## 🛠️ Tech Stack

* **Language:** Java
* **Framework:** Spring Boot, Spring Framework
* **Messaging:** Apache Kafka
* **Database:** H2 SQL Database
* **ORM:** Spring Data JPA
* **API Communication:** REST APIs, RestTemplate
* **Build Tool:** Maven
* **Testing:** JUnit, Embedded Kafka

---

## 📂 Project Architecture (High-Level)

```
Controller Layer
   ↓
Service Layer (Business Logic)
   ↓
Repository Layer (JPA / Database)
   ↓
Kafka Consumer & External REST API
```

This layered architecture ensures **maintainability**, **testability**, and **scalability**.

---

## 🎯 Learning Outcomes

* Gained practical experience with **event-driven microservices**.
* Strengthened understanding of **Kafka-based message processing**.
* Improved skills in **Spring Boot**, **JPA**, and **RESTful API design**.
* Learned how enterprise systems integrate **databases**, **message queues**, and **external services**.
* Developed confidence in testing and debugging distributed systems.

---

## 💡 Why This Project Matters

This simulation confirmed my interest in:

* Scalable backend system design
* Data processing pipelines
* API-driven and distributed architectures

It closely reflects the type of backend engineering challenges faced at **JPMorganChase**, making it a valuable learning and portfolio project.

---

## 📅 Program Details

* **Program:** JPMorganChase Software Engineering Job Simulation
* **Platform:** Forage
* **Completion:** September 2025

---

## 📬 About Me

I am a B.Tech IT student with a strong interest in backend and full-stack development, particularly using **Java**, **Spring Boot**, and **distributed systems**. This project represents my effort to build industry-relevant skills and apply them in real-world scenarios.

---

## 🎓 Certificate
🔗 [View Certificate](https://drive.google.com/file/d/1aLcscH5QA0C2KSSL9ifJiE9OJ4QJvHb4/view?usp=drivesdk)

---
⭐ If you find this project useful or insightful, feel free to star the repository!
