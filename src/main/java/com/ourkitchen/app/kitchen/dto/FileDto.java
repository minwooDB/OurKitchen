package com.ourkitchen.app.kitchen.dto;

import com.ourkitchen.data.entity.KitchenImageEntity;
import com.ourkitchen.data.entity.KitchenInfoEntity;
import com.ourkitchen.data.repository.KitchenInfoRepository;

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
	private Integer id;
	private Integer kitchenId;
	private String orgFileName;
	private String fileName;
	private String filePath;
	
	public KitchenImageEntity toEntity() {
		KitchenImageEntity build = KitchenImageEntity.builder()
				.id(id)
				.orgFileName(orgFileName)
				.filePath(filePath)
				.fileName(fileName)
				.build();
		return build;
	}
	
	@Builder
	public FileDto(Integer id, Integer kitchenId, String orgFileName, String fileName, String filePath) {
		this.id = id;
		this.kitchenId = kitchenId;
		this.orgFileName = orgFileName;
		this.fileName = fileName;
		this.filePath = filePath;
	}
}