package com.ourkitchen.app.auth.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ourkitchen.app.auth.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long>{

	public Optional<UserEntity> findByEmail(String email);
}
