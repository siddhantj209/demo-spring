package com.sid.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/test")
    public void test() {
        System.out.println("in test");
    }

    @PostMapping("/test")
    public void testpost() {
        System.out.println("in test");
    }
}
