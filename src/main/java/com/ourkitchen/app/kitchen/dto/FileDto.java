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
	private Long kitchenId;
	private String orgFileName;
	private String fileName;
	private String filePath;
	
	public KitchenImageEntity toEntity() {
		KitchenImageEntity build = KitchenImageEntity.builder()
				.id(id)
				.kitchenId(kitchenId)
				.orgFileName(orgFileName)
				.fileName(fileName)
				.filePath(filePath)
				.build();
		return build;
	}
	
	@Builder
	public FileDto(Long id, Long kitchenId, String orgFileName, String fileName, String filePath) {
		this.id = id;
		this.kitchenId = kitchenId;
		this.orgFileName = orgFileName;
		this.fileName = fileName;
		this.filePath = filePath;
	}
}