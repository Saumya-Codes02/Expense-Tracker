package com.flatmate.expensemanager.controller;

import com.flatmate.expensemanager.model.User;
import com.flatmate.expensemanager.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    //Create
    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    //Read All
    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
}
