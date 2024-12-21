package com.sid.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
public class TestController {
    @GetMapping("/test")
    public ResponseEntity<String> test() {
        System.out.println("in test ");
        return ResponseEntity.ok("test fine");
    }

    @PostMapping("/test")
    public void testpost(@RequestParam int age, @RequestParam String name) {
        System.out.println("Name and Age recieved: " + name + age);
    }
}
