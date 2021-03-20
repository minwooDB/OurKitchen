package com.ourkitchen.app.kitchen.dto;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ourkitchen.app.data.entity.AnalysisEntity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class AnalysisDto {
	private Long id;
	
	@Autowired
	SqlSession session = null;

	private String lat;
	private String lng;
	
	@Builder
	public AnalysisDto(String lat, String lng) {
		this.lat = lat;
		this.lng = lng;
	}
}
