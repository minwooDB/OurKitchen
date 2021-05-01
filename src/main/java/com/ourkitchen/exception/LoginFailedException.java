package com.ourkitchen.exception;

public class LoginFailedException extends RuntimeException {

	private static final long serialVersionUID = 5447945475940179295L;

	public LoginFailedException() {
		super(ErrorCode.LOGIN_FAILED.getMessage());
	}
	
	public LoginFailedException(String msg) {
		super(msg);
	}
}
