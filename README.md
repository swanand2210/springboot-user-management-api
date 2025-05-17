# Spring Boot User Management API

This is a simple User Management project built using **Spring Boot**. It allows you to send user data via JSON, store it, and display all users on a webpage.

##  Features

- Add multiple users via JSON input
- Display stored users on a web page
- Clean and layered architecture (Controller, Model, View)
- Uses Thymeleaf for rendering web UI

##  Tech Stack

- **Java 17**
- **Spring Boot**
- **Maven**
- **Thymeleaf**
- **HTML/CSS**
- **Postman** for API testing

##  Project Structure
springboot-user-management-api/
├── .mvn/                       # Maven wrapper files
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/demo/
│   │   │       ├── model/               # User model class
│   │   │       ├── controller/          # UserController and WebController
│   │   │       └── DemoApplication.java # Main Spring Boot app
│   │   └── resources/
│   │       ├── templates/               # users.html (Thymeleaf template)
│   │       └── application.properties   # Config properties
│   └── test/                            # Test classes (auto-generated)
├── .gitignore
├── mvnw / mvnw.cmd                     # Maven wrapper scripts
├── pom.xml                             # Project dependencies and build config
└── README.md

