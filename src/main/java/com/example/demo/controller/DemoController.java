package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @RequestMapping("/index")
    public String index() {
        return "hello world";
    }

    @RequestMapping("/login")
    public String login() {
        return "hello world";
    }
}
