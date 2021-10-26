package com.nutanix.simpleservice;

public class HealthStatus {
    private final String status;

    public HealthStatus() {
        this("ok");
    }

    public HealthStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
