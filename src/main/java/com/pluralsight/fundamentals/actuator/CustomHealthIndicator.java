package com.pluralsight.fundamentals.actuator;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class CustomHealthIndicator implements HealthIndicator {
    private final String message_key = "CustomService";

    @Override
    public Health health() {
        if (!isRunningServiceCustomService()) {
            return Health.down().withDetail(message_key, "Not Available - Replace ME").build();
        }
        return Health.up().withDetail(message_key, "Available").build();
    }

    private Boolean isRunningServiceCustomService() {
        Boolean isRunning = false;
        // Add real logic here to test if Custom Service is running; skipped for demo purposes
        return isRunning;
    }
}