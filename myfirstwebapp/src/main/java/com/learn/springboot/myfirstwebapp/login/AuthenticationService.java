package com.learn.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    boolean authenticate(String name, String password) {
        boolean isNameValid = name.equalsIgnoreCase("learn");
        boolean isPasswordValid = password.equalsIgnoreCase("learn");
        return  isNameValid && isPasswordValid;
    }
}
