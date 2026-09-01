# 🏠 Flatmate Expense & Settlement Manager

A full-stack web application designed to help flatmates manage shared household expenses, track individual contributions, and simplify expense settlements.

The project is being developed using **Java Spring Boot, MySQL, REST APIs, and a web-based frontend**.

---

## 📌 Project Status

**Current Stage:** Backend – User Management & CRUD

### Completed

* Spring Boot project setup
* MySQL database connection
* User entity
* Spring Data JPA repository
* Service layer
* REST controller
* User CRUD APIs
* API testing using Postman
* Basic Spring Security configuration for development

### Planned

* Flat/group management
* User-flat relationships
* Expense management
* Expense splitting
* Settlement calculation
* Authentication and authorization
* Frontend dashboard
* Complete full-stack integration

---

## 🎯 Project Objective

Managing expenses between flatmates can become complicated when multiple people pay for groceries, electricity, rent, internet, food, and other shared expenses.

This application aims to provide a centralized system where flatmates can:

* Add and track shared expenses
* Record who paid an expense
* Split expenses between members
* Calculate individual balances
* Determine who owes whom
* Record settlements
* View expense history

---

## 🛠️ Technology Stack

### Backend

* **Java**
* **Spring Boot**
* **Spring Web**
* **Spring Data JPA**
* **Hibernate**
* **Spring Security**

### Database

* **MySQL**

### API Testing

* **Postman**

### Frontend

Planned:

* HTML
* CSS
* JavaScript

A React-based frontend may be introduced in a later version.

---

## 🏗️ Current Architecture

```text
Client / Postman
       │
       ▼
 REST Controller
       │
       ▼
 Service Layer
       │
       ▼
 Repository Layer
       │
       ▼
    MySQL
```

### Responsibilities

**Controller**

* Receives HTTP requests
* Sends HTTP responses
* Maps API endpoints

**Service**

* Contains application/business logic
* Communicates with repositories

**Repository**

* Handles database operations
* Uses Spring Data JPA

**Entity**

* Represents database tables

---

## 📂 Current Project Structure

```text
expensemanager/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── flatmate/
│   │   │           └── expensemanager/
│   │   │               │
│   │   │               ├── config/
│   │   │               │   └── SecurityConfig.java
│   │   │               │
│   │   │               ├── controller/
│   │   │               │   └── UserController.java
│   │   │               │
│   │   │               ├── model/
│   │   │               │   └── User.java
│   │   │               │
│   │   │               ├── repository/
│   │   │               │   └── UserRepository.java
│   │   │               │
│   │   │               ├── service/
│   │   │               │   └── UserService.java
│   │   │               │
│   │   │               └── ExpensemanagerApplication.java
│   │   │
│   │   └── resources/
│   │       └── application.properties
│   │
│   └── test/
│
└── pom.xml
```

---

# 🗄️ Database

The current database is:

```text
flatmate_expense_manager
```

### Current Table

```text
users
```

### User Fields

| Field      | Type   | Description     |
| ---------- | ------ | --------------- |
| `id`       | Long   | Primary key     |
| `username` | String | User's username |
| `email`    | String | User's email    |
| `password` | String | User password   |

> Password hashing and secure authentication will be implemented in the authentication phase.

---

# 🔌 REST API

Base URL:

```text
http://localhost:8080
```

## User APIs

### Create User

**POST**

```text
/api/users
```

Request:

```json
{
    "username": "Saumya",
    "email": "saumya@example.com",
    "password": "test123"
}
```

---

### Get All Users

**GET**

```text
/api/users
```

---

### Get User by ID

**GET**

```text
/api/users/{id}
```

Example:

```text
/api/users/1
```

---

### Update User

**PUT**

```text
/api/users/{id}
```

Example:

```text
/api/users/1
```

Request:

```json
{
    "username": "Saumya Updated",
    "email": "saumya@example.com",
    "password": "newpassword"
}
```

---

### Delete User

**DELETE**

```text
/api/users/{id}
```

Example:

```text
/api/users/1
```

---

# 🧪 Testing

The APIs are currently tested using **Postman**.

CRUD operations implemented:

```text
CREATE → POST
READ   → GET
UPDATE → PUT
DELETE → DELETE
```

---

# ⚙️ Configuration

The application uses MySQL through `application.properties`.

Example:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/flatmate_expense_manager
spring.datasource.username=root
spring.datasource.password=YOUR_MYSQL_PASSWORD

spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### Security Note

Do **not** commit your real database password to GitHub.

For a production application, sensitive configuration should be stored using environment variables or another secure configuration mechanism.

---

# 🚀 How to Run the Project

## 1. Clone the repository

```bash
git clone <repository-url>
```

## 2. Open the project

Open the project in IntelliJ IDEA.

## 3. Create the MySQL database

```sql
CREATE DATABASE flatmate_expense_manager;
```

## 4. Configure MySQL

Update:

```text
src/main/resources/application.properties
```

with your MySQL username and password.

## 5. Run the application

Run:

```text
ExpensemanagerApplication.java
```

The server will start on:

```text
http://localhost:8080
```

## 6. Test the API

Use Postman to test:

```text
POST   /api/users
GET    /api/users
GET    /api/users/{id}
PUT    /api/users/{id}
DELETE /api/users/{id}
```

---

# 🗺️ Development Roadmap

## Phase 1 — Project Setup

* [x] Spring Boot setup
* [x] MySQL connection
* [x] Basic project architecture

## Phase 2 — User Management

* [x] User entity
* [x] User repository
* [x] User service
* [x] User controller
* [x] Create user
* [x] Read users
* [x] Update user
* [x] Delete user

## Phase 3 — Flat Management

* [ ] Create flat
* [ ] Join flat
* [ ] Add members
* [ ] Remove members
* [ ] User–Flat relationship

## Phase 4 — Expense Management

* [ ] Create expense
* [ ] View expenses
* [ ] Update expense
* [ ] Delete expense
* [ ] Record payer
* [ ] Split expenses

## Phase 5 — Settlement System

* [ ] Calculate individual shares
* [ ] Calculate balances
* [ ] Identify creditors
* [ ] Identify debtors
* [ ] Generate settlement suggestions
* [ ] Record settlements

## Phase 6 — Authentication

* [ ] Registration
* [ ] Login
* [ ] Password hashing
* [ ] Authentication
* [ ] Authorization
* [ ] Protected APIs

## Phase 7 — Frontend

* [ ] Login page
* [ ] Registration page
* [ ] Dashboard
* [ ] Expense form
* [ ] Expense history
* [ ] Settlement dashboard
* [ ] Flat/member management

---

# 📚 Learning Objectives

This project is being developed to understand practical full-stack development concepts including:

* Java backend development
* Spring Boot
* REST API development
* CRUD operations
* Spring Data JPA
* MySQL
* Database relationships
* Service-layer business logic
* Authentication
* Authorization
* API testing
* Frontend-backend integration
* Git and GitHub

---

# 🔮 Future Goal

The final application will allow a group of flatmates to manage their entire shared-expense workflow from one place:

```text
Register
   ↓
Create / Join Flat
   ↓
Add Flatmates
   ↓
Record Expenses
   ↓
Split Expenses
   ↓
Calculate Balances
   ↓
Settle Payments
   ↓
View History
```

---

## 👨‍💻 Author

**Saumya Shukla**

