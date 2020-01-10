package com.tindev.tindevbackend.repository;

import com.tindev.tindevbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}