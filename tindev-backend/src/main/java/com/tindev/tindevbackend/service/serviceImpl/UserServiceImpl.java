package com.tindev.tindevbackend.service.serviceImpl;

import com.tindev.tindevbackend.model.User;
import com.tindev.tindevbackend.repository.UserRepository;
import com.tindev.tindevbackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }
}
