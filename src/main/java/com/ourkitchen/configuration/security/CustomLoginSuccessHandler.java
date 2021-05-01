package com.ourkitchen.configuration.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;

import com.ourkitchen.app.auth.dto.UserDetails;
import com.ourkitchen.app.auth.service.UserDetailsServiceImpl;

import lombok.Setter;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Setter
public class CustomLoginSuccessHandler extends SimpleUrlAuthenticationSuccessHandler{

	private UserDetailsServiceImpl userService;
	
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws ServletException, IOException {
		  UserDetails userDetail = (UserDetails) authentication.getPrincipal();

	        if (userService != null) {
	            boolean isSuccess = userService.setAuthnSuccessByUsername(userDetail.getUsername());
	            log.debug("AuthenticationSuccess User Setting [{}] : {}", userDetail.getUsername(), isSuccess);
	        }

	        super.onAuthenticationSuccess(request, response, authentication);
	}
}