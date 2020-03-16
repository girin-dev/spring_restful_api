package com.oneit.springdemo.controller;

import com.oneit.springdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/")
public class HomeController {

    @Autowired
    private UserService userService; // 보통 멤버변수로 잡음

    @GetMapping("")
    public Map<String,String> home() {
        Map<String,String> res = this.userService.getMessage();
        return res;
    }

}