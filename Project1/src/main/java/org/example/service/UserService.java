package org.example.service;


import org.example.model.User;

public class UserService {
    public void greet(User user) {
        System.out.println("Hello, " + user.name + "!");
    }
}
