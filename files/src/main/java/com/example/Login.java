package com.example;

public class Login {
    public boolean authenticate(String username, String password) {
        return "user".equals(username) && "pass".equals(password);
    }
}