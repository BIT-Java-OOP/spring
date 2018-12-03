package com.example.blablabla.controller;

import com.example.blablabla.entity.User;
import com.example.blablabla.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/")
    public List<User> getUsers(){
        return userService.getAllUsers();
    }

    @GetMapping(value = "/{id}")
    public User getUser(@PathVariable String id){
        return userService.getUser(id);
    }


}
