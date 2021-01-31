package com.ourkitchen.app.auth.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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

import com.ourkitchen.app.auth.dto.UserDetailsImpl;
import com.ourkitchen.app.data.entity.UserEntity;
import com.ourkitchen.app.data.repository.UserRepository;
import com.ourkitchen.enums.Role;
import com.ourkitchen.enums.StatusCode;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Service("userService")
@AllArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService{
	
	private UserRepository userRepo;
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		UserEntity userEntity = userRepo.findByEmail(email);
		
		if(userEntity==null) throw new UsernameNotFoundException("can not found user");
		
		log.debug("login user email: {}", userEntity.getEmail());
		
		List<GrantedAuthority> authorities = new ArrayList<>();
		
		if(StringUtils.equals(email, "ourkitchen_admin@example.com")) {
			authorities.add(new SimpleGrantedAuthority(Role.ADMIN.getValue()));
		}else {
			authorities.add(new SimpleGrantedAuthority(Role.MEMBER.getValue()));
		}
		
		return new User(userEntity.getEmail(), userEntity.getPassword(), authorities);
	}
	
	@Transactional
	public Long joinUser(UserDetailsImpl userDto) {
		BCryptPasswordEncoder pwEncoder = new BCryptPasswordEncoder();
		userDto.setPassword(pwEncoder.encode(userDto.getPassword()));
		userDto.setActive(StatusCode.C01);
		userDto.setLastLogin(LocalDateTime.now());
		return userRepo.save(userDto.toEntity()).getId();
	}
}
