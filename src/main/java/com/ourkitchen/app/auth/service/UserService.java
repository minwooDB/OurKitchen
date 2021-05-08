package com.ourkitchen.app.auth.service;

import java.util.List;
import java.util.Optional;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.ourkitchen.app.auth.dto.UserDto;
import com.ourkitchen.app.data.entity.UserEntity;
import com.ourkitchen.app.data.repository.UserRepository;
import com.ourkitchen.exception.UserAlreadyExistsException;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UserService {
	
	private final UserRepository userRepo;
	private final PasswordEncoder passwordEncoder;
	
	public UserEntity signup(UserDto userDto) {
		
		userRepo.findByEmail(userDto.getEmail()).ifPresent(s -> new UserAlreadyExistsException("이미 존재하는 이메일입니다."));
		
		userDto.setPassword(passwordEncoder.encode(userDto.getPassword()));
		UserEntity user = userDto.toEntity();
		
		return userRepo.save(user);
	}
	
	public Optional<UserEntity> findByEmail(final String email) {
		return userRepo.findByEmail(email);
	}
	
	public List<UserEntity> findAll(){
		return userRepo.findAll();
	}
}