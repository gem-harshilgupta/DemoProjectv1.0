package com.example.project1gem.configuration;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Controller;

@Controller
public class MyDbHealthService implements HealthIndicator {
    /**
     * This methods check health of project.
     *
     * @return boolean
     */
    public boolean isHealthGood() {
        return true;
    }

    @Override
    public Health health() {
        if (isHealthGood()) {
            return Health.up()
                    .withDetail("Database Service", "is running up ")
                    .build();
        }
        return Health
                .down()
                .withDetail("Database Service", "is running down").build();
    }
}