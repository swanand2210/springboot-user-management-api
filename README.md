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
## 📁 Project Structure

```
springboot-user-management-api/
├── .mvn/                             # Maven wrapper folder
│
├── mvnw                              # Maven wrapper script (Linux/Mac)
├── mvnw.cmd                          # Maven wrapper script (Windows)
├── pom.xml                           # Maven configuration file
├── .gitignore                        # Git ignore rules
├── README.md                         # Project documentation
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/demo/
│   │   │       ├── DemoApplication.java       # Main Spring Boot app class
│   │   │       ├── model/
│   │   │       │   └── User.java              # User entity/model
│   │   │       └── controller/
│   │   │           ├── UserController.java    # API controller (handles JSON)
│   │   │           └── WebController.java     # Web controller (renders UI)
│   │   │
│   │   └── resources/
│   │       ├── templates/
│   │       │   └── users.html                 # Thymeleaf HTML template
│   │       └── application.properties         # App configuration
│
│   └── test/
│       └── java/com/example/demo/
│           └── DemoApplicationTests.java      # Unit test file
```

