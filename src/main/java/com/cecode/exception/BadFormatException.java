package com.cecode.exception;

public class BadFormatException extends Exception {

    public BadFormatException(String message, Throwable cause) {
        super(message, cause);
    }

    public BadFormatException(final String message) {
        super(message);
    }
}
