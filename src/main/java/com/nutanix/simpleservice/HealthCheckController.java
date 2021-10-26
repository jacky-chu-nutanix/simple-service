package com.nutanix.simpleservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {
    @GetMapping("/internal/status")
    public HealthStatus isHealth() {
        return new HealthStatus();
    }
}
