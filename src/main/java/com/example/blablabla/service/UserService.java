package com.example.blablabla.service;

import com.example.blablabla.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUser(String id);
}
