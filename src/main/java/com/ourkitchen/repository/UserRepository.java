package com.ourkitchen.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ourkitchen.auth.vo.User;

public interface UserRepository extends JpaRepository<User, Integer>{
}
