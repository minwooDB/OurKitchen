package com.ourkitchen.app.auth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.ourkitchen.app.auth.dto.UserDto;
import com.ourkitchen.app.auth.service.UserDetailsServiceImpl;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@AllArgsConstructor
@Controller
public class AuthController {
	
	@Autowired
	private UserDetailsServiceImpl userService;
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	@GetMapping("/user/signup") //회원가입 페이지
	public String dispSignup() {
		return "auth/signup";
	}
	
	@PostMapping("/user/signup") //회원가입 처리
	public String execSignup(UserDto dto) {
		log.debug("----------join user id: {}", dto.getEmail());
		userService.joinUser(dto);
		
		return "redirect:/user/login";
	}
	
	@GetMapping("/user/login")
	public String dispLogin() {
		return "auth/login";
	}
	
	@GetMapping("/user/login/result")
	public String dispLoginResult() {
		return "auth/loginSuccess";
	}
	
	@GetMapping("/user/logout/result")
	public String dispLogout() {
		return "auth/logout";
	}
	
	@GetMapping("/user/denied")
	public String dispDenied() {
		return "auth/denied";
	}
	
	@GetMapping("/user/info")
	public String dispMyInfo() {
		return "auth/myinfo";
	}
}