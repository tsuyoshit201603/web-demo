package com.example.webdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebDemoController {

    @RequestMapping("/")
    public String home() {
        return "hello world!! dev-sample add";
    }
}
