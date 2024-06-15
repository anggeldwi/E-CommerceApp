package com.alta.e_commerce_app.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.alta.e_commerce_app.entity.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByEmail(String email);
}