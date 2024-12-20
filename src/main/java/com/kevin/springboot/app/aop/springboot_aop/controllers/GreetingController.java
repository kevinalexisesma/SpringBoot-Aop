package com.kevin.springboot.app.aop.springboot_aop.controllers;

import java.util.Collections;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/greeting")
    public ResponseEntity<?> greeting(){
        return ResponseEntity.ok(Collections.singletonMap("greeting", null));
    }
}
