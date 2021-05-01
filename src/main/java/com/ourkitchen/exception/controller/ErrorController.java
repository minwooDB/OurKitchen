package com.ourkitchen.exception.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("/error")
public class ErrorController {
	
	@GetMapping("/unauthorized")
	public ResponseEntity<Void> unautorized() {
		return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
	}
}
