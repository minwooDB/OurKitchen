package com.ourkitchen.app.auth.dto;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;

import com.ourkitchen.data.entity.UserEntity;

import lombok.Getter;

@Getter
public class UserDetails extends User{

	private static final long serialVersionUID = 54361460258288529L;
	
	private UserEntity user;
			
	public UserDetails(UserEntity user){
		this(user, true, true, true, true);
	}
		
    public UserDetails(UserEntity user, boolean enabled, boolean accountNonExpired,
            boolean credentialsNonExpired, boolean accountNonLocked) {

        super(user.getEmail(), user.getPassword(),
                enabled, accountNonExpired, credentialsNonExpired, accountNonLocked,
                AuthorityUtils.createAuthorityList(user.getRole().getCode()));

        this.user = user;

    }
}