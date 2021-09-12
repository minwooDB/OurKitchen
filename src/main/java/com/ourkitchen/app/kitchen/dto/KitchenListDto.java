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
public class KitchenListDto {
	private Integer id;
	private String name;
	private String address;
	private double lat;
	private double lng;
	private Integer imageId;
	
	@Builder
	public KitchenListDto(Integer id, String name, String address, double lat, double lng, Integer imageId) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.lat = lat;
		this.lng = lng;
		this.imageId = imageId;
	}	
	
	public static KitchenListDto convertEntityToDto(KitchenInfoEntity kitchen) {
		return KitchenListDto.builder()
				.id(kitchen.getId())
				.name(kitchen.getName())
				.address(kitchen.getAddress())
				.lat(kitchen.getLat())
				.lng(kitchen.getLng())
				.build();
	}
}