package com.example.fctoop.controller;

import com.example.fctoop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/get-age")
    public int getAge(){
        return 27;
    }

    @PostMapping("/process")
    public String process(){
        String message = userService.process();
        return message;
    }
}
