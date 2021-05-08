package com.ourkitchen.utils.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Role {
	
	ROLE_PARTER("ROLE_PARTER"), //partner
	ROLE_USER("ROLE_USER"),  //user
	ROLE_ADMIN("ROLE_ADMIN");
	
	private String code;
		
}