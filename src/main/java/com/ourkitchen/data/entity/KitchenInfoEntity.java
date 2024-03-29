package com.ourkitchen.data.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@Entity
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@ToString
@EqualsAndHashCode(of = {"id"})
@Getter
@Setter
@Table(name="Kitchen_info")
public class KitchenInfoEntity extends TimeEntity{
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="name", length = 20, nullable = false, unique=true)
	private String name;
	
	@Column(name="address", length = 255, nullable = false)
	private String address;
	
	@Column(name="tel_num", length = 11, nullable = false)
	private String telNum;
	
	@Column(name="biz_report", length = 255, nullable = true)
	private String bizReport;
	
	@Column(name="lat", nullable = false)
	private double lat;
	
	@Column(name="lng", nullable = false)
	private double lng;
	
	@Column(name="capacity", nullable = false)
	private int capacity;
	
	@Column(name="pyeong", nullable = true)
	private int pyeong;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="user_id", nullable = true)
	private UserEntity user;
	
	@OneToMany(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
	@JoinColumn(name="kitchen_id")
	private List<KitchenImageEntity> kitchenImages = new ArrayList<>();

	public void setKitchenImages(KitchenImageEntity kitchenImage) {
		kitchenImages.add(kitchenImage);
		kitchenImage.setKitchenInfo(this);
	}
	
	@Builder
	public KitchenInfoEntity(Integer id, String name, String address, String telNum, String bizReport,
			double lat ,double lng, int capacity, int pyeong, UserEntity user, List<KitchenImageEntity> kitchenImages) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.telNum = telNum;
		this.bizReport = bizReport;
		this.lat = lat;
		this.lng = lng;
		this.capacity = capacity;
		this.pyeong = pyeong;
		this.user = user;
		this.kitchenImages = kitchenImages;
	}

}