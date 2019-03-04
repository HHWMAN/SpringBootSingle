package com.zx.demo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordController {
    @RequestMapping("/hello")
    public String index(){
        return "hello world";
    }
}