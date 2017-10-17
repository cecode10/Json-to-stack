package com.cecode.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@Component
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler()
    public ResponseEntity handleNotFound(Exception ex, WebRequest request) {
        return handleExceptionInternal(ex, "Not found",
                new HttpHeaders(), HttpStatus.NOT_FOUND, request);
    }
}
