package com.example.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.model.User;
@Service
public class UserService {

    private List<User> users = new ArrayList<>();

    public UserService() {
        
        users.add(new User("quan", "555"));
        users.add(new User("minh", "456"));
        users.add(new User("quoc", "789"));
    }

    public User findByUsernameAndPassword(String username, String password) {
        return users.stream()
                .filter(user -> user.getUsername().equals(username) && user.getPassword().equals(password))
                .findFirst()
                .orElse(null);
    }
}
