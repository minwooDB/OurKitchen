package com.ourkitchen.app.auth.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.apache.commons.lang3.StringUtils;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ourkitchen.app.auth.dto.UserDto;
import com.ourkitchen.app.data.entity.UserEntity;
import com.ourkitchen.app.data.repository.UserRepository;
import com.ourkitchen.enums.Role;
import com.ourkitchen.enums.StatusCode;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService{
	
	private UserRepository userRepo;
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		Optional<UserEntity> userEntityWeapper = userRepo.findByEmail(email);
		UserEntity userEntity = userEntityWeapper.get();
		
		List<GrantedAuthority> authorities = new ArrayList<>();
		
		if(StringUtils.equals(email, "ourkitchen_admin@example.com")) {
			authorities.add(new SimpleGrantedAuthority(Role.ADMIN.getValue()));
		}else {
			authorities.add(new SimpleGrantedAuthority(Role.MEMBER.getValue()));
		}
		
		return new User(userEntity.getEmail(), userEntity.getPassword(), authorities);
	}
	
	@Transactional
	public Long joinUser(UserDto userDto) {
		BCryptPasswordEncoder pwEncoder = new BCryptPasswordEncoder();
		userDto.setPassword(pwEncoder.encode(userDto.getPassword()));
		userDto.setActive(StatusCode.C01);
		userDto.setLastLogin(LocalDateTime.now());
		return userRepo.save(userDto.toEntity()).getId();
	}
}
