package com.ourkitchen.app.auth.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ourkitchen.app.auth.dto.UserDto;
import com.ourkitchen.app.auth.service.UserService;
import com.ourkitchen.exception.UserAlreadyExistsException;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@AllArgsConstructor
@Controller
public class AuthController {
	
	private final UserService userService;

	@RequestMapping("/login")
	public String loginForm() {
		return "login";
	}
	
	@GetMapping("/signup")
	public String dispSignup() {
		return "signup";
	}
	
	@PostMapping("/signup")
	public String signup(@Valid UserDto userDto, BindingResult errors) {
        if(errors.hasErrors()) {
            //model.addAttribute("member", userDto);
            //model.addAllAttributes(memAuthService.validateHandling(errors));
            return "register";
        }

		try {
	log.info("----------userDto : {}", userDto);
			userService.signup(userDto);
		} catch (UserAlreadyExistsException e) {
			errors.addError(new ObjectError("error_email", e.getMessage()));
		}
		return "main";
	}
	
}