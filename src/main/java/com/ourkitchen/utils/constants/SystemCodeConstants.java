package com.ourkitchen.utils.constants;

import com.ourkitchen.utils.enums.StatusCode;

public class SystemCodeConstants {
	/*** 취소 예약 코드*/
	public final static String RESERVATION_CANCEL = StatusCode.C00.toString();	
	/*** 정상 예약 코드*/
	public final static String RESERVATION_BOOK = StatusCode.C01.toString();
	/*** 예약취소 코드*/
	public final static String RESERVATION_WAIT = StatusCode.C02.toString();
	
	/*** 탈퇴 계정 코드*/
	public final static String ACCOUNT_WITHDRAWAL = StatusCode.C00.toString(); 	
	/*** 일반 계정 코드*/
	public final static String ACCOUNT_ACTIVE = StatusCode.C01.toString();
	/*** 휴면 계정 코드*/
	public final static String ACCOUNT_DORMANT = StatusCode.C02.toString(); 	
	
	public final static String ROLE_PATNER = "ROLE_PARNER";
	public final static String ROLE_USER = "ROLE_USER";
	public final static String ROLE_ADMIN = "ROLE_ADMIN";
}