package com.ourkitchen.exception.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.ourkitchen.exception.ErrorCode;
import com.ourkitchen.exception.LoginFailedException;
import com.ourkitchen.utils.CommonResponse;

import lombok.extern.slf4j.Slf4j;

@ControllerAdvice
@Slf4j
public class ExceptionController {

	public ResponseEntity<CommonResponse> BadRequestException(final RuntimeException ex){
		log.warn("error {}", ex.getMessage());
		
		CommonResponse response = CommonResponse.builder()
				.code("400")
				.message(ex.getMessage())
				.status(HttpStatus.BAD_REQUEST.value())
				.build();
		return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler({AccessDeniedException.class})
	public ResponseEntity<CommonResponse> handleAccessDeniedException(final AccessDeniedException ex) {
		log.warn("error {}", ex.getMessage());
		
		CommonResponse response = CommonResponse.builder()
				.code(ErrorCode.ACCESS_DENIED.getCode())
				.message(ErrorCode.ACCESS_DENIED.getMessage())
				.status(ErrorCode.ACCESS_DENIED.getStatus())
				.build();
		
		return new ResponseEntity<>(response, HttpStatus.UNAUTHORIZED);
	}
	
	@ExceptionHandler({
		LoginFailedException.class,
		BadCredentialsException.class})
	public ResponseEntity<CommonResponse> handlerLoginFailedException(RuntimeException ex) {
		log.warn("error {}", ex.getMessage());
		
		CommonResponse response = CommonResponse.builder()
				.code(ErrorCode.LOGIN_FAILED.getCode())
				.message(ErrorCode.LOGIN_FAILED.getMessage())
				.status(ErrorCode.LOGIN_FAILED.getStatus())
				.build();
		
		return new ResponseEntity<>(response, HttpStatus.UNAUTHORIZED);
	}
	
	@ExceptionHandler({ 
		RuntimeException.class,
		Exception.class })
	public ResponseEntity<Object> handleAll(final Exception ex){
		log.info(ex.getClass().getName());
		log.error("error", ex);
		return new ResponseEntity<>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
