package com.tindev.tindevbackend.service;

import com.tindev.tindevbackend.model.User;

public interface UserService {

    User findById(Long id);

    User save(User user);
}