package com.example.user.service.exceptions;

public class ResourceNotFoundExceptions extends RuntimeException {

    // extra properties that you want to add
    public ResourceNotFoundExceptions() {
        super("Resource not found!");
    }

    public ResourceNotFoundExceptions(String message) {
        super(message);
    }
}
