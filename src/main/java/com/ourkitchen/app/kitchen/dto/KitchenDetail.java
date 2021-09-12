package com.ourkitchen.app.kitchen.dto;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.ourkitchen.data.entity.KitchenInfoEntity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class KitchenDetail {
	private Integer id;
	private String name;
	private String address;
	private String telNum;
	private String bizReport;
	private double lat;
	private double lng;
	private int capacity;
	private int pyeong;
	private List<MultipartFile> files;

	public KitchenInfoEntity toEntity() {
		KitchenInfoEntity build = KitchenInfoEntity.builder().id(id).name(name).address(address)
				.telNum(telNum).bizReport(bizReport).lat(lat).lng(lng).capacity(capacity).pyeong(pyeong)
				.build();
		return build;
	}

	@Builder
	public KitchenDetail(Integer id, String name, String address, String telNum, String bizReport, double lat, double lng,
			int capacity, int pyeong, long userId, long imageId) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.telNum = telNum;
		this.bizReport = bizReport;
		this.lat = lat;
		this.lng = lng;
		this.capacity = capacity;
		this.pyeong = pyeong;
	}
	
	public KitchenDetail convertEntityToDto(KitchenInfoEntity kitchen) {
		return KitchenDetail.builder().id(kitchen.getId()).name(kitchen.getName()).address(kitchen.getAddress())
				.telNum(kitchen.getTelNum()).bizReport(kitchen.getBizReport()).lat(kitchen.getLat())
				.lng(kitchen.getLng()).capacity(kitchen.getCapacity()).pyeong(kitchen.getPyeong())
				.build();
	}
}