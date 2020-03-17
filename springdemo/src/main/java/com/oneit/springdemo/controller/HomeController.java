package com.oneit.springdemo.controller;

import com.oneit.springdemo.service.SecurityService;
import com.oneit.springdemo.service.SecurityServiceImpl;
import com.oneit.springdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
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

    @Autowired
    private SecurityService securityService;

    @GetMapping("security/generate/token")
    public Map<String, Object> generateToken(@RequestParam String subject){
        String token = securityService.createToken(subject, 1000*60*60);
        Map<String, Object> map = new HashMap<>();
        map.put("userid", subject);
        map.put("token", token);
        return map;
    }
    @GetMapping("security/get/subject")
    public String getSubject(@RequestParam String token){
        String subject = securityService.getSubject(token);
        return subject;
    }

}