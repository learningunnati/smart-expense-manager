package com.smartexpense.userservice.controller;

import com.smartexpense.userservice.dto.LoginRequest;
import com.smartexpense.userservice.dto.RegisterUserRequest;
import com.smartexpense.userservice.entity.User;
import com.smartexpense.userservice.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/register")
    public User registerUser(@Valid @RequestBody RegisterUserRequest request) {
        return userService.registerUser(request);
    }

    @PostMapping("/login")
    public User login(@RequestBody LoginRequest request) {
        return userService.login(request);
    }

}