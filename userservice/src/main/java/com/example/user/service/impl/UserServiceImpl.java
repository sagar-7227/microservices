package com.example.user.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.user.service.entities.User;
import com.example.user.service.exceptions.ResourceNotFoundExceptions;
import com.example.user.service.repositories.UserRepository;
import com.example.user.service.services.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    // User Operations
    private UserRepository userRepository;

    // Create a new user
    @Override
    public User saveUser(User user) {
        // generate userId
        String randomUserId = UUID.randomUUID().toString();
        user.setUserId(randomUserId);
        return userRepository.save(user);
    }

    @Override
    // get all users
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    // get single user of given userId
    public User getUser(String userId) {
        return userRepository.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundExceptions("User not found with id: " + userId));
    }

}
