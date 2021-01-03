package com.ourkitchen.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Role {
	ADMIN("ROLE_ADMIN"),
	MEMBER("ROLE_MENBER");
	
	private String value;
}
