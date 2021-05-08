package com.ourkitchen.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Builder
@Entity
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@ToString
@EqualsAndHashCode(of = {"id"})
@Getter
@Table(name="Kitchen_info")
public class KitchenInfoEntity {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="name", length = 20, nullable = false, unique=true)
	private String name;
	
	@Column(name="address", length = 255, nullable = false)
	private String address;
	
	@Column(name="tel_num", length = 11, nullable = false)
	private String tel_num;
	
	@Column(name="biz_report", length = 255, nullable = true)
	private String biz_report;
	
	@Column(name="lat", nullable = false)
	private double lat;
	
	@Column(name="lng", nullable = false)
	private double lng;
	
	@Column(name="capacity", nullable = false)
	private int capacity;
	
	@Column(name="pyeong", nullable = true)
	private int pyeong;
	
	@Column(name="user_id", nullable = false)
	private long user_id;

	@Builder
	public KitchenInfoEntity(Long id, String name, String address, String tel_num, String biz_report, double lat ,double lng, int capacity, int pyeong, long user_id) {
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

