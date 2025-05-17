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
<pre> ```plaintext springboot-user-management-api/ ├── .mvn/ # Maven wrapper ├── mvnw # Maven wrapper script (Linux/Mac) ├── mvnw.cmd # Maven wrapper script (Windows) ├── pom.xml # Maven project file ├── .gitignore ├── README.md ├── src/ │ ├── main/ │ │ ├── java/ │ │ │ └── com/example/demo/ │ │ │ ├── DemoApplication.java # Main class │ │ │ ├── model/User.java # User model │ │ │ └── controller/ │ │ │ ├── UserController.java # API controller │ │ │ └── WebController.java # Web view controller │ │ └── resources/ │ │ ├── templates/ │ │ │ └── users.html # Thymeleaf template │ │ └── application.properties # Spring Boot config │ │ └── test/ │ └── java/com/example/demo/ │ └── DemoApplicationTests.java ``` </pre>
