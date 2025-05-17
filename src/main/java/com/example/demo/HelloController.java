package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private User currentUser = new User(1, "swanand", "swanand@example.com");

    @PostMapping("/user")
    public User createUser(@RequestBody User user) {
        this.currentUser = user; // store the new user
        return this.currentUser;
    }

    @GetMapping("/user")
    public User getUser() {
        return this.currentUser; // return the stored user
    }
}


// User class can be in the same file or better in a separate file User.java
class User {
    private int id;
    private String name;
    private String email;

    // Constructor
    public User(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    // Getters (needed for JSON serialization)
    public int getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
}
