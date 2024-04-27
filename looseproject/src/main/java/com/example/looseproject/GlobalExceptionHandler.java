package com.example.looseproject;

import org.apache.catalina.connector.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    
    @ExceptionHandler(DivideByZero.class)
    public ResponseEntity<Object> handleDivideByZero(DivideByZero ex){
        return ResponseEntity.status(400).body(ex.getMessage());
    }

    @ExceptionHandler(BookNotFound.class)
    public ResponseEntity<String> handleDivideByZero(BookNotFound ex){
        return ResponseEntity.status(400).body(ex.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleAllExceptions(Exception ex){
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ex.getMessage());
    }


}
