package com.api.parkingcontrol.exeption;

public class DataIntegrityViolationException extends RuntimeException {
    public DataIntegrityViolationException(String message){
        super(message);
    }
}
