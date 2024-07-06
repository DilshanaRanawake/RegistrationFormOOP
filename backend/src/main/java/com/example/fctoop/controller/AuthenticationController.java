package com.example.fctoop.controller;


import com.example.fctoop.dto.CustomerDetailDto;
import com.example.fctoop.model.LoginRequest;
import com.example.fctoop.model.RegisterRequest;
import com.example.fctoop.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@CrossOrigin("*")
public class AuthenticationController {
    private AuthenticationService authenticationService;

    @Autowired
    public AuthenticationController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest loginRequest){
        String response = authenticationService.login(loginRequest);
        return response;
    }
    @PostMapping("/register")
    public String register(@RequestBody RegisterRequest registerRequest){
        String response = authenticationService.register(registerRequest);
        return response;
    }

    @GetMapping("/get-user-detail")
    public CustomerDetailDto getUserDetail(){
        CustomerDetailDto response= authenticationService.getUserDetail();
        return response;
    }
}



