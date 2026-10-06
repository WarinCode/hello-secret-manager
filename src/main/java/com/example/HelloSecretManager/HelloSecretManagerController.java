package com.example.HelloSecretManager;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

@RestController
public class HelloSecretManagerController {
    @Value("${sm://greeting}")
    String greeting;

    @GetMapping("/")
    public String hello() {
        return greeting + " World!";
    }
}

