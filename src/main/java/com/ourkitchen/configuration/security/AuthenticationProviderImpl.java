package com.ourkitchen.configuration.security;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.ourkitchen.app.auth.dto.UserDetails;
import com.ourkitchen.app.auth.service.UserDetailsServiceImpl;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Component
public class AuthenticationProviderImpl implements AuthenticationProvider{
	
	private final UserDetailsServiceImpl userService;
	
	private final PasswordEncoder passwordEncoder;
	
	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException{
		UsernamePasswordAuthenticationToken token = (UsernamePasswordAuthenticationToken)authentication;
		String email = (String)token.getPrincipal();
		String pwd = (String)token.getCredentials();
		UserDetails userDetailsImpl = (UserDetails) userService.loadUserByUsername(email);
		
		if(!passwordEncoder.matches(userDetailsImpl.getPassword(), pwd)) {
			throw new BadCredentialsException(userDetailsImpl.getUsername()+" Invaild password");
		}
		
		
		return new UsernamePasswordAuthenticationToken(userDetailsImpl, pwd, userDetailsImpl.getAuthorities());
 	}
	
    @Override
    public boolean supports(Class<?> authentication) {
        return authentication.equals(UsernamePasswordAuthenticationToken.class);
    }
}
