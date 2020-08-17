package com.java.redfood.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(Object id) {
        super("Resorce not found. Id " + id);
    }
}
