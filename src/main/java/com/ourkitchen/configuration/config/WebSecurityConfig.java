package com.ourkitchen.configuration.config;

import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.ourkitchen.app.auth.service.UserService;

import lombok.AllArgsConstructor;

@Configuration
@EnableWebSecurity
@AllArgsConstructor
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
	private UserService userService;

	@Override
	public void configure(WebSecurity web){
		web.ignoring().requestMatchers(PathRequest.toStaticResources().atCommonLocations());
	}
	
	@Override
	public void configure(HttpSecurity http) throws Exception{
		http.csrf().disable().authorizeRequests()
			//.antMatchers("/about").authenticated() //로그인을 요구할 경로
			//.antMatchers("/admin/**").hasRole("ADMIN")
			.antMatchers("/user/myinfo").hasRole("MEMBER")
			.anyRequest().permitAll()
		.and()
			.formLogin()
			.loginPage("/auth/login")
			.defaultSuccessUrl("/index")
			.usernameParameter("email")
			.permitAll()
		.and()
			.logout()
			.logoutRequestMatcher(new AntPathRequestMatcher("/auth/logout"))
			.logoutSuccessUrl("/auth/logout/result")
			.invalidateHttpSession(true)
		;//.and()
			//.addFilterBefore(filter, beforeFilter)
	}
	
	@Bean
	public AuthenticationManager getAuthenticationManager() throws Exception{
		return super.authenticationManagerBean();
	}
	
	
	
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception{
		auth.userDetailsService(userService).passwordEncoder(passwordEncoder());
		//auth.authenticationProvider();
	}
}
