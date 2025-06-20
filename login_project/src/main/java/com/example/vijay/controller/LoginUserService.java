package com.example.vijay.controller;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
import org.springframework.stereotype.Service;

import com.example.vijay.model.LoginUser;
//import com.example.vijay.model.LoginUser;
import com.example.vijay.repository.LoginUserRepo;

@Service
public class LoginUserService {

    @Autowired
    private LoginUserRepo loguserrepo;

    public LoginUser loginService(String username, String email) {
        LoginUser user = new LoginUser();
        user.setUsername(username);
        user.setEmail(email);
        loguserrepo.save(user);
        return user;
    }
}
