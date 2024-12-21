package com.sid.demo.service;

import org.springframework.stereotype.Service;

@Service
public class DemoService {


    public void delete(String id) {
        System.out.println("Deleting id: " + id);
    }
}
