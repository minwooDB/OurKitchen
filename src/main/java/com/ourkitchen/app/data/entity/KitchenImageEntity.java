package com.ourkitchen.app.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class KitchenImageEntity {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="kitchen_id", nullable = false)
	private Long kitchenId;
	
	@Column(name="org_file_name", nullable = false)
	private String orgFileName;
	
	@Column(name="file_name", length = 255, nullable = false)
	private String fileName;
	
	@Column(name="file_path", length = 255, nullable = false)
	private String filePath;

	@Builder
	public KitchenImageEntity(Long id, Long kitchenId, String orgFileName, String fileName, String filePath) {
		this.id = id;
		this.kitchenId = kitchenId;
		this.orgFileName = orgFileName;
		this.fileName = fileName;
		this.filePath = filePath;
	}
}