package com.ourkitchen.data.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ourkitchen.data.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long>{

	public UserEntity findByEmailAndPassword(String email, String password);
	
	public Optional<UserEntity> findByEmail(String email);
}
