package com.example.rest_service.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.rest_service.Greeting;

@RestController
public class GreetingController {
    private static final String TEMPLATE = "Hello %s";
    private static AtomicLong counter = new AtomicLong();

    @GetMapping
    public Greeting greeting(@RequestParam(defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), TEMPLATE.formatted(name));
    }
} 