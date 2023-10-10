package com.spring.titans.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/titans")
public class TechControl {
    @GetMapping
    public String titans(){
        return "Hello World";
    }
}
