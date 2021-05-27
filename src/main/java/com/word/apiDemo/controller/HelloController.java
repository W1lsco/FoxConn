package com.word.apiDemo.controller;

import java.util.ArrayList;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping(value = "/test", produces = "application/json")
    public String index() {
        return "Greetings from Spring Boot!\n";
    }

}