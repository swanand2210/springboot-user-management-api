package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/users-page")
    public String usersPage() {
        return "users"; // refers to users.html in templates folder
    }
}
