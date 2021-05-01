package com.ourkitchen.utils.enums;

public enum Category {
	KOREAN("Q01","�ѽ�"),
	CHINESE("Q02","�߽�"),
	JAPANESE("Q03","�Ͻ�/���깰"),
	SNACK("Q04","�н�"),
	CHICKEN("Q05","��/�����丮"),
	WESTERN("Q06","���"),
	FASTFOOD("Q07","�н�ƮǪ��"),
	BREAD("Q08","��������������"),
	BAR("Q09","��������"),
	FUSION("Q10","����/ǻ���丮"),
	CAFE("Q12","Ŀ����/ī��"),
	DELIVERY("Q13","���"),
	ETC("Q14","��Ÿ"),
	BUFFET("Q15","����");
	
	public String code;
	public String desc;

	Category(String code, String desc) {
		this.code = code;
		this.desc = desc;
	}
}