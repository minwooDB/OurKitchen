package com.ourkitchen.app.auth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.ourkitchen.app.auth.dto.UserDto;
import com.ourkitchen.app.auth.service.UserService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@AllArgsConstructor
@Controller
public class AuthController {
	private UserService userService;
	
	@GetMapping("/")
	public String index() {
		return "/index";
	}
	@GetMapping("/user/signup") //ȸ������ ������
	public String dispSignup() {
		return "/signup";
	}
	
	@PostMapping("/user/signup") //ȸ������ ó��
	public String execSignup(UserDto dto) {
		log.debug("----------join user id: {}", dto.getEmail());
		userService.joinUser(dto);
		
		return "redirect:/user/login";
	}
	
	@GetMapping("/user/login")
	public String dispLogin() {
		return "/login";
	}
	
	@GetMapping("/user/login/result")
	public String dispLoginResult() {
		return "/loginSuccess";
	}
	
	@GetMapping("/user/logout/result")
	public String dispLogout() {
		return "/logout";
	}
	
	@GetMapping("/user/denied")
	public String dispDenied() {
		return "/denied";
	}
	
	@GetMapping("/user/info")
	public String dispMyInfo() {
		return "myinfo";
	}
}