package com.example.vijay.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
//
//import com.example.vijay.model.LoginUser;
//import com.example.vijay.controller.LoginUserService;
import com.example.vijay.model.LoginUser;

@CrossOrigin(origins = "*")
@RestController
public class LoginUserController {

    @Autowired
    private LoginUserService logser;

    @PostMapping("/login")
    public LoginUser login(@RequestBody LoginUser request) {
        return logser.loginService(request.getUsername(), request.getEmail());
    }
    
    
}
