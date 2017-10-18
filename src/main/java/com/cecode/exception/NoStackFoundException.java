package com.cecode.exception;

public class NoStackFoundException extends Exception {

    public NoStackFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoStackFoundException(final String message) {
        super(message);
    }
}
