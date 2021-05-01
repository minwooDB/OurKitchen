package com.ourkitchen.exception;

public class UserAlreadyExistsException extends RuntimeException{

	private static final long serialVersionUID = -9092193991643590871L;

	public UserAlreadyExistsException() {
		super();
	}
	
	public UserAlreadyExistsException(String msg) {
		super(msg);
	}
}