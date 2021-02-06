package com.ourkitchen.app.data.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.ourkitchen.enums.Classification;
import com.ourkitchen.enums.StatusCode;

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
	private long id;
	
	@Column(name="name", length = 20, nullable = false, unique=true)
	private String name;
	
	@Column(name="address", length = 255, nullable = false)
	private String address;
	
	@Column(name="tel", length = 11, nullable = false)
	private String tel;
	
	@Column(name="biz_report", length = 255, nullable = false)
	private String biz_report;
	
	@Column(name="lat", nullable = false)
	private float lat;
	
	@Column(name="lng", nullable = false)
	private float lng;
	
	@Column(name="capacity", nullable = false)
	private int capacity;
	
	@Column(name="ac", nullable = true)
	private int ac;
	
	@Column(name="user_id", nullable = false)
	private long user_id;

	@Builder
	public KitchenInfoEntity(Long id, String name, String address, String tel, String biz_report, float lat ,float lng, int capacity, int ac, long user_id) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.tel = tel;
		this.biz_report = biz_report;
		this.lat = lat;
		this.lng = lng;
		this.capacity = capacity;
		this.ac = ac;
		this.user_id = user_id;
	}
}

