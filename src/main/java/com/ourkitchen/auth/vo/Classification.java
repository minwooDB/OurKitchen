package com.ourkitchen.auth.vo;

import com.ourkitchen.configration.enumConfig.BaseEnumCode;

public enum Classification implements BaseEnumCode<String>{
	PARTNER("p"), //partner
	USER("u") //user
	;
	
	private final String value;

	Classification(String value) {
		this.value = value;
	}

	@Override
	public String getValue() {
		return this.value;
	}
}