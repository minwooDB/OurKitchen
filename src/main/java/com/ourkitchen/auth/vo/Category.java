package com.ourkitchen.auth.vo;

public enum Category {
	KOREAN("Q01","한식"),
	CHINESE("Q02","중식"),
	JAPANESE("Q03","일식/수산물"),
	SNACK("Q04","분식"),
	CHICKEN("Q05","닭/오리요s리"),
	WESTERN("Q06","양식"),
	FASTFOOD("Q07","패스트푸드"),
	BREAD("Q08","제과제빵떡케익"),
	BAR("Q09","유흥주점"),
	FUSION("Q10","별식/퓨전요리"),
	CAFE("Q12","커피점/카페"),
	DELIVERY("Q13","배달"),
	ETC("Q14","기타"),
	BUFFET("Q15","뷔페");
	
	public String code;
	public String desc;

	Category(String code, String desc) {
		this.code = code;
		this.desc = desc;
	}
}