package com.ourkitchen.app.kitchen.dto;

import com.ourkitchen.app.data.entity.KitchenInfoEntity;
import com.ourkitchen.app.data.entity.UserEntity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class KitchenDto {
	private Long id;
	private String name;
	private String address;
	private String tel;
	private String biz_report;
	private float lat;
	private float lng;
	private int capacity;
	private int ac;
	private long user_id;

	public KitchenInfoEntity toEntity() {
		KitchenInfoEntity build = KitchenInfoEntity.builder().id(id).name(name).address(address).tel(tel)
				.biz_report(biz_report).lat(lat).lng(lng).capacity(capacity).ac(ac).user_id(user_id).build();
		return build;
	}

	@Builder
	public KitchenDto(Long id, String name, String address, String tel, String biz_report, float lat, float lng,
			int capacity, int ac, long user_id) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.tel = tel;
		this.biz_report = biz_report;
		this.lat = lat;
		this.lng = lng;
		this.capacity = capacity;
		this.ac = ac;
		this.user_id = user_id;
	}
}
