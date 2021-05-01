package com.ourkitchen.app.auth.provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import com.ourkitchen.app.auth.dto.UserDetails;
import com.ourkitchen.app.auth.service.UserDetailsServiceImpl;

import lombok.NonNull;

@Component
public class AuthenticationProviderImpl implements AuthenticationProvider{
	@Autowired
	UserDetailsServiceImpl userService;
	@NonNull
	private BCryptPasswordEncoder pwdEncoder;
	
	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException{
		UsernamePasswordAuthenticationToken token = (UsernamePasswordAuthenticationToken)authentication;
		String email = (String)token.getPrincipal();
		String pwd = (String)token.getCredentials();
		UserDetails userDetailsImpl = (UserDetails) userService.loadUserByUsername(email);
		
		if(!pwdEncoder.matches(pwd, userDetailsImpl.getPassword())) {
			throw new BadCredentialsException(userDetailsImpl.getUsername()+" Invaild password");
		}
		
		
		return new UsernamePasswordAuthenticationToken(userDetailsImpl, pwd, userDetailsImpl.getAuthorities());
 	}
	
    @Override
    public boolean supports(Class<?> authentication) {
        return authentication.equals(UsernamePasswordAuthenticationToken.class);
    }
}
