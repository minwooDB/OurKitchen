package com.ourkitchen.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name="kitchen_image")
public class KitchenImageEntity {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="kitchen_id")
	private KitchenInfoEntity kitchenInfo;
	
	@Column(name="org_file_name", nullable = true)
	private String orgFileName;
	
	@Column(name="file_name", length = 255, nullable = true)
	private String fileName;
	
	@Column(name="file_path", length = 255, nullable = true)
	private String filePath;

	@Builder
	public KitchenImageEntity(Integer id, KitchenInfoEntity kitchenInfo, String orgFileName, String fileName, String filePath) {
		this.id = id;
		this.kitchenInfo = kitchenInfo;
		this.orgFileName = orgFileName;
		this.fileName = fileName;
		this.filePath = filePath;
	}
//	
//    public void setKitchenInfo(KitchenInfoEntity kitchenInfo){
//        this.kitchenInfo = kitchenInfo;
//
//        if(!kitchenInfo.getKitchenImages().contains(this))
//            kitchenInfo.getKitchenImages().add(this);
//    }
}