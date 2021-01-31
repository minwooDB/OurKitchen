package com.ourkitchen.app.auth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.ourkitchen.app.auth.dto.UserDetailsImpl;
import com.ourkitchen.app.auth.service.UserDetailsServiceImpl;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@AllArgsConstructor
@Controller
public class AuthController {
	
	@Autowired
	private UserDetailsServiceImpl userDetailService;
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	@GetMapping("/auth/signup") //회원가입 페이지
	public String dispSignup() {
		return "auth/signup";
	}
	
	@PostMapping("/auth/signup") //회원가입 처리
	public String execSignup(UserDetailsImpl dto) {
		log.debug("----------join user id: {}", dto.getEmail());
		userDetailService.joinUser(dto);
		
		return "redirect:/auth/login";
	}
	
	@GetMapping("/auth/login")
	public String dispLogin() {
		return "auth/login";
	}
	
	@PostMapping("/auth/login")
	public String dispLoginResult() {
		
		
		return "redirect:/";
	}
	
	@GetMapping("/auth/logout/result")
	public String dispLogout() {
		return "auth/logout";
	}
	
	@GetMapping("/auth/denied")
	public String dispDenied() {
		return "auth/denied";
	}
	
	@PreAuthorize("hasRole('ROLE_MEMBER')")
	@GetMapping("/auth/info")
	public String dispMyInfo() {
		return "auth/myinfo";
	}
}