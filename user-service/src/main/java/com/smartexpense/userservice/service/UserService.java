package com.smartexpense.userservice.service;

import com.smartexpense.userservice.dto.RegisterUserRequest;
import com.smartexpense.userservice.entity.User;

public interface UserService {

    User registerUser(RegisterUserRequest request);
}
