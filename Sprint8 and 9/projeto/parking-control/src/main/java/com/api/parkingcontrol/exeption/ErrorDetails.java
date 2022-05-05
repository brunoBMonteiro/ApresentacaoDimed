package com.api.parkingcontrol.exeption;

import lombok.Data;

import java.time.LocalDateTime;
import java.time.ZoneId;

@Data
public class ErrorDetails {
    private LocalDateTime timestamp;
    private String message;
    private String details;

    public ErrorDetails(String message, String details) {
        this.message = message;
        this.details = details;
        this.timestamp = LocalDateTime.now(ZoneId.of("UTC"));
    }
}
