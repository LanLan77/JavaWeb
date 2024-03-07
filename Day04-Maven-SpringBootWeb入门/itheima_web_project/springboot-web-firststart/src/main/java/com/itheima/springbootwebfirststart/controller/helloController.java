package com.itheima.springbootwebfirststart.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//请求注解类
@RestController
public class helloController {
    @RequestMapping("/hello")
    public String hello() {
        System.out.println("hello ");
        return "Hello World 你好";
    }
}
