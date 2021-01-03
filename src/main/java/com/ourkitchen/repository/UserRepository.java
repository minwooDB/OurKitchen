package com.ourkitchen.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ourkitchen.auth.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer>{
}
