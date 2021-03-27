package com.ourkitchen.app.data.entity;

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
@Table(name="analysis_data")
public class AnalysisEntity {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="rdnm", unique=true)
	private String rdnm;
	
	@Column(name="dong", length = 20, nullable = false)
	private String dong;
	
	@Column(name="res_all_total", length = 12, nullable = false)
	private Long res_all_total;
	
	@Column(name="res_man_total", length = 12, nullable = false)
	private Long res_man_total;
	
	@Column(name="res_women_total", length = 12, nullable = false)
	private Long res_women_total;
	
	@Column(name="res_total_20s", length = 12, nullable = false)
	private Long res_total_20s;
	
	@Column(name="res_total_30s", length = 12, nullable = false)
	private Long res_total_30s;
	
	@Column(name="res_total_40s", length = 12, nullable = false)
	private Long res_total_40s;
	
	@Column(name="res_total_50s", length = 12, nullable = false)
	private Long res_total_50s;
	
	@Column(name="res_total_60s", length = 12, nullable = false)
	private Long res_total_60s;
	
	@Column(name="res_men_20s", length = 12, nullable = false)
	private Long res_men_20s;
	
	@Column(name="res_men_30s", length = 12, nullable = false)
	private Long res_men_30s;
	
	@Column(name="res_men_40s", length = 12, nullable = false)
	private Long res_men_40s;
	
	@Column(name="res_men_50s", length = 12, nullable = false)
	private Long res_men_50s;
	
	@Column(name="res_men_60s", length = 12, nullable = false)
	private Long res_men_60s;
	
	@Column(name="res_women_20s", length = 12, nullable = false)
	private Long res_women_20s;
	
	@Column(name="res_women_30s", length = 12, nullable = false)
	private Long res_women_30s;
	
	@Column(name="res_women_40s", length = 12, nullable = false)
	private Long res_women_40s;
	
	@Column(name="res_women_50s", length = 12, nullable = false)
	private Long res_women_50s;
	
	@Column(name="res_women_60s", length = 12, nullable = false)
	private Long res_women_60s;
	
	@Column(name="flow_all_total", length = 12, nullable = false)
	private Long flow_all_total;
	
	@Column(name="flow_man_total", length = 12, nullable = false)
	private Long flow_man_total;
	
	@Column(name="flow_women_total", length = 12, nullable = false)
	private Long flow_women_total;
	
	@Column(name="flow_total_20s", length = 12, nullable = false)
	private Long flow_total_20s;
	
	@Column(name="flow_total_30s", length = 12, nullable = false)
	private Long flow_total_30s;
	
	@Column(name="flow_total_40s", length = 12, nullable = false)
	private Long flow_total_40s;
	
	@Column(name="flow_total_50s", length = 12, nullable = false)
	private Long flow_total_50s;
	
	@Column(name="flow_total_60s", length = 12, nullable = false)
	private Long flow_total_60s;
	
	@Column(name="flow_men_20s", length = 12, nullable = false)
	private Long flow_men_20s;
	
	@Column(name="flow_men_30s", length = 12, nullable = false)
	private Long flow_men_30s;
	
	@Column(name="flow_men_40s", length = 12, nullable = false)
	private Long flow_men_40s;
	
	@Column(name="flow_men_50s", length = 12, nullable = false)
	private Long flow_men_50s;
	
	@Column(name="flow_men_60s", length = 12, nullable = false)
	private Long flow_men_60s;
	
	@Column(name="flow_women_20s", length = 12, nullable = false)
	private Long flow_women_20s;
	
	@Column(name="flow_women_30s", length = 12, nullable = false)
	private Long flow_women_30s;
	
	@Column(name="flow_women_40s", length = 12, nullable = false)
	private Long flow_women_40s;
	
	@Column(name="flow_women_50s", length = 12, nullable = false)
	private Long flow_women_50s;
	
	@Column(name="flow_women_60s", length = 12, nullable = false)
	private Long flow_women_60s;
	
	@Column(name="mon_sales", length = 12, nullable = false)
	private Long mon_sales;
	
	@Column(name="mon_sales_count", length = 12, nullable = false)
	private Long mon_sales_count;
	
	@Column(name="weekdays_sales_rate", length = 12, nullable = false)
	private Long weekdays_sales_rate;
	
	@Column(name="weekend_sales_rate", length = 12, nullable = false)
	private Long weekend_sales_rate;
	
	@Column(name="weekdays_sales_count", length = 12, nullable = false)
	private Long weekdays_sales_count;
	
	@Column(name="weekend_sales_count", length = 12, nullable = false)
	private Long weekend_sales_count;
	
	@Column(name="breakfast_sales", length = 12, nullable = false)
	private Long breakfast_sales;
	
	@Column(name="lunch_sales", length = 12, nullable = false)
	private Long lunch_sales;
	
	@Column(name="dinner_sales", length = 12, nullable = false)
	private Long dinner_sales;
	
	@Column(name="men_sales_rate", length = 12, nullable = false)
	private Long men_sales_rate;
	
	@Column(name="women_sales_rate", length = 12, nullable = false)
	private Long women_sales_rate;

	@Builder
	public AnalysisEntity(Long id, String rdnm, String dong, Long res_all_total, Long res_man_total, Long res_women_total, Long res_total_20s, Long res_total_30s, Long res_total_40s, Long res_total_50s, Long res_total_60s, Long res_men_20s, Long res_men_30s, Long res_men_40s, Long res_men_50s, Long res_men_60s, Long res_women_20s, Long res_women_30s, Long res_women_40s, Long res_women_50s, Long res_women_60s, Long flow_all_total, Long flow_man_total, Long flow_women_total, Long flow_total_20s, Long flow_total_30s, Long flow_total_40s, Long flow_total_50s, Long flow_total_60s, Long flow_men_20s, Long flow_men_30s, Long flow_men_40s, Long flow_men_50s, Long flow_men_60s, Long flow_women_20s, Long flow_women_30s, Long flow_women_40s, Long flow_women_50s, Long flow_women_60s, Long mon_sales, Long mon_sales_count, Long weekdays_sales_rate, Long weekend_sales_rate, Long weekdays_sales_count, Long weekend_sales_count, Long breakfast_sales, Long lunch_sales, Long dinner_sales, Long men_sales_rate, Long women_sales_rate) {
		this.id = id;
		this.rdnm = rdnm;
		this.dong = dong;
		this.res_all_total = res_all_total;
		this.res_man_total = res_man_total;
		this.res_women_total = res_women_total;
		this.res_total_20s = res_total_20s;
		this.res_total_30s = res_total_30s;
		this.res_total_40s = res_total_40s;
		this.res_total_50s = res_total_50s;
		this.res_total_60s = res_total_60s;
		this.res_men_20s = res_men_20s;
		this.res_men_30s = res_men_30s;
		this.res_men_40s = res_men_40s;
		this.res_men_50s = res_men_50s;
		this.res_men_60s = res_men_60s;
		this.res_women_20s = res_women_20s;
		this.res_women_30s = res_women_30s;
		this.res_women_40s = res_women_40s;
		this.res_women_50s = res_women_50s;
		this.res_women_60s = res_women_60s;
		this.flow_all_total = flow_all_total;
		this.flow_man_total = flow_man_total;
		this.flow_women_total = flow_women_total;
		this.flow_total_20s = flow_total_20s;
		this.flow_total_30s = flow_total_30s;
		this.flow_total_40s = flow_total_40s;
		this.flow_total_50s = flow_total_50s;
		this.flow_total_60s = flow_total_60s;
		this.flow_men_20s = flow_men_20s;
		this.flow_men_30s = flow_men_30s;
		this.flow_men_40s = flow_men_40s;
		this.flow_men_50s = flow_men_50s;
		this.flow_men_60s = flow_men_60s;
		this.flow_women_20s = flow_women_20s;
		this.flow_women_30s = flow_women_30s;
		this.flow_women_40s = flow_women_40s;
		this.flow_women_50s = flow_women_50s;
		this.flow_women_60s = flow_women_60s;
		this.mon_sales = mon_sales;
		this.mon_sales_count = mon_sales_count;
		this.weekdays_sales_rate = weekdays_sales_rate;
		this.weekend_sales_rate = weekend_sales_rate;
		this.weekdays_sales_count = weekdays_sales_count;
		this.weekend_sales_count = weekend_sales_count;
		this.breakfast_sales = breakfast_sales;
		this.lunch_sales = lunch_sales;
		this.dinner_sales = dinner_sales;
		this.men_sales_rate = men_sales_rate;
		this.women_sales_rate = women_sales_rate;
	}
}
