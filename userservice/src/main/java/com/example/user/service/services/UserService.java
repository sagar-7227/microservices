package com.example.user.service.services;

import java.util.List;

import com.example.user.service.entities.User;

public interface UserService {
    // User Operations

    // Create a new user
    public User saveUser(User user);

    // get all users
    public List<User> getAllUsers();

    // get single user of given userId
    public User getUser(String userId);

    
}
