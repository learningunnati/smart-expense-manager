package com.smartexpense.userservice.service.impl;

import com.smartexpense.userservice.dto.RegisterUserRequest;
import com.smartexpense.userservice.entity.User;
import com.smartexpense.userservice.repository.UserRepository;
import com.smartexpense.userservice.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public User registerUser(RegisterUserRequest request) {

        User user = User.builder()
                .name(request.getName())
                .email(request.getEmail())
                .password(request.getPassword())
                .createdAt(LocalDateTime.now())
                .build();

        return userRepository.save(user);
    }

}