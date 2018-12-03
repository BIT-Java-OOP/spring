package com.example.blablabla.service;

import com.example.blablabla.entity.User;
import com.example.blablabla.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(String id) {
        return userRepository.findUserById(id)
                .orElseThrow(NullPointerException::new);
    }
}
