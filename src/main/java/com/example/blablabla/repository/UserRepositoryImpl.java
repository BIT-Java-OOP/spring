package com.example.blablabla.repository;

import com.example.blablabla.entity.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class UserRepositoryImpl implements UserRepository{
    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User());
        users.add(new User());
        users.add(new User());
        users.add(new User());
        users.add(new User());
    }

    @Override
    public List<User> findAll() {
        return users;
    }

    @Override
    public Optional<User> findUserById(String id) {
        return users.stream()
                .filter(user -> user.getName().equals(id))
                .findAny();
    }
}
