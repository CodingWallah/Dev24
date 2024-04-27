package com.example.demoh2.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    
    @ExceptionHandler(ArithmeticException.class)
    public ResponseEntity<?> handleArithmeticErrors(ArithmeticException ae){
        return ResponseEntity.status(500)
        .body("Can't divide by zero");  
    }

     
    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> handleAllExceptions(Exception e){
        return ResponseEntity.status(500)
        .body(e);  
    }

    @ExceptionHandler(MyCustomException.class)
    public ResponseEntity<?> handleMyCustomException(MyCustomException me){
        return ResponseEntity.status(505)
        .body(me.getMessage());  
    }

   
}
