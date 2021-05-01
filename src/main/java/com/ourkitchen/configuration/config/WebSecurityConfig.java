package com.ourkitchen.configuration.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import com.ourkitchen.app.auth.service.UserDetailsServiceImpl;
import com.ourkitchen.configuration.security.CustomLoginFailureHandler;
import com.ourkitchen.configuration.security.CustomLoginSuccessHandler;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
	@Autowired
private UserDetailsServiceImpl userDetailsService;
	
	private static final String[] URI_RESOURCE_LOCATIONS = { "/css/**", "/js/**", "/plugins/**", "/img/**" };
	
	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().requestMatchers(PathRequest.toStaticResources().atCommonLocations());
	}

	@Override
	public void configure(HttpSecurity http) throws Exception{
		http
		.csrf().disable()
		.userDetailsService(userDetailsService)
		.authorizeRequests()
			.antMatchers(URI_RESOURCE_LOCATIONS).permitAll()
			.antMatchers("/", "/login", "/signup", "/logout", "/login/**").permitAll()
			.antMatchers("/user/**").hasAnyRole("ROLE_PARTNER")
			.antMatchers("/admin/**").hasAnyRole("ROLE_ADMIN")
			.anyRequest().authenticated()
        .and()
	        .formLogin()
            .loginPage("/login")
            .successHandler(customLoginSuccessHandler())
            .failureHandler(customLoginFailureHandler())
        .and()
		.logout()
		.logoutUrl("/logout")
        .invalidateHttpSession(true)
        .logoutSuccessUrl("/");
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	public AuthenticationSuccessHandler customLoginSuccessHandler() {
		CustomLoginSuccessHandler authenticationSuccessHandler  = new CustomLoginSuccessHandler();
		authenticationSuccessHandler.setUserService(userDetailsService);
		return authenticationSuccessHandler;
	}

	public AuthenticationFailureHandler customLoginFailureHandler() {
		CustomLoginFailureHandler authenticationFailureHandler =
                new CustomLoginFailureHandler("/login" + "?error");
        authenticationFailureHandler.setUseForward(true);
        authenticationFailureHandler.setUserServive(userDetailsService);

        return authenticationFailureHandler;
	}

//    @Bean
//    public LoginUrlAuthenticationEntryPoint loginUrlAuthenticationEntryPoint() {
//        return new CustomAuthenticationEntryPoint("/login");
//    }
	
//	@Bean
//	public CustomAuthenticationFilter customAuthenticationFilter() throws Exception {
//		CustomAuthenticationFilter customAuthenticationFilter = new CustomAuthenticationFilter(authenticationManager());
//		customAuthenticationFilter.setFilterProcessesUrl("/login");
//		customAuthenticationFilter.setAuthenticationSuccessHandler(customLoginSuccessHandler());
//		customAuthenticationFilter.afterPropertiesSet();
//		return customAuthenticationFilter;
//	}
	
//	@Override
//	public void configure(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
//		authenticationManagerBuilder.authenticationProvider(customAuthenticationProvider());
//	}

}
