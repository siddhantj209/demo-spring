package com.sid.demo.controller;

import com.sid.demo.service.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
public class TestController {

    @Autowired
    private DemoService demoService;

    @GetMapping("/test")
    public ResponseEntity<String> test() {
        System.out.println("in test ");
        return ResponseEntity.ok("test fine");
    }

    @PostMapping("/test")
    public void testpost(@RequestParam int age, @RequestParam String name) {
        System.out.println("Name and Age recieved: " + name + age);
    }

    @DeleteMapping("/")
    public void delete(String id) {
        demoService.delete(id);
    }

    @PutMapping
    public void update(String id, String name) {
        demoService.update(id, name);
    }
}
