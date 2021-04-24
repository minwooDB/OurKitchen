package com.ourkitchen.app.kitchen.dto;

import com.ourkitchen.app.data.entity.KitchenImageEntity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class FileDto {
	private Long id;
	private String orgName;
	private String fileName;
	private String filePath;
	
	public KitchenImageEntity toEntity() {
		KitchenImageEntity build = KitchenImageEntity.builder()
				.id(id)
				.orgName(orgName)
				.fileName(fileName)
				.filePath(filePath)
				.build();
		return build;
	}
	
	@Builder
	public FileDto(Long id, String orgName, String fileName, String filePath) {
		this.id = id;
		this.orgName = orgName;
		this.fileName = fileName;
		this.filePath = filePath;
	}
}
