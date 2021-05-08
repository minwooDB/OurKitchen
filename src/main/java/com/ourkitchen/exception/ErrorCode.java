package com.ourkitchen.exception;

import lombok.Getter;

@Getter
public enum ErrorCode {
	
	AUTHENTICATION_FAILED(401, "AUTH_001", "Authentication_Failed"),
	LOGIN_FAILED(401, "AUTH_002", "Login_Failed"),
	ACCESS_DENIED(401, "AUTH_003", "Access_Denied"),
	TOKEN_GENERATION_FAILED(500, "AUTH_004", "Token_Generation_Failed")
	;
	
	private final String code;
	private final String message;
	private int status;
	
	private ErrorCode(final int status, final String code, final String message) {
		this.code = code;
		this.message = message;
		this.status = status;
	}
}