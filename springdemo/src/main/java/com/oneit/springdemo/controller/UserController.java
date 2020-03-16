package com.oneit.springdemo.controller;

import com.oneit.springdemo.model.User;
import com.oneit.springdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("")
    public List<User> getAllUsers(){
        return userService.getUsers();
    }

    @GetMapping("/{userid}")
    public User getUserByUserid(@PathVariable Integer userid){
        System.out.println(userid);
        return userService.getUserById(userid);
    }

    @PostMapping("")
    public User registUser(@RequestBody User user) {
        System.out.println(user);
        return userService.registUser(user);
    }

    @PutMapping("/{userid}")
    public void modifyUser(
            @PathVariable Integer userid,
            @RequestBody User user){
        userService.modifyUser(userid, user);
    }

    @DeleteMapping("/{userid}")
    public void removeUser(@PathVariable Integer userid){
        userService.removeUser(userid);
    }
}
