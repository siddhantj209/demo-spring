package com.sid.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class TestController {
    @GetMapping("/test")
    public ResponseEntity<String> test() {
        System.out.println("in test ");
        return ResponseEntity.ok("test fine");
    }

    @PostMapping("/test")
    public void testpost(@RequestBody String name) {
        System.out.println("in test post endpoint " + name);
    }
}
