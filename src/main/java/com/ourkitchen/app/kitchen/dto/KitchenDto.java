package com.ourkitchen.app.kitchen.dto;

import com.ourkitchen.data.entity.KitchenInfoEntity;
import com.ourkitchen.data.entity.UserEntity;

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
	private String tel_num;
	private String biz_report;
	private double lat;
	private double lng;
	private int capacity;
	private int pyeong;
	private long user_id;

	public KitchenInfoEntity toEntity() {
		KitchenInfoEntity build = KitchenInfoEntity.builder().id(id).name(name).address(address).tel_num(tel_num)
				.biz_report(biz_report).lat(lat).lng(lng).capacity(capacity).pyeong(pyeong).user_id(user_id).build();
		return build;
	}

	@Builder
	public KitchenDto(Long id, String name, String address, String tel_num, String biz_report, double lat, double lng,
			int capacity, int pyeong, long user_id) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.tel_num = tel_num;
		this.biz_report = biz_report;
		this.lat = lat;
		this.lng = lng;
		this.capacity = capacity;
		this.pyeong = pyeong;
		this.user_id = user_id;
	}
}
