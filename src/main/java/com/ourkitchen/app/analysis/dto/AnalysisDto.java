package com.ourkitchen.app.analysis.dto;

import com.ourkitchen.data.entity.AnalysisEntity;
import com.ourkitchen.data.entity.AnalysisInfoEntity;

import lombok.Builder;

public class AnalysisDto {
	private int id;
	private String resident_pop_most;
	private String economic_pop_most;
	private String floating_pop_most;
	private String apartment_area_most;
	private int apartment_area_avg;
	private int apartment_price_most;
	private int apartment_price_avg;
	private String facilities_most;
	
	public AnalysisInfoEntity toEntity() {
		AnalysisInfoEntity build = AnalysisInfoEntity.builder().id(id).resident_pop_most(resident_pop_most).economic_pop_most(economic_pop_most)
				.floating_pop_most(floating_pop_most).apartment_area_most(apartment_area_most).apartment_area_avg(apartment_area_avg)
				.apartment_price_most(apartment_price_most).apartment_price_avg(apartment_price_avg).facilities_most(facilities_most).build();
		return build;
	}

	@Builder
	public AnalysisDto(int id, String resident_pop_most, String economic_pop_most, String floating_pop_most, String apartment_area_most, int apartment_area_avg, 
			int apartment_price_most, int apartment_price_avg, String facilities_most) {
		this.id = id;
		this.resident_pop_most = resident_pop_most;
		this.economic_pop_most = economic_pop_most;
		this.floating_pop_most = floating_pop_most;
		this.apartment_area_avg = apartment_area_avg;
		this.apartment_price_most = apartment_price_most;
		this.apartment_price_avg = apartment_price_avg;
		this.facilities_most = facilities_most;
	}
}
