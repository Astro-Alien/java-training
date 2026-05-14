package com.practical.meetup.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
class HomeController{

    @GetMapping("/")
    String home() {
        return "Hello, World";
    }

}