package com.yurii.pavlenko.assistant.tasks.exceptions;

public class ValidationException extends RuntimeException {
    public ValidationException(String message) {
        super(message);
    }
}