package com.ourkitchen.app.auth.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.ourkitchen.app.auth.dto.UserDetails;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class IndexController {

	@GetMapping("/")
	public String index(@AuthenticationPrincipal UserDetails userDetail) {
		if(userDetail != null) {
			log.info(userDetail.toString());
			log.info(userDetail.getUser().toString());
		}
		return "main";
	}
}