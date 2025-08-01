# Book Manager
  A simple **Book Manager** built with Spring Boot and a relational database (e.g., MySQL). Provides CRUD operations on books and can serve as the backend for a frontend UI (e.g., React).
  Designed to be minimal, extensible, and easy to integrate.

## Features

- Create, Read, Update, Delete (CRUD) operations for books.  
- Validation of inputs  
- Exception handling with meaningful error responses.
- DTO-based data transfer (to separate entity from API contract)

## Tech Stack

- **Backend:** Java, Spring Boot, Spring Data JPA  
- **Database:** MySQL
- **Build Tool:** Maven

## Prerequisites

- Java 21  
- Maven 3.6+  
- MySQL server 
- Git

## Clone Repository

git clone https://github.com/aravindmat/Backend-SpringBoot-bookmanager.git
cd Backend-SpringBoot-bookmanager

## Configuration

1. cp src/main/resources/application.properties.example src/main/resources/application.properties

2. Example for application properties
   # Datasource
    spring.datasource.url=jdbc:mysql://localhost:3306/bookdb?useSSL=false&serverTimezone=UTC
    spring.datasource.username=root
    spring.datasource.password=your_password

  # JPA / Hibernate
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.show-sql=true
    spring.jpa.properties.hibernate.format_sql=true

## Database setup

  CREATE DATABASE bookdb;

## Run application
  With Maven 
  
  mvn clean install
  mvn spring-boot:run

  The application will start on http://localhost:8080 by default.
