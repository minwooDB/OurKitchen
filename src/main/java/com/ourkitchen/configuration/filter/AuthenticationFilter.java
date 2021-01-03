package com.ourkitchen.configuration.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class AuthenticationFilter extends UsernamePasswordAuthenticationFilter{
	public AuthenticationFilter(AuthenticationManager authManager) {
		super.setAuthenticationManager(authManager);
	}
	
	@Override
	public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) {
		UsernamePasswordAuthenticationToken authRequest = new UsernamePasswordAuthenticationToken(request.getParameter("email"), request.getParameter("password"));
		setDetails(request, authRequest);
		return this.getAuthenticationManager().authenticate(authRequest);
	}
	
}
