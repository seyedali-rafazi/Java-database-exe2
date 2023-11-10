# Database Exercise Project

## Overview

This is a Spring Boot project demonstrating a simple database exercise with a `Student` entity. It includes a RESTful API for managing student information and interacting with a database.


## Prerequisites

- Java Development Kit (JDK) 8 or later
- Maven
- Your preferred Integrated Development Environment (IDE)
- Git
- Database (e.g., H2)

## Getting Started

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/database-exercise.git](https://github.com/seyedali-rafazi/Java-database-exe2.git
Open the project in your IDE.

Set up your database configuration in application.properties or application.yml.

Run the Spring Boot application.

Access the API endpoints to interact with the data.

Project Structure
|-- src
|   |-- main
|       |-- java
|           |-- com.example.database.exercise
|               |-- DatabaseExerciseApplication.java
|               |-- student
|                   |-- Student.java
|                   |-- StudentController.java
|                   |-- StudentRepository.java
|                   |-- StudentService.java
|-- resources
|   |-- application.properties
|-- .gitignore
|-- README.md


API Endpoints
GET /api/v1/student: Get a list of all students.
POST /api/v1/student/addDefault: Add a default student to the database.
Database Configuration
Configure your database connection in the application.properties or application.yml file. Example for H2:

yaml
Copy code
spring:
  datasource:
    url: jdbc:h2:mem:testdb
    driver-class-name: org.h2.Driver
    username: sa
    password:
  h2:
    console:
      enabled: true

