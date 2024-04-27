package com.example.looseproject;

import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class NewController {

    @GetMapping("/divide")
    public ResponseEntity<Object> getMethodName(@RequestParam int dividend, @RequestParam int divisor) {
       if(divisor==0) {
        throw new DivideByZero("Can't Divide by Zero, Ha bhai mayank kya ho raha");
       }

       int result = dividend/divisor;
       return ResponseEntity.ok(result);
        // try {
        //     int result = dividend/divisor;
        //     return ResponseEntity.ok(result);
        // } catch (Exception e) {
        //    return ResponseEntity.status(400).body(e.getMessage());
        // }
        
    }

    @GetMapping("/book/{id}")
    public ResponseEntity<?> findBookByid(@PathVariable int id) {
        if(id==2)  return ResponseEntity.ok("Java Book");
        else {
            throw new BookNotFound("Book Nahi Mile Hume");
        }
    }
    
  }
