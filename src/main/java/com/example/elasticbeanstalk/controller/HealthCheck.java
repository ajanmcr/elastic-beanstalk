package com.example.elasticbeanstalk.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HealthCheck {
    @GetMapping("/health-check")
    public ResponseEntity<String> healthCheckStatus() {
        return ResponseEntity.ok("Status: OK!");
    }
}
