package com.ourkitchen.app.analysis.dto;

import com.ourkitchen.data.entity.AnalysisInfoEntity2;

import lombok.Builder;

public class AnalysisDto2 {
	private int id;
	private int gu_code;
	private int gu_total_resident_pop;
	private int gu_total_resident_pop_men;
	private int gu_total_resident_pop_women;
	private int gu_total_economic_pop;
	private int gu_total_economic_pop_men;
	private int gu_total_economic_pop_women;
	private int gu_total_floating_pop;
	private int gu_total_floating_pop_men;
	private int gu_total_floating_pop_women;
	
	public AnalysisInfoEntity2 toEntity() {
		AnalysisInfoEntity2 build = AnalysisInfoEntity2.builder().id(id).gu_code(gu_code).gu_total_resident_pop(gu_total_resident_pop)
				.gu_total_resident_pop_men(gu_total_resident_pop_men).gu_total_resident_pop_women(gu_total_resident_pop_women).gu_total_economic_pop(gu_total_economic_pop)
				.gu_total_economic_pop_men(gu_total_economic_pop_men).gu_total_economic_pop_women(gu_total_economic_pop_women).gu_total_floating_pop(gu_total_floating_pop)
				.gu_total_floating_pop_men(gu_total_floating_pop_men).gu_total_floating_pop_women(gu_total_floating_pop_women).build();
		return build;
	}

	@Builder
	public AnalysisDto2(int id, int gu_code, int gu_total_resident_pop, int gu_total_resident_pop_men, int gu_total_resident_pop_women, int gu_total_economic_pop, 
			int gu_total_economic_pop_men, int gu_total_economic_pop_women, int gu_total_floating_pop, int gu_total_floating_pop_men, int gu_total_floating_pop_women) {
		this.gu_code = gu_code;
		this.gu_total_resident_pop = gu_total_resident_pop;
		this.gu_total_resident_pop_men = gu_total_resident_pop_men;
		this.gu_total_resident_pop_women = gu_total_resident_pop_women;
		this.gu_total_economic_pop = gu_total_economic_pop;
		this.gu_total_economic_pop_men = gu_total_economic_pop_men;
		this.gu_total_economic_pop_women = gu_total_economic_pop_women;
		this.gu_total_floating_pop = gu_total_floating_pop;
		this.gu_total_floating_pop_men = gu_total_floating_pop_men;
		this.gu_total_floating_pop_women = gu_total_floating_pop_women;
	}
	
	/*
	 * public static AnalysisDto2 (AnalysisInfoEntity2 analysis2) { return
	 * AnalysisDto.builder().id(analysis2.getId()).name(analysis.getName()).address(
	 * analysis.getAddress())
	 * .telNum(analysis.getTelNum()).bizReport(analysis.getBizReport()).lat(analysis
	 * .getLat())
	 * .lng(analysis.getLng()).capacity(analysis.getCapacity()).pyeong(analysis.
	 * getPyeong()) .build(); }
	 */
}
