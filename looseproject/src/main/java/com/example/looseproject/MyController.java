package com.example.looseproject;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;


@RestController
public class MyController {
    
    @GetMapping("responseentity")
    public ResponseEntity<String> getMethodName() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Custom-Header-code", "kya haal hai");
        return ResponseEntity.status(HttpStatus.NOT_FOUND).headers(headers).body("ye meri solid foundation hai");
    }

    @GetMapping("path11")
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String getMethodName1() {
        return "index";
    }

    @GetMapping("thirdPartyAPI")
    public ResponseEntity<?> getAPI() {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8080/responseentity"; //3rd party api
        String fetchResponse =  restTemplate.getForObject(url, String.class);
        return ResponseEntity.ok().body(fetchResponse+" !! boom");
    }
    
   
}
