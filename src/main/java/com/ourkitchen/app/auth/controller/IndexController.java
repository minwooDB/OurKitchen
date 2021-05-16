package com.ourkitchen.app.auth.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.ourkitchen.app.auth.dto.UserDetails;

@Controller
public class IndexController {

	@GetMapping("/")
	public String index(@AuthenticationPrincipal UserDetails userDetail) {
		
		return "main";
	}
}