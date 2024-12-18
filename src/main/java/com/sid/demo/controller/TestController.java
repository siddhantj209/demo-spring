package com.sid.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class TestController {
    @GetMapping("/test")
    public void test() {
        System.out.println("in test");
    }

    @PostMapping("/test")
    public void testpost() {
        System.out.println("in test post endpoint");
    }
}
