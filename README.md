# ⚙️ WorkNest Back-End

## Description

This is the backend of the WorkNest system. It provides REST APIs for handling authentication, job management, and user operations.

---

## 🚀 Features

* JWT Authentication
* Role-based authorization
* RESTful APIs
* User and job management
* Secure data handling

---

## Technologies

* Spring Boot
* MySQL
* Spring Security
* JWT

---

## ⚙️ Setup Instructions

### 1. Clone the repository

```bash
git clone https://github.com/YasithMadhushan/WorkNest-Back-End.git
```

### 2. Open in IDE

Use IntelliJ IDEA / Eclipse

---

### 3. Configure Database

Update `application.properties`:

```
spring.datasource.url=jdbc:mysql://localhost:3306/worknest
spring.datasource.username=root
spring.datasource.password=yourpassword
```

---

### 4. Run the project

Run the Spring Boot application

---

##  Authentication

This project uses JWT (JSON Web Token) for secure authentication.

---

##  API Endpoints (Example)

* POST /api/auth/register
* POST /api/auth/login
* GET /api/jobs
* POST /api/jobs

---

##  License

This project is for educational purposes.
