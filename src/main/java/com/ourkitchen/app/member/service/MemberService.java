package com.ourkitchen.app.member.service;

import org.springframework.stereotype.Service;

import com.ourkitchen.app.member.dto.UserInfo;
import com.ourkitchen.data.entity.UserEntity;
import com.ourkitchen.data.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class MemberService {

	private final UserRepository userRepo;
	
	public void updateUser(UserEntity userEntity, UserInfo userInfo) {
		userEntity.setEmail(userInfo.getEmail());
		userEntity.setPhoneNum(userInfo.getPhoneNum());
		
		userRepo.save(userEntity);
	}
}
