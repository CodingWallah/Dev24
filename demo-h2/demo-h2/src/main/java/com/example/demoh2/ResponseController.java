package com.example.demoh2;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class ResponseController {
    
    @GetMapping("/res")
    public ResponseEntity<?> resExample() {
        //return str;
        ArrayList<String> list = new ArrayList<>();
        list.add("Shivam");
        list.add("CodingWallahSir");

        String str = "Values Not Found";

        Map<String,String> responseBody = new HashMap<>();
        responseBody.put("name", "Shivam Sharma");
       
        return ResponseEntity.ok().body(responseBody);

    }

    @GetMapping("/notfound")
    public ResponseEntity<Void> getNotFound() {
       return ResponseEntity.status(400).build();   
    }

    @GetMapping("/error")
    public ResponseEntity<Void> getError() {
       return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();   
    }
    
    @GetMapping("/headers")
    public ResponseEntity<?> getHeaders() {
        HttpHeaders headers = new HttpHeaders(); 
        
      // Set Cache-Control header
      //Cookie ki expire - 1 hr me expire 
      // set url - of new location
        //seat auth
        headers.set(HttpHeaders.AUTHORIZATION, "Bearer <token xyz >");
        //set type of content
        headers.set(HttpHeaders.CONTENT_TYPE, "application/json");

        //cookie set
        headers.add(HttpHeaders.SET_COOKIE, "myCookie=cookieValue");

        //add custom header
        headers.add("Custom Name", "Hidden info");
        return ResponseEntity.status(200)
       .headers(headers)
       .body("Headers inside");   
    }
    
}
