package com.ourkitchen.auth.dto;

import java.time.LocalDateTime;

import com.ourkitchen.auth.entity.UserEntity;
import com.ourkitchen.auth.vo.Classification;

public class UserDto {
	private Long id;
	private String email;
	private String name;
	private String password;
	private String phoneNum;
	private Classification classification;
	private LocalDateTime lastLogin;
	
//	public UserEntity toEntity() {
//		return UserEntiry.builder()
//				.id(id)
//				.email(email)
//				.password(password)
//				.name(name)
//				.phoneNum(phoneNum)
//				.classification(classification)
//				.build()
//	}
	
	public UserDto(Long id, String email, String name, String password, String phoneNum, Classification classification,
			LocalDateTime lastLogin) {
		super();
		this.id = id;
		this.email = email;
		this.name = name;
		this.password = password;
		this.phoneNum = phoneNum;
		this.classification = classification;
		this.lastLogin = lastLogin;
	}
}
