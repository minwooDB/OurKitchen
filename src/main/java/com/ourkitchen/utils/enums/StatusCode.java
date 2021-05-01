package com.ourkitchen.utils.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum StatusCode {
	C00("C00", "취소", "탈퇴"), 
	C01("C01", "예약", "정상"), 
	C02("C02", "대기", "휴면");
	
	private String code;
	private String reservationCode;
	private String accountCode;
}