package com.example.crop_monitoring_backend.exception;

public class FieldNotFoundException extends RuntimeException {
    public FieldNotFoundException() {
        super();
    }

    public FieldNotFoundException(String message) {
        super(message);
    }

    public FieldNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
