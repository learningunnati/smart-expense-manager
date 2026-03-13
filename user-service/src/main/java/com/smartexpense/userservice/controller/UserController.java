package com.smartexpense.userservice.controller;

import com.smartexpense.userservice.dto.RegisterUserRequest;
import com.smartexpense.userservice.entity.User;
import com.smartexpense.userservice.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/register")
    public User registerUser(@RequestBody RegisterUserRequest request) {
        return userService.registerUser(request);
    }

}