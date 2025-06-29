package org.example.main;

import org.example.model.User;
import org.example.service.UserService;

public class Main {
    public static void main(String[] args) {
        User user = new User("subrat");
        UserService service = new UserService();
        service.greet(user);
    }
}