package com.example.blablabla.repository;

import com.example.blablabla.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    List<User> findAll();
    Optional<User> findUserById(String id);
}
