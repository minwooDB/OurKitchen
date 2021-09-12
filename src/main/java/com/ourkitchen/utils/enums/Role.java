package com.ourkitchen.utils.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Role {
	
	ROLE_PARTNER("ROLE_PARTNER", "파트너 회원"), //partner
	ROLE_USER("ROLE_USER", "일반 회원"),  //user
	ROLE_ADMIN("ROLE_ADMIN", "관리자");
	
	private String code;
	private String desc;
		
}