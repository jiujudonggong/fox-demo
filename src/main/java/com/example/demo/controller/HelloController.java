package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("hello")
    public String hello(){
        return "world";
    }


    @GetMapping("nihao")
    public String nihao(){
        return "bingx";
    }

    @GetMapping("info")
    public String info(){
        return "test";
    }
}
