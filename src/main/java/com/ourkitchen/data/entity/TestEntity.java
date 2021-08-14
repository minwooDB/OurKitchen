package com.ourkitchen.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.ToString;

import lombok.AccessLevel; 
import lombok.AllArgsConstructor; 
import lombok.Builder; 
import lombok.EqualsAndHashCode; 
import lombok.Getter; 
import lombok.NoArgsConstructor; 
import lombok.ToString;

@Entity

@NoArgsConstructor(access=AccessLevel.PROTECTED)

@EqualsAndHashCode(of = {"id"})

@ToString
public class TestEntity {
	  @Entity
	  
	  @Table(name="business_info") public class AnalysisEntity {
	  
	  @Id
	  
	  @Column(name="id")
	  
	  @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;
	  
	  @Column(name="tradingarea_code", length = 20, nullable = false, unique=true)
	  private int tradingarea_code;
	  
	  @Column(name="tradingarea_name", length = 20, nullable = false) private
	  String tradingarea_name;
	  
	  @Column(name="lng", length = 20, nullable = false) private Double lng;
	  
	  @Column(name="lat", length = 20, nullable = false) private Double lat;
	  
	  @Column(name="gu_code", length = 20, nullable = false) private int gu_code;
	  
	  @Column(name="gu_name", length = 20, nullable = false) private String
	  gu_name;
	  
	  @Column(name="dong_code", length = 20, nullable = false) private int
	  dong_code;
	  
	  @Column(name="dong_name", length = 20, nullable = false) private String
	  dong_name;
	  
	  @Column(name="resident_pop_all", length = 20, nullable = false) private int
	  resident_pop_all;
	  
	  @Column(name="resident_pop_men", length = 20, nullable = false) private int
	  resident_pop_women;
	  
	  @Column(name="resident_pop_women", length = 20, nullable = false) private int
	  resident_pop_wowomen;
	  
	  @Column(name="resident_pop_10s", length = 20, nullable = false) private int
	  resident_pop_10s;
	  
	  @Column(name="resident_pop_20s", length = 20, nullable = false) private int
	  resident_pop_20s;
	  
	  @Column(name="resident_pop_30s", length = 20, nullable = false) private int
	  resident_pop_30s;
	  
	  @Column(name="resident_pop_40s", length = 20, nullable = false) private int
	  resident_pop_40s;
	  
	  @Column(name="resident_pop_50s", length = 20, nullable = false) private int
	  resident_pop_50s;
	  
	  @Column(name="resident_pop_60s", length = 20, nullable = false) private int
	  resident_pop_60s;
	  
	  @Column(name="resident_pop_women_10s", length = 20, nullable = false) private
	  int resident_pop_women_10s;
	  
	  @Column(name="resident_pop_women_20s", length = 20, nullable = false) private
	  int resident_pop_women_20s;
	  
	  @Column(name="resident_pop_women_30s", length = 20, nullable = false) private
	  int resident_pop_women_30s;
	  
	  @Column(name="resident_pop_women_40s", length = 20, nullable = false) private
	  int resident_pop_women_40s;
	  
	  @Column(name="resident_pop_women_50s", length = 20, nullable = false) private
	  int resident_pop_women_50s;
	  
	  @Column(name="resident_pop_women_60s", length = 20, nullable = false) private
	  int resident_pop_women_60s;
	  
	  @Column(name="resident_pop_wowomen_10s", length = 20, nullable = false)
	  private int resident_pop_wowomen_10s;
	  
	  @Column(name="resident_pop_wowomen_20s", length = 20, nullable = false)
	  private int resident_pop_wowomen_20s;
	  
	  @Column(name="resident_pop_wowomen_30s", length = 20, nullable = false)
	  private int resident_pop_wowomen_30s;
	  
	  @Column(name="resident_pop_wowomen_40s", length = 20, nullable = false)
	  private int resident_pop_wowomen_40s;
	  
	  @Column(name="resident_pop_wowomen_50s", length = 20, nullable = false)
	  private int resident_pop_wowomen_50s;
	  
	  @Column(name="resident_pop_wowomen_60s", length = 20, nullable = false)
	  private int resident_pop_wowomen_60s;
	  
	  @Column(name="household_all", length = 20, nullable = false) private int
	  household_all;
	  
	  @Column(name="household_apartment", length = 20, nullable = false) private
	  int household_apartment;
	  
	  @Column(name="household_non_apartment", length = 20, nullable = false)
	  private int household_non_apartment;
	  
	  @Column(name="economic_pop_all", length = 20, nullable = false) private int
	  economic_pop_all;
	  
	  @Column(name="economic_pop_women", length = 20, nullable = false) private int
	  economic_pop_women;
	  
	  @Column(name="economic_pop_wowomen", length = 20, nullable = false) private
	  int economic_pop_wowomen;
	  
	  @Column(name="economic_pop_10s", length = 20, nullable = false) private int
	  economic_pop_10s;
	  
	  @Column(name="economic_pop_20s", length = 20, nullable = false) private int
	  economic_pop_20s;
	  
	  @Column(name="economic_pop_30s", length = 20, nullable = false) private int
	  economic_pop_30s;
	  
	  @Column(name="economic_pop_40s", length = 20, nullable = false) private int
	  economic_pop_40s;
	  
	  @Column(name="economic_pop_50s", length = 20, nullable = false) private int
	  economic_pop_50s;
	  
	  @Column(name="economic_pop_60s", length = 20, nullable = false) private int
	  economic_pop_60s;
	  
	  @Column(name="economic_pop_women_10s", length = 20, nullable = false) private
	  int economic_pop_women_10s;
	  
	  @Column(name="economic_pop_women_20s", length = 20, nullable = false) private
	  int economic_pop_men_20s;
	  
	  @Column(name="economic_pop_men_30s", length = 20, nullable = false) private
	  int economic_pop_women_30s;
	  
	  @Column(name="economic_pop_men_40s", length = 20, nullable = false) private
	  int economic_pop_women_40s;
	  
	  @Column(name="economic_pop_men_50s", length = 20, nullable = false) private
	  int economic_pop_women_50s;
	  
	  @Column(name="economic_pop_men_60s", length = 20, nullable = false) private
	  int economic_pop_women_60s;
	  
	  @Column(name="economic_pop_women_10s", length = 20, nullable = false) private
	  int economic_pop_wowomen_10s;
	  
	  @Column(name="economic_pop_women_20s", length = 20, nullable = false) private
	  int economic_pop_wowomen_20s;
	  
	  @Column(name="economic_pop_women_30s", length = 20, nullable = false) private
	  int economic_pop_wowomen_30s;
	  
	  @Column(name="economic_pop_women_40s", length = 20, nullable = false) private
	  int economic_pop_wowomen_40s;
	  
	  @Column(name="economic_pop_women_50s", length = 20, nullable = false) private
	  int economic_pop_wowomen_50s;
	  
	  @Column(name="economic_pop_women_60s", length = 20, nullable = false) private
	  int economic_pop_wowomen_60s;
	  
	  @Column(name="floating_pop_all", length = 20, nullable = false) private int
	  floating_pop_all;
	  
	  @Column(name="floating_pop_men", length = 20, nullable = false) private int
	  floating_pop_men;
	  
	  @Column(name="floating_pop_women", length = 20, nullable = false) private int
	  floating_pop_women;
	  
	  @Column(name="floating_pop_10s", length = 20, nullable = false) private int
	  floating_pop_10s;
	  
	  @Column(name="floating_pop_20s", length = 20, nullable = false) private int
	  floating_pop_20s;
	  
	  @Column(name="floating_pop_30s", length = 20, nullable = false) private int
	  floating_pop_30s;
	  
	  @Column(name="floating_pop_40s", length = 20, nullable = false) private int
	  floating_pop_40s;
	  
	  @Column(name="floating_pop_50s", length = 20, nullable = false) private int
	  floating_pop_50s;
	  
	  @Column(name="floating_pop_60s", length = 20, nullable = false) private int
	  floating_pop_60s;
	  
	  @Column(name="floating_pop_time1", length = 20, nullable = false) private int
	  floating_pop_time1;
	  
	  @Column(name="floating_pop_time2", length = 20, nullable = false) private int
	  floating_pop_time2;
	  
	  @Column(name="floating_pop_time3", length = 20, nullable = false) private int
	  floating_pop_time3;
	  
	  @Column(name="floating_pop_time4", length = 20, nullable = false) private int
	  floating_pop_time4;
	  
	  @Column(name="floating_pop_time5", length = 20, nullable = false) private int
	  floating_pop_time5;
	  
	  @Column(name="floating_pop_time6", length = 20, nullable = false) private int
	  floating_pop_time6;
	  
	  @Column(name="floating_pop_mon", length = 20, nullable = false) private int
	  floating_pop_mon;
	  
	  @Column(name="floating_pop_tue", length = 20, nullable = false) private int
	  floating_pop_tue;
	  
	  @Column(name="floating_pop_wen", length = 20, nullable = false) private int
	  floating_pop_wen;
	  
	  @Column(name="floating_pop_thur", length = 20, nullable = false) private int
	  floating_pop_thur;
	  
	  @Column(name="floating_pop_fri", length = 20, nullable = false) private int
	  floating_pop_fri;
	  
	  @Column(name="floating_pop_sat", length = 20, nullable = false) private int
	  floating_pop_sat;
	  
	  @Column(name="floating_pop_sun", length = 20, nullable = false) private int
	  floating_pop_sun;
	  
	  @Column(name="floating_pop_men_10s_mon_time1", length = 20, nullable = false)
	  private int floating_pop_men_10s_mon_time1;
	  
	  @Column(name="floating_pop_men_10s_mon_time2", length = 20, nullable = false)
	  private int floating_pop_men_10s_mon_time2;
	  
	  @Column(name="floating_pop_men_10s_mon_time3", length = 20, nullable = false)
	  private int floating_pop_men_10s_mon_time3;
	  
	  @Column(name="floating_pop_men_10s_mon_time4", length = 20, nullable = false)
	  private int floating_pop_men_10s_mon_time4;
	  
	  @Column(name="floating_pop_men_10s_mon_time5", length = 20, nullable = false)
	  private int floating_pop_men_10s_mon_time5;
	  
	  @Column(name="floating_pop_men_10s_mon_time6", length = 20, nullable = false)
	  private int floating_pop_men_10s_mon_time6;
	  
	  @Column(name="floating_pop_men_10s_tue_time1", length = 20, nullable = false)
	  private int floating_pop_men_10s_tue_time1;
	  
	  @Column(name="floating_pop_men_10s_tue_time2", length = 20, nullable = false)
	  private int floating_pop_men_10s_tue_time2;
	  
	  @Column(name="floating_pop_men_10s_tue_time3", length = 20, nullable = false)
	  private int floating_pop_men_10s_tue_time3;
	  
	  @Column(name="floating_pop_men_10s_tue_time4", length = 20, nullable = false)
	  private int floating_pop_men_10s_tue_time4;
	  
	  @Column(name="floating_pop_men_10s_tue_time5", length = 20, nullable = false)
	  private int floating_pop_men_10s_tue_time5;
	  
	  @Column(name="floating_pop_men_10s_tue_time6", length = 20, nullable = false)
	  private int floating_pop_men_10s_tue_time6;
	  
	  @Column(name="floating_pop_men_10s_wen_time1", length = 20, nullable = false)
	  private int floating_pop_men_10s_wen_time1;
	  
	  @Column(name="floating_pop_men_10s_wen_time2", length = 20, nullable = false)
	  private int floating_pop_men_10s_wen_time2;
	  
	  @Column(name="floating_pop_men_10s_wen_time3", length = 20, nullable = false)
	  private int floating_pop_men_10s_wen_time3;
	  
	  @Column(name="floating_pop_men_10s_wen_time4", length = 20, nullable = false)
	  private int floating_pop_men_10s_wen_time4;
	  
	  @Column(name="floating_pop_men_10s_wen_time5", length = 20, nullable = false)
	  private int floating_pop_men_10s_wen_time5;
	  
	  @Column(name="floating_pop_men_10s_wen_time6", length = 20, nullable = false)
	  private int floating_pop_men_10s_wen_time6;
	  
	  @Column(name="floating_pop_men_10s_thur_time1", length = 20, nullable =
	  false) private int floating_pop_men_10s_thur_time1;
	  
	  @Column(name="floating_pop_men_10s_thur_time2", length = 20, nullable =
	  false) private int floating_pop_men_10s_thur_time2;
	  
	  @Column(name="floating_pop_men_10s_thur_time3", length = 20, nullable =
	  false) private int floating_pop_men_10s_thur_time3;
	  
	  @Column(name="floating_pop_men_10s_thur_time4", length = 20, nullable =
	  false) private int floating_pop_men_10s_thur_time4;
	  
	  @Column(name="floating_pop_men_10s_thur_time5", length = 20, nullable =
	  false) private int floating_pop_men_10s_thur_time5;
	  
	  @Column(name="floating_pop_men_10s_thur_time6", length = 20, nullable =
	  false) private int floating_pop_men_10s_thur_time6;
	  
	  @Column(name="floating_pop_men_10s_fri_time1", length = 20, nullable = false)
	  private int floating_pop_men_10s_fri_time1;
	  
	  @Column(name="floating_pop_men_10s_fri_time2", length = 20, nullable = false)
	  private int floating_pop_men_10s_fri_time2;
	  
	  @Column(name="floating_pop_men_10s_fri_time3", length = 20, nullable = false)
	  private int floating_pop_men_10s_fri_time3;
	  
	  @Column(name="floating_pop_men_10s_fri_time4", length = 20, nullable = false)
	  private int floating_pop_men_10s_fri_time4;
	  
	  @Column(name="floating_pop_men_10s_fri_time5", length = 20, nullable = false)
	  private int floating_pop_men_10s_fri_time5;
	  
	  @Column(name="floating_pop_men_10s_fri_time6", length = 20, nullable = false)
	  private int floating_pop_men_10s_fri_time6;
	  
	  @Column(name="floating_pop_men_10s_sat_time1", length = 20, nullable = false)
	  private int floating_pop_men_10s_sat_time1;
	  
	  @Column(name="floating_pop_men_10s_sat_time2", length = 20, nullable = false)
	  private int floating_pop_men_10s_sat_time2;
	  
	  @Column(name="floating_pop_men_10s_sat_time3", length = 20, nullable = false)
	  private int floating_pop_men_10s_sat_time3;
	  
	  @Column(name="floating_pop_men_10s_sat_time4", length = 20, nullable = false)
	  private int floating_pop_men_10s_sat_time4;
	  
	  @Column(name="floating_pop_men_10s_sat_time5", length = 20, nullable = false)
	  private int floating_pop_men_10s_sat_time5;
	  
	  @Column(name="floating_pop_men_10s_sat_time6", length = 20, nullable = false)
	  private int floating_pop_men_10s_sat_time6;
	  
	  @Column(name="floating_pop_men_10s_sun_time1", length = 20, nullable = false)
	  private int floating_pop_men_10s_sun_time1;
	  
	  @Column(name="floating_pop_men_10s_sun_time2", length = 20, nullable = false)
	  private int floating_pop_men_10s_sun_time2;
	  
	  @Column(name="floating_pop_men_10s_sun_time3", length = 20, nullable = false)
	  private int floating_pop_men_10s_sun_time3;
	  
	  @Column(name="floating_pop_men_10s_sun_time4", length = 20, nullable = false)
	  private int floating_pop_men_10s_sun_time4;
	  
	  @Column(name="floating_pop_men_10s_sun_time5", length = 20, nullable = false)
	  private int floating_pop_men_10s_sun_time5;
	  
	  @Column(name="floating_pop_men_10s_sun_time6", length = 20, nullable = false)
	  private int floating_pop_men_10s_sun_time6;
	  
	  @Column(name="floating_pop_men_20s_mon_time1", length = 20, nullable = false)
	  private int floating_pop_men_20s_mon_time1;
	  
	  @Column(name="floating_pop_men_20s_mon_time2", length = 20, nullable = false)
	  private int floating_pop_men_20s_mon_time2;
	  
	  @Column(name="floating_pop_men_20s_mon_time3", length = 20, nullable = false)
	  private int floating_pop_men_20s_mon_time3;
	  
	  @Column(name="floating_pop_men_20s_mon_time4", length = 20, nullable = false)
	  private int floating_pop_men_20s_mon_time4;
	  
	  @Column(name="floating_pop_men_20s_mon_time5", length = 20, nullable = false)
	  private int floating_pop_men_20s_mon_time5;
	  
	  @Column(name="floating_pop_men_20s_mon_time6", length = 20, nullable = false)
	  private int floating_pop_men_20s_mon_time6;
	  
	  @Column(name="floating_pop_men_20s_tue_time1", length = 20, nullable = false)
	  private int floating_pop_men_20s_tue_time1;
	  
	  @Column(name="floating_pop_men_20s_tue_time2", length = 20, nullable = false)
	  private int floating_pop_men_20s_tue_time2;
	  
	  @Column(name="floating_pop_men_20s_tue_time3", length = 20, nullable = false)
	  private int floating_pop_men_20s_tue_time3;
	  
	  @Column(name="floating_pop_men_20s_tue_time4", length = 20, nullable = false)
	  private int floating_pop_men_20s_tue_time4;
	  
	  @Column(name="floating_pop_men_20s_tue_time5", length = 20, nullable = false)
	  private int floating_pop_men_20s_tue_time5;
	  
	  @Column(name="floating_pop_men_20s_tue_time6", length = 20, nullable = false)
	  private int floating_pop_men_20s_tue_time6;
	  
	  @Column(name="floating_pop_men_20s_wen_time1", length = 20, nullable = false)
	  private int floating_pop_men_20s_wen_time1;
	  
	  @Column(name="floating_pop_men_20s_wen_time2", length = 20, nullable = false)
	  private int floating_pop_men_20s_wen_time2;
	  
	  @Column(name="floating_pop_men_20s_wen_time3", length = 20, nullable = false)
	  private int floating_pop_men_20s_wen_time3;
	  
	  @Column(name="floating_pop_men_20s_wen_time4", length = 20, nullable = false)
	  private int floating_pop_men_20s_wen_time4;
	  
	  @Column(name="floating_pop_men_20s_wen_time5", length = 20, nullable = false)
	  private int floating_pop_men_20s_wen_time5;
	  
	  @Column(name="floating_pop_men_20s_wen_time6", length = 20, nullable = false)
	  private int floating_pop_men_20s_wen_time6;
	  
	  @Column(name="floating_pop_men_20s_thur_time1", length = 20, nullable =
	  false) private int floating_pop_men_20s_thur_time1;
	  
	  @Column(name="floating_pop_men_20s_thur_time2", length = 20, nullable =
	  false) private int floating_pop_men_20s_thur_time2;
	  
	  @Column(name="floating_pop_men_20s_thur_time3", length = 20, nullable =
	  false) private int floating_pop_men_20s_thur_time3;
	  
	  @Column(name="floating_pop_men_20s_thur_time4", length = 20, nullable =
	  false) private int floating_pop_men_20s_thur_time4;
	  
	  @Column(name="floating_pop_men_20s_thur_time5", length = 20, nullable =
	  false) private int floating_pop_men_20s_thur_time5;
	  
	  @Column(name="floating_pop_men_20s_thur_time6", length = 20, nullable =
	  false) private int floating_pop_men_20s_thur_time6;
	  
	  @Column(name="floating_pop_men_20s_fri_time1", length = 20, nullable = false)
	  private int floating_pop_men_20s_fri_time1;
	  
	  @Column(name="floating_pop_men_20s_fri_time2", length = 20, nullable = false)
	  private int floating_pop_men_20s_fri_time2;
	  
	  @Column(name="floating_pop_men_20s_fri_time3", length = 20, nullable = false)
	  private int floating_pop_men_20s_fri_time3;
	  
	  @Column(name="floating_pop_men_20s_fri_time4", length = 20, nullable = false)
	  private int floating_pop_men_20s_fri_time4;
	  
	  @Column(name="floating_pop_men_20s_fri_time5", length = 20, nullable = false)
	  private int floating_pop_men_20s_fri_time5;
	  
	  @Column(name="floating_pop_men_20s_fri_time6", length = 20, nullable = false)
	  private int floating_pop_men_20s_fri_time6;
	  
	  @Column(name="floating_pop_men_20s_sat_time1", length = 20, nullable = false)
	  private int floating_pop_men_20s_sat_time1;
	  
	  @Column(name="floating_pop_men_20s_sat_time2", length = 20, nullable = false)
	  private int floating_pop_men_20s_sat_time2;
	  
	  @Column(name="floating_pop_men_20s_sat_time3", length = 20, nullable = false)
	  private int floating_pop_men_20s_sat_time3;
	  
	  @Column(name="floating_pop_men_20s_sat_time4", length = 20, nullable = false)
	  private int floating_pop_men_20s_sat_time4;
	  
	  @Column(name="floating_pop_men_20s_sat_time5", length = 20, nullable = false)
	  private int floating_pop_men_20s_sat_time5;
	  
	  @Column(name="floating_pop_men_20s_sat_time6", length = 20, nullable = false)
	  private int floating_pop_men_20s_sat_time6;
	  
	  @Column(name="floating_pop_men_20s_sun_time1", length = 20, nullable = false)
	  private int floating_pop_men_20s_sun_time1;
	  
	  @Column(name="floating_pop_men_20s_sun_time2", length = 20, nullable = false)
	  private int floating_pop_men_20s_sun_time2;
	  
	  @Column(name="floating_pop_men_20s_sun_time3", length = 20, nullable = false)
	  private int floating_pop_men_20s_sun_time3;
	  
	  @Column(name="floating_pop_men_20s_sun_time4", length = 20, nullable = false)
	  private int floating_pop_men_20s_sun_time4;
	  
	  @Column(name="floating_pop_men_20s_sun_time5", length = 20, nullable = false)
	  private int floating_pop_men_20s_sun_time5;
	  
	  @Column(name="floating_pop_men_20s_sun_time6", length = 20, nullable = false)
	  private int floating_pop_men_20s_sun_time6;
	  
	  @Column(name="floating_pop_men_30s_mon_time1", length = 20, nullable = false)
	  private int floating_pop_men_30s_mon_time1;
	  
	  @Column(name="floating_pop_men_30s_mon_time2", length = 20, nullable = false)
	  private int floating_pop_men_30s_mon_time2;
	  
	  @Column(name="floating_pop_men_30s_mon_time3", length = 20, nullable = false)
	  private int floating_pop_men_30s_mon_time3;
	  
	  @Column(name="floating_pop_men_30s_mon_time4", length = 20, nullable = false)
	  private int floating_pop_men_30s_mon_time4;
	  
	  @Column(name="floating_pop_men_30s_mon_time5", length = 20, nullable = false)
	  private int floating_pop_men_30s_mon_time5;
	  
	  @Column(name="floating_pop_men_30s_mon_time6", length = 20, nullable = false)
	  private int floating_pop_men_30s_mon_time6;
	  
	  @Column(name="floating_pop_men_30s_tue_time1", length = 20, nullable = false)
	  private int floating_pop_men_30s_tue_time1;
	  
	  @Column(name="floating_pop_men_30s_tue_time2", length = 20, nullable = false)
	  private int floating_pop_men_30s_tue_time2;
	  
	  @Column(name="floating_pop_men_30s_tue_time3", length = 20, nullable = false)
	  private int floating_pop_men_30s_tue_time3;
	  
	  @Column(name="floating_pop_men_30s_tue_time4", length = 20, nullable = false)
	  private int floating_pop_men_30s_tue_time4;
	  
	  @Column(name="floating_pop_men_30s_tue_time5", length = 20, nullable = false)
	  private int floating_pop_men_30s_tue_time5;
	  
	  @Column(name="floating_pop_men_30s_tue_time6", length = 20, nullable = false)
	  private int floating_pop_men_30s_tue_time6;
	  
	  @Column(name="floating_pop_men_30s_wen_time1", length = 20, nullable = false)
	  private int floating_pop_men_30s_wen_time1;
	  
	  @Column(name="floating_pop_men_30s_wen_time2", length = 20, nullable = false)
	  private int floating_pop_men_30s_wen_time2;
	  
	  @Column(name="floating_pop_men_30s_wen_time3", length = 20, nullable = false)
	  private int floating_pop_men_30s_wen_time3;
	  
	  @Column(name="floating_pop_men_30s_wen_time4", length = 20, nullable = false)
	  private int floating_pop_men_30s_wen_time4;
	  
	  @Column(name="floating_pop_men_30s_wen_time5", length = 20, nullable = false)
	  private int floating_pop_men_30s_wen_time5;
	  
	  @Column(name="floating_pop_men_30s_wen_time6", length = 20, nullable = false)
	  private int floating_pop_men_30s_wen_time6;
	  
	  @Column(name="floating_pop_men_30s_thur_time1", length = 20, nullable =
	  false) private int floating_pop_men_30s_thur_time1;
	  
	  @Column(name="floating_pop_men_30s_thur_time2", length = 20, nullable =
	  false) private int floating_pop_men_30s_thur_time2;
	  
	  @Column(name="floating_pop_men_30s_thur_time3", length = 20, nullable =
	  false) private int floating_pop_men_30s_thur_time3;
	  
	  @Column(name="floating_pop_men_30s_thur_time4", length = 20, nullable =
	  false) private int floating_pop_men_30s_thur_time4;
	  
	  @Column(name="floating_pop_men_30s_thur_time5", length = 20, nullable =
	  false) private int floating_pop_men_30s_thur_time5;
	  
	  @Column(name="floating_pop_men_30s_thur_time6", length = 20, nullable =
	  false) private int floating_pop_men_30s_thur_time6;
	  
	  @Column(name="floating_pop_men_30s_fri_time1", length = 20, nullable = false)
	  private int floating_pop_men_30s_fri_time1;
	  
	  @Column(name="floating_pop_men_30s_fri_time2", length = 20, nullable = false)
	  private int floating_pop_men_30s_fri_time2;
	  
	  @Column(name="floating_pop_men_30s_fri_time3", length = 20, nullable = false)
	  private int floating_pop_men_30s_fri_time3;
	  
	  @Column(name="floating_pop_men_30s_fri_time4", length = 20, nullable = false)
	  private int floating_pop_men_30s_fri_time4;
	  
	  @Column(name="floating_pop_men_30s_fri_time5", length = 20, nullable = false)
	  private int floating_pop_men_30s_fri_time5;
	  
	  @Column(name="floating_pop_men_30s_fri_time6", length = 20, nullable = false)
	  private int floating_pop_men_30s_fri_time6;
	  
	  @Column(name="floating_pop_men_30s_sat_time1", length = 20, nullable = false)
	  private int floating_pop_men_30s_sat_time1;
	  
	  @Column(name="floating_pop_men_30s_sat_time2", length = 20, nullable = false)
	  private int floating_pop_men_30s_sat_time2;
	  
	  @Column(name="floating_pop_men_30s_sat_time3", length = 20, nullable = false)
	  private int floating_pop_men_30s_sat_time3;
	  
	  @Column(name="floating_pop_men_30s_sat_time4", length = 20, nullable = false)
	  private int floating_pop_men_30s_sat_time4;
	  
	  @Column(name="floating_pop_men_30s_sat_time5", length = 20, nullable = false)
	  private int floating_pop_men_30s_sat_time5;
	  
	  @Column(name="floating_pop_men_30s_sat_time6", length = 20, nullable = false)
	  private int floating_pop_men_30s_sat_time6;
	  
	  @Column(name="floating_pop_men_30s_sun_time1", length = 20, nullable = false)
	  private int floating_pop_men_30s_sun_time1;
	  
	  @Column(name="floating_pop_men_30s_sun_time2", length = 20, nullable = false)
	  private int floating_pop_men_30s_sun_time2;
	  
	  @Column(name="floating_pop_men_30s_sun_time3", length = 20, nullable = false)
	  private int floating_pop_men_30s_sun_time3;
	  
	  @Column(name="floating_pop_men_30s_sun_time4", length = 20, nullable = false)
	  private int floating_pop_men_30s_sun_time4;
	  
	  @Column(name="floating_pop_men_30s_sun_time5", length = 20, nullable = false)
	  private int floating_pop_men_30s_sun_time5;
	  
	  @Column(name="floating_pop_men_30s_sun_time6", length = 20, nullable = false)
	  private int floating_pop_men_30s_sun_time6;
	  
	  @Column(name="floating_pop_men_40s_mon_time1", length = 20, nullable = false)
	  private int floating_pop_men_40s_mon_time1;
	  
	  @Column(name="floating_pop_men_40s_mon_time2", length = 20, nullable = false)
	  private int floating_pop_men_40s_mon_time2;
	  
	  @Column(name="floating_pop_men_40s_mon_time3", length = 20, nullable = false)
	  private int floating_pop_men_40s_mon_time3;
	  
	  @Column(name="floating_pop_men_40s_mon_time4", length = 20, nullable = false)
	  private int floating_pop_men_40s_mon_time4;
	  
	  @Column(name="floating_pop_men_40s_mon_time5", length = 20, nullable = false)
	  private int floating_pop_men_40s_mon_time5;
	  
	  @Column(name="floating_pop_men_40s_mon_time6", length = 20, nullable = false)
	  private int floating_pop_men_40s_mon_time6;
	  
	  @Column(name="floating_pop_men_40s_tue_time1", length = 20, nullable = false)
	  private int floating_pop_men_40s_tue_time1;
	  
	  @Column(name="floating_pop_men_40s_tue_time2", length = 20, nullable = false)
	  private int floating_pop_men_40s_tue_time2;
	  
	  @Column(name="floating_pop_men_40s_tue_time3", length = 20, nullable = false)
	  private int floating_pop_men_40s_tue_time3;
	  
	  @Column(name="floating_pop_men_40s_tue_time4", length = 20, nullable = false)
	  private int floating_pop_men_40s_tue_time4;
	  
	  @Column(name="floating_pop_men_40s_tue_time5", length = 20, nullable = false)
	  private int floating_pop_men_40s_tue_time5;
	  
	  @Column(name="floating_pop_men_40s_tue_time6", length = 20, nullable = false)
	  private int floating_pop_men_40s_tue_time6;
	  
	  @Column(name="floating_pop_men_40s_wen_time1", length = 20, nullable = false)
	  private int floating_pop_men_40s_wen_time1;
	  
	  @Column(name="floating_pop_men_40s_wen_time2", length = 20, nullable = false)
	  private int floating_pop_men_40s_wen_time2;
	  
	  @Column(name="floating_pop_men_40s_wen_time3", length = 20, nullable = false)
	  private int floating_pop_men_40s_wen_time3;
	  
	  @Column(name="floating_pop_men_40s_wen_time4", length = 20, nullable = false)
	  private int floating_pop_men_40s_wen_time4;
	  
	  @Column(name="floating_pop_men_40s_wen_time5", length = 20, nullable = false)
	  private int floating_pop_men_40s_wen_time5;
	  
	  @Column(name="floating_pop_men_40s_wen_time6", length = 20, nullable = false)
	  private int floating_pop_men_40s_wen_time6;
	  
	  @Column(name="floating_pop_men_40s_thur_time1", length = 20, nullable =
	  false) private int floating_pop_men_40s_thur_time1;
	  
	  @Column(name="floating_pop_men_40s_thur_time2", length = 20, nullable =
	  false) private int floating_pop_men_40s_thur_time2;
	  
	  @Column(name="floating_pop_men_40s_thur_time3", length = 20, nullable =
	  false) private int floating_pop_men_40s_thur_time3;
	  
	  @Column(name="floating_pop_men_40s_thur_time4", length = 20, nullable =
	  false) private int floating_pop_men_40s_thur_time4;
	  
	  @Column(name="floating_pop_men_40s_thur_time5", length = 20, nullable =
	  false) private int floating_pop_men_40s_thur_time5;
	  
	  @Column(name="floating_pop_men_40s_thur_time6", length = 20, nullable =
	  false) private int floating_pop_men_40s_thur_time6;
	  
	  @Column(name="floating_pop_men_40s_fri_time1", length = 20, nullable = false)
	  private int floating_pop_men_40s_fri_time1;
	  
	  @Column(name="floating_pop_men_40s_fri_time2", length = 20, nullable = false)
	  private int floating_pop_men_40s_fri_time2;
	  
	  @Column(name="floating_pop_men_40s_fri_time3", length = 20, nullable = false)
	  private int floating_pop_men_40s_fri_time3;
	  
	  @Column(name="floating_pop_men_40s_fri_time4", length = 20, nullable = false)
	  private int floating_pop_men_40s_fri_time4;
	  
	  @Column(name="floating_pop_men_40s_fri_time5", length = 20, nullable = false)
	  private int floating_pop_men_40s_fri_time5;
	  
	  @Column(name="floating_pop_men_40s_fri_time6", length = 20, nullable = false)
	  private int floating_pop_men_40s_fri_time6;
	  
	  @Column(name="floating_pop_men_40s_sat_time1", length = 20, nullable = false)
	  private int floating_pop_men_40s_sat_time1;
	  
	  @Column(name="floating_pop_men_40s_sat_time2", length = 20, nullable = false)
	  private int floating_pop_men_40s_sat_time2;
	  
	  @Column(name="floating_pop_men_40s_sat_time3", length = 20, nullable = false)
	  private int floating_pop_men_40s_sat_time3;
	  
	  @Column(name="floating_pop_men_40s_sat_time4", length = 20, nullable = false)
	  private int floating_pop_men_40s_sat_time4;
	  
	  @Column(name="floating_pop_men_40s_sat_time5", length = 20, nullable = false)
	  private int floating_pop_men_40s_sat_time5;
	  
	  @Column(name="floating_pop_men_40s_sat_time6", length = 20, nullable = false)
	  private int floating_pop_men_40s_sat_time6;
	  
	  @Column(name="floating_pop_men_40s_sun_time1", length = 20, nullable = false)
	  private int floating_pop_men_40s_sun_time1;
	  
	  @Column(name="floating_pop_men_40s_sun_time2", length = 20, nullable = false)
	  private int floating_pop_men_40s_sun_time2;
	  
	  @Column(name="floating_pop_men_40s_sun_time3", length = 20, nullable = false)
	  private int floating_pop_men_40s_sun_time3;
	  
	  @Column(name="floating_pop_men_40s_sun_time4", length = 20, nullable = false)
	  private int floating_pop_men_40s_sun_time4;
	  
	  @Column(name="floating_pop_men_40s_sun_time5", length = 20, nullable = false)
	  private int floating_pop_men_40s_sun_time5;
	  
	  @Column(name="floating_pop_men_40s_sun_time6", length = 20, nullable = false)
	  private int floating_pop_men_40s_sun_time6;
	  
	  @Column(name="floating_pop_men_50s_mon_time1", length = 20, nullable = false)
	  private int floating_pop_men_50s_mon_time1;
	  
	  @Column(name="floating_pop_men_50s_mon_time2", length = 20, nullable = false)
	  private int floating_pop_men_50s_mon_time2;
	  
	  @Column(name="floating_pop_men_50s_mon_time3", length = 20, nullable = false)
	  private int floating_pop_men_50s_mon_time3;
	  
	  @Column(name="floating_pop_men_50s_mon_time4", length = 20, nullable = false)
	  private int floating_pop_men_50s_mon_time4;
	  
	  @Column(name="floating_pop_men_50s_mon_time5", length = 20, nullable = false)
	  private int floating_pop_men_50s_mon_time5;
	  
	  @Column(name="floating_pop_men_50s_mon_time6", length = 20, nullable = false)
	  private int floating_pop_men_50s_mon_time6;
	  
	  @Column(name="floating_pop_men_50s_tue_time1", length = 20, nullable = false)
	  private int floating_pop_men_50s_tue_time1;
	  
	  @Column(name="floating_pop_men_50s_tue_time2", length = 20, nullable = false)
	  private int floating_pop_men_50s_tue_time2;
	  
	  @Column(name="floating_pop_men_50s_tue_time3", length = 20, nullable = false)
	  private int floating_pop_men_50s_tue_time3;
	  
	  @Column(name="floating_pop_men_50s_tue_time4", length = 20, nullable = false)
	  private int floating_pop_men_50s_tue_time4;
	  
	  @Column(name="floating_pop_men_50s_tue_time5", length = 20, nullable = false)
	  private int floating_pop_men_50s_tue_time5;
	  
	  @Column(name="floating_pop_men_50s_tue_time6", length = 20, nullable = false)
	  private int floating_pop_men_50s_tue_time6;
	  
	  @Column(name="floating_pop_men_50s_wen_time1", length = 20, nullable = false)
	  private int floating_pop_men_50s_wen_time1;
	  
	  @Column(name="floating_pop_men_50s_wen_time2", length = 20, nullable = false)
	  private int floating_pop_men_50s_wen_time2;
	  
	  @Column(name="floating_pop_men_50s_wen_time3", length = 20, nullable = false)
	  private int floating_pop_men_50s_wen_time3;
	  
	  @Column(name="floating_pop_men_50s_wen_time4", length = 20, nullable = false)
	  private int floating_pop_men_50s_wen_time4;
	  
	  @Column(name="floating_pop_men_50s_wen_time5", length = 20, nullable = false)
	  private int floating_pop_men_50s_wen_time5;
	  
	  @Column(name="floating_pop_men_50s_wen_time6", length = 20, nullable = false)
	  private int floating_pop_men_50s_wen_time6;
	  
	  @Column(name="floating_pop_men_50s_thur_time1", length = 20, nullable =
	  false) private int floating_pop_men_50s_thur_time1;
	  
	  @Column(name="floating_pop_men_50s_thur_time2", length = 20, nullable =
	  false) private int floating_pop_men_50s_thur_time2;
	  
	  @Column(name="floating_pop_men_50s_thur_time3", length = 20, nullable =
	  false) private int floating_pop_men_50s_thur_time3;
	  
	  @Column(name="floating_pop_men_50s_thur_time4", length = 20, nullable =
	  false) private int floating_pop_men_50s_thur_time4;
	  
	  @Column(name="floating_pop_men_50s_thur_time5", length = 20, nullable =
	  false) private int floating_pop_men_50s_thur_time5;
	  
	  @Column(name="floating_pop_men_50s_thur_time6", length = 20, nullable =
	  false) private int floating_pop_men_50s_thur_time6;
	  
	  @Column(name="floating_pop_men_50s_fri_time1", length = 20, nullable = false)
	  private int floating_pop_men_50s_fri_time1;
	  
	  @Column(name="floating_pop_men_50s_fri_time2", length = 20, nullable = false)
	  private int floating_pop_men_50s_fri_time2;
	  
	  @Column(name="floating_pop_men_50s_fri_time3", length = 20, nullable = false)
	  private int floating_pop_men_50s_fri_time3;
	  
	  @Column(name="floating_pop_men_50s_fri_time4", length = 20, nullable = false)
	  private int floating_pop_men_50s_fri_time4;
	  
	  @Column(name="floating_pop_men_50s_fri_time5", length = 20, nullable = false)
	  private int floating_pop_men_50s_fri_time5;
	  
	  @Column(name="floating_pop_men_50s_fri_time6", length = 20, nullable = false)
	  private int floating_pop_men_50s_fri_time6;
	  
	  @Column(name="floating_pop_men_50s_sat_time1", length = 20, nullable = false)
	  private int floating_pop_men_50s_sat_time1;
	  
	  @Column(name="floating_pop_men_50s_sat_time2", length = 20, nullable = false)
	  private int floating_pop_men_50s_sat_time2;
	  
	  @Column(name="floating_pop_men_50s_sat_time3", length = 20, nullable = false)
	  private int floating_pop_men_50s_sat_time3;
	  
	  @Column(name="floating_pop_men_50s_sat_time4", length = 20, nullable = false)
	  private int floating_pop_men_50s_sat_time4;
	  
	  @Column(name="floating_pop_men_50s_sat_time5", length = 20, nullable = false)
	  private int floating_pop_men_50s_sat_time5;
	  
	  @Column(name="floating_pop_men_50s_sat_time6", length = 20, nullable = false)
	  private int floating_pop_men_50s_sat_time6;
	  
	  @Column(name="floating_pop_men_50s_sun_time1", length = 20, nullable = false)
	  private int floating_pop_men_50s_sun_time1;
	  
	  @Column(name="floating_pop_men_50s_sun_time2", length = 20, nullable = false)
	  private int floating_pop_men_50s_sun_time2;
	  
	  @Column(name="floating_pop_men_50s_sun_time3", length = 20, nullable = false)
	  private int floating_pop_men_50s_sun_time3;
	  
	  @Column(name="floating_pop_men_50s_sun_time4", length = 20, nullable = false)
	  private int floating_pop_men_50s_sun_time4;
	  
	  @Column(name="floating_pop_men_50s_sun_time5", length = 20, nullable = false)
	  private int floating_pop_men_50s_sun_time5;
	  
	  @Column(name="floating_pop_men_50s_sun_time6", length = 20, nullable = false)
	  private int floating_pop_men_50s_sun_time6;
	  
	  @Column(name="floating_pop_men_60s_mon_time1", length = 20, nullable = false)
	  private int floating_pop_men_60s_mon_time1;
	  
	  @Column(name="floating_pop_men_60s_mon_time2", length = 20, nullable = false)
	  private int floating_pop_men_60s_mon_time2;
	  
	  @Column(name="floating_pop_men_60s_mon_time3", length = 20, nullable = false)
	  private int floating_pop_men_60s_mon_time3;
	  
	  @Column(name="floating_pop_men_60s_mon_time4", length = 20, nullable = false)
	  private int floating_pop_men_60s_mon_time4;
	  
	  @Column(name="floating_pop_men_60s_mon_time5", length = 20, nullable = false)
	  private int floating_pop_men_60s_mon_time5;
	  
	  @Column(name="floating_pop_men_60s_mon_time6", length = 20, nullable = false)
	  private int floating_pop_men_60s_mon_time6;
	  
	  @Column(name="floating_pop_men_60s_tue_time1", length = 20, nullable = false)
	  private int floating_pop_men_60s_tue_time1;
	  
	  @Column(name="floating_pop_men_60s_tue_time2", length = 20, nullable = false)
	  private int floating_pop_men_60s_tue_time2;
	  
	  @Column(name="floating_pop_men_60s_tue_time3", length = 20, nullable = false)
	  private int floating_pop_men_60s_tue_time3;
	  
	  @Column(name="floating_pop_men_60s_tue_time4", length = 20, nullable = false)
	  private int floating_pop_men_60s_tue_time4;
	  
	  @Column(name="floating_pop_men_60s_tue_time5", length = 20, nullable = false)
	  private int floating_pop_men_60s_tue_time5;
	  
	  @Column(name="floating_pop_men_60s_tue_time6", length = 20, nullable = false)
	  private int floating_pop_men_60s_tue_time6;
	  
	  @Column(name="floating_pop_men_60s_wen_time1", length = 20, nullable = false)
	  private int floating_pop_men_60s_wen_time1;
	  
	  @Column(name="floating_pop_men_60s_wen_time2", length = 20, nullable = false)
	  private int floating_pop_men_60s_wen_time2;
	  
	  @Column(name="floating_pop_men_60s_wen_time3", length = 20, nullable = false)
	  private int floating_pop_men_60s_wen_time3;
	  
	  @Column(name="floating_pop_men_60s_wen_time4", length = 20, nullable = false)
	  private int floating_pop_men_60s_wen_time4;
	  
	  @Column(name="floating_pop_men_60s_wen_time5", length = 20, nullable = false)
	  private int floating_pop_men_60s_wen_time5;
	  
	  @Column(name="floating_pop_men_60s_wen_time6", length = 20, nullable = false)
	  private int floating_pop_men_60s_wen_time6;
	  
	  @Column(name="floating_pop_men_60s_thur_time1", length = 20, nullable =
	  false) private int floating_pop_men_60s_thur_time1;
	  
	  @Column(name="floating_pop_men_60s_thur_time2", length = 20, nullable =
	  false) private int floating_pop_men_60s_thur_time2;
	  
	  @Column(name="floating_pop_men_60s_thur_time3", length = 20, nullable =
	  false) private int floating_pop_men_60s_thur_time3;
	  
	  @Column(name="floating_pop_men_60s_thur_time4", length = 20, nullable =
	  false) private int floating_pop_men_60s_thur_time4;
	  
	  @Column(name="floating_pop_men_60s_thur_time5", length = 20, nullable =
	  false) private int floating_pop_men_60s_thur_time5;
	  
	  @Column(name="floating_pop_men_60s_thur_time6", length = 20, nullable =
	  false) private int floating_pop_men_60s_thur_time6;
	  
	  @Column(name="floating_pop_men_60s_fri_time1", length = 20, nullable = false)
	  private int floating_pop_men_60s_fri_time1;
	  
	  @Column(name="floating_pop_men_60s_fri_time2", length = 20, nullable = false)
	  private int floating_pop_men_60s_fri_time2;
	  
	  @Column(name="floating_pop_men_60s_fri_time3", length = 20, nullable = false)
	  private int floating_pop_men_60s_fri_time3;
	  
	  @Column(name="floating_pop_men_60s_fri_time4", length = 20, nullable = false)
	  private int floating_pop_men_60s_fri_time4;
	  
	  @Column(name="floating_pop_men_60s_fri_time5", length = 20, nullable = false)
	  private int floating_pop_men_60s_fri_time5;
	  
	  @Column(name="floating_pop_men_60s_fri_time6", length = 20, nullable = false)
	  private int floating_pop_men_60s_fri_time6;
	  
	  @Column(name="floating_pop_men_60s_sat_time1", length = 20, nullable = false)
	  private int floating_pop_men_60s_sat_time1;
	  
	  @Column(name="floating_pop_men_60s_sat_time2", length = 20, nullable = false)
	  private int floating_pop_men_60s_sat_time2;
	  
	  @Column(name="floating_pop_men_60s_sat_time3", length = 20, nullable = false)
	  private int floating_pop_men_60s_sat_time3;
	  
	  @Column(name="floating_pop_men_60s_sat_time4", length = 20, nullable = false)
	  private int floating_pop_men_60s_sat_time4;
	  
	  @Column(name="floating_pop_men_60s_sat_time5", length = 20, nullable = false)
	  private int floating_pop_men_60s_sat_time5;
	  
	  @Column(name="floating_pop_men_60s_sat_time6", length = 20, nullable = false)
	  private int floating_pop_men_60s_sat_time6;
	  
	  @Column(name="floating_pop_men_60s_sun_time1", length = 20, nullable = false)
	  private int floating_pop_men_60s_sun_time1;
	  
	  @Column(name="floating_pop_men_60s_sun_time2", length = 20, nullable = false)
	  private int floating_pop_men_60s_sun_time2;
	  
	  @Column(name="floating_pop_men_60s_sun_time3", length = 20, nullable = false)
	  private int floating_pop_men_60s_sun_time3;
	  
	  @Column(name="floating_pop_men_60s_sun_time4", length = 20, nullable = false)
	  private int floating_pop_men_60s_sun_time4;
	  
	  @Column(name="floating_pop_men_60s_sun_time5", length = 20, nullable = false)
	  private int floating_pop_men_60s_sun_time5;
	  
	  @Column(name="floating_pop_men_60s_sun_time6", length = 20, nullable = false)
	  private int floating_pop_men_60s_sun_time6;
	  
	  @Column(name="floating_pop_women_10s_mon_time1", length = 20, nullable =
	  false) private int floating_pop_women_10s_mon_time1;
	  
	  @Column(name="floating_pop_women_10s_mon_time2", length = 20, nullable =
	  false) private int floating_pop_women_10s_mon_time2;
	  
	  @Column(name="floating_pop_women_10s_mon_time3", length = 20, nullable =
	  false) private int floating_pop_women_10s_mon_time3;
	  
	  @Column(name="floating_pop_women_10s_mon_time4", length = 20, nullable =
	  false) private int floating_pop_women_10s_mon_time4;
	  
	  @Column(name="floating_pop_women_10s_mon_time5", length = 20, nullable =
	  false) private int floating_pop_women_10s_mon_time5;
	  
	  @Column(name="floating_pop_women_10s_mon_time6", length = 20, nullable =
	  false) private int floating_pop_women_10s_mon_time6;
	  
	  @Column(name="floating_pop_women_10s_tue_time1", length = 20, nullable =
	  false) private int floating_pop_women_10s_tue_time1;
	  
	  @Column(name="floating_pop_women_10s_tue_time2", length = 20, nullable =
	  false) private int floating_pop_women_10s_tue_time2;
	  
	  @Column(name="floating_pop_women_10s_tue_time3", length = 20, nullable =
	  false) private int floating_pop_women_10s_tue_time3;
	  
	  @Column(name="floating_pop_women_10s_tue_time4", length = 20, nullable =
	  false) private int floating_pop_women_10s_tue_time4;
	  
	  @Column(name="floating_pop_women_10s_tue_time5", length = 20, nullable =
	  false) private int floating_pop_women_10s_tue_time5;
	  
	  @Column(name="floating_pop_women_10s_tue_time6", length = 20, nullable =
	  false) private int floating_pop_women_10s_tue_time6;
	  
	  @Column(name="floating_pop_women_10s_wen_time1", length = 20, nullable =
	  false) private int floating_pop_women_10s_wen_time1;
	  
	  @Column(name="floating_pop_women_10s_wen_time2", length = 20, nullable =
	  false) private int floating_pop_women_10s_wen_time2;
	  
	  @Column(name="floating_pop_women_10s_wen_time3", length = 20, nullable =
	  false) private int floating_pop_women_10s_wen_time3;
	  
	  @Column(name="floating_pop_women_10s_wen_time4", length = 20, nullable =
	  false) private int floating_pop_women_10s_wen_time4;
	  
	  @Column(name="floating_pop_women_10s_wen_time5", length = 20, nullable =
	  false) private int floating_pop_women_10s_wen_time5;
	  
	  @Column(name="floating_pop_women_10s_wen_time6", length = 20, nullable =
	  false) private int floating_pop_women_10s_wen_time6;
	  
	  @Column(name="floating_pop_women_10s_thur_time1", length = 20, nullable =
	  false) private int floating_pop_women_10s_thur_time1;
	  
	  @Column(name="floating_pop_women_10s_thur_time2", length = 20, nullable =
	  false) private int floating_pop_women_10s_thur_time2;
	  
	  @Column(name="floating_pop_women_10s_thur_time3", length = 20, nullable =
	  false) private int floating_pop_women_10s_thur_time3;
	  
	  @Column(name="floating_pop_women_10s_thur_time4", length = 20, nullable =
	  false) private int floating_pop_women_10s_thur_time4;
	  
	  @Column(name="floating_pop_women_10s_thur_time5", length = 20, nullable =
	  false) private int floating_pop_women_10s_thur_time5;
	  
	  @Column(name="floating_pop_women_10s_thur_time6", length = 20, nullable =
	  false) private int floating_pop_women_10s_thur_time6;
	  
	  @Column(name="floating_pop_women_10s_fri_time1", length = 20, nullable =
	  false) private int floating_pop_women_10s_fri_time1;
	  
	  @Column(name="floating_pop_women_10s_fri_time2", length = 20, nullable =
	  false) private int floating_pop_women_10s_fri_time2;
	  
	  @Column(name="floating_pop_women_10s_fri_time3", length = 20, nullable =
	  false) private int floating_pop_women_10s_fri_time3;
	  
	  @Column(name="floating_pop_women_10s_fri_time4", length = 20, nullable =
	  false) private int floating_pop_women_10s_fri_time4;
	  
	  @Column(name="floating_pop_women_10s_fri_time5", length = 20, nullable =
	  false) private int floating_pop_women_10s_fri_time5;
	  
	  @Column(name="floating_pop_women_10s_fri_time6", length = 20, nullable =
	  false) private int floating_pop_women_10s_fri_time6;
	  
	  @Column(name="floating_pop_women_10s_sat_time1", length = 20, nullable =
	  false) private int floating_pop_women_10s_sat_time1;
	  
	  @Column(name="floating_pop_women_10s_sat_time2", length = 20, nullable =
	  false) private int floating_pop_women_10s_sat_time2;
	  
	  @Column(name="floating_pop_women_10s_sat_time3", length = 20, nullable =
	  false) private int floating_pop_women_10s_sat_time3;
	  
	  @Column(name="floating_pop_women_10s_sat_time4", length = 20, nullable =
	  false) private int floating_pop_women_10s_sat_time4;
	  
	  @Column(name="floating_pop_women_10s_sat_time5", length = 20, nullable =
	  false) private int floating_pop_women_10s_sat_time5;
	  
	  @Column(name="floating_pop_women_10s_sat_time6", length = 20, nullable =
	  false) private int floating_pop_women_10s_sat_time6;
	  
	  @Column(name="floating_pop_women_10s_sun_time1", length = 20, nullable =
	  false) private int floating_pop_women_10s_sun_time1;
	  
	  @Column(name="floating_pop_women_10s_sun_time2", length = 20, nullable =
	  false) private int floating_pop_women_10s_sun_time2;
	  
	  @Column(name="floating_pop_women_10s_sun_time3", length = 20, nullable =
	  false) private int floating_pop_women_10s_sun_time3;
	  
	  @Column(name="floating_pop_women_10s_sun_time4", length = 20, nullable =
	  false) private int floating_pop_women_10s_sun_time4;
	  
	  @Column(name="floating_pop_women_10s_sun_time5", length = 20, nullable =
	  false) private int floating_pop_women_10s_sun_time5;
	  
	  @Column(name="floating_pop_women_10s_sun_time6", length = 20, nullable =
	  false) private int floating_pop_women_10s_sun_time6;
	  
	  @Column(name="floating_pop_women_20s_mon_time1", length = 20, nullable =
	  false) private int floating_pop_women_20s_mon_time1;
	  
	  @Column(name="floating_pop_women_20s_mon_time2", length = 20, nullable =
	  false) private int floating_pop_women_20s_mon_time2;
	  
	  @Column(name="floating_pop_women_20s_mon_time3", length = 20, nullable =
	  false) private int floating_pop_women_20s_mon_time3;
	  
	  @Column(name="floating_pop_women_20s_mon_time4", length = 20, nullable =
	  false) private int floating_pop_women_20s_mon_time4;
	  
	  @Column(name="floating_pop_women_20s_mon_time5", length = 20, nullable =
	  false) private int floating_pop_women_20s_mon_time5;
	  
	  @Column(name="floating_pop_women_20s_mon_time6", length = 20, nullable =
	  false) private int floating_pop_women_20s_mon_time6;
	  
	  @Column(name="floating_pop_women_20s_tue_time1", length = 20, nullable =
	  false) private int floating_pop_women_20s_tue_time1;
	  
	  @Column(name="floating_pop_women_20s_tue_time2", length = 20, nullable =
	  false) private int floating_pop_women_20s_tue_time2;
	  
	  @Column(name="floating_pop_women_20s_tue_time3", length = 20, nullable =
	  false) private int floating_pop_women_20s_tue_time3;
	  
	  @Column(name="floating_pop_women_20s_tue_time4", length = 20, nullable =
	  false) private int floating_pop_women_20s_tue_time4;
	  
	  @Column(name="floating_pop_women_20s_tue_time5", length = 20, nullable =
	  false) private int floating_pop_women_20s_tue_time5;
	  
	  @Column(name="floating_pop_women_20s_tue_time6", length = 20, nullable =
	  false) private int floating_pop_women_20s_tue_time6;
	  
	  @Column(name="floating_pop_women_20s_wen_time1", length = 20, nullable =
	  false) private int floating_pop_women_20s_wen_time1;
	  
	  @Column(name="floating_pop_women_20s_wen_time2", length = 20, nullable =
	  false) private int floating_pop_women_20s_wen_time2;
	  
	  @Column(name="floating_pop_women_20s_wen_time3", length = 20, nullable =
	  false) private int floating_pop_women_20s_wen_time3;
	  
	  @Column(name="floating_pop_women_20s_wen_time4", length = 20, nullable =
	  false) private int floating_pop_women_20s_wen_time4;
	  
	  @Column(name="floating_pop_women_20s_wen_time5", length = 20, nullable =
	  false) private int floating_pop_women_20s_wen_time5;
	  
	  @Column(name="floating_pop_women_20s_wen_time6", length = 20, nullable =
	  false) private int floating_pop_women_20s_wen_time6;
	  
	  @Column(name="floating_pop_women_20s_thur_time1", length = 20, nullable =
	  false) private int floating_pop_women_20s_thur_time1;
	  
	  @Column(name="floating_pop_women_20s_thur_time2", length = 20, nullable =
	  false) private int floating_pop_women_20s_thur_time2;
	  
	  @Column(name="floating_pop_women_20s_thur_time3", length = 20, nullable =
	  false) private int floating_pop_women_20s_thur_time3;
	  
	  @Column(name="floating_pop_women_20s_thur_time4", length = 20, nullable =
	  false) private int floating_pop_women_20s_thur_time4;
	  
	  @Column(name="floating_pop_women_20s_thur_time5", length = 20, nullable =
	  false) private int floating_pop_women_20s_thur_time5;
	  
	  @Column(name="floating_pop_women_20s_thur_time6", length = 20, nullable =
	  false) private int floating_pop_women_20s_thur_time6;
	  
	  @Column(name="floating_pop_women_20s_fri_time1", length = 20, nullable =
	  false) private int floating_pop_women_20s_fri_time1;
	  
	  @Column(name="floating_pop_women_20s_fri_time2", length = 20, nullable =
	  false) private int floating_pop_women_20s_fri_time2;
	  
	  @Column(name="floating_pop_women_20s_fri_time3", length = 20, nullable =
	  false) private int floating_pop_women_20s_fri_time3;
	  
	  @Column(name="floating_pop_women_20s_fri_time4", length = 20, nullable =
	  false) private int floating_pop_women_20s_fri_time4;
	  
	  @Column(name="floating_pop_women_20s_fri_time5", length = 20, nullable =
	  false) private int floating_pop_women_20s_fri_time5;
	  
	  @Column(name="floating_pop_women_20s_fri_time6", length = 20, nullable =
	  false) private int floating_pop_women_20s_fri_time6;
	  
	  @Column(name="floating_pop_women_20s_sat_time1", length = 20, nullable =
	  false) private int floating_pop_women_20s_sat_time1;
	  
	  @Column(name="floating_pop_women_20s_sat_time2", length = 20, nullable =
	  false) private int floating_pop_women_20s_sat_time2;
	  
	  @Column(name="floating_pop_women_20s_sat_time3", length = 20, nullable =
	  false) private int floating_pop_women_20s_sat_time3;
	  
	  @Column(name="floating_pop_women_20s_sat_time4", length = 20, nullable =
	  false) private int floating_pop_women_20s_sat_time4;
	  
	  @Column(name="floating_pop_women_20s_sat_time5", length = 20, nullable =
	  false) private int floating_pop_women_20s_sat_time5;
	  
	  @Column(name="floating_pop_women_20s_sat_time6", length = 20, nullable =
	  false) private int floating_pop_women_20s_sat_time6;
	  
	  @Column(name="floating_pop_women_20s_sun_time1", length = 20, nullable =
	  false) private int floating_pop_women_20s_sun_time1;
	  
	  @Column(name="floating_pop_women_20s_sun_time2", length = 20, nullable =
	  false) private int floating_pop_women_20s_sun_time2;
	  
	  @Column(name="floating_pop_women_20s_sun_time3", length = 20, nullable =
	  false) private int floating_pop_women_20s_sun_time3;
	  
	  @Column(name="floating_pop_women_20s_sun_time4", length = 20, nullable =
	  false) private int floating_pop_women_20s_sun_time4;
	  
	  @Column(name="floating_pop_women_20s_sun_time5", length = 20, nullable =
	  false) private int floating_pop_women_20s_sun_time5;
	  
	  @Column(name="floating_pop_women_20s_sun_time6", length = 20, nullable =
	  false) private int floating_pop_women_20s_sun_time6;
	  
	  @Column(name="floating_pop_women_30s_mon_time1", length = 20, nullable =
	  false) private int floating_pop_women_30s_mon_time1;
	  
	  @Column(name="floating_pop_women_30s_mon_time2", length = 20, nullable =
	  false) private int floating_pop_women_30s_mon_time2;
	  
	  @Column(name="floating_pop_women_30s_mon_time3", length = 20, nullable =
	  false) private int floating_pop_women_30s_mon_time3;
	  
	  @Column(name="floating_pop_women_30s_mon_time4", length = 20, nullable =
	  false) private int floating_pop_women_30s_mon_time4;
	  
	  @Column(name="floating_pop_women_30s_mon_time5", length = 20, nullable =
	  false) private int floating_pop_women_30s_mon_time5;
	  
	  @Column(name="floating_pop_women_30s_mon_time6", length = 20, nullable =
	  false) private int floating_pop_women_30s_mon_time6;
	  
	  @Column(name="floating_pop_women_30s_tue_time1", length = 20, nullable =
	  false) private int floating_pop_women_30s_tue_time1;
	  
	  @Column(name="floating_pop_women_30s_tue_time2", length = 20, nullable =
	  false) private int floating_pop_women_30s_tue_time2;
	  
	  @Column(name="floating_pop_women_30s_tue_time3", length = 20, nullable =
	  false) private int floating_pop_women_30s_tue_time3;
	  
	  @Column(name="floating_pop_women_30s_tue_time4", length = 20, nullable =
	  false) private int floating_pop_women_30s_tue_time4;
	  
	  @Column(name="floating_pop_women_30s_tue_time5", length = 20, nullable =
	  false) private int floating_pop_women_30s_tue_time5;
	  
	  @Column(name="floating_pop_women_30s_tue_time6", length = 20, nullable =
	  false) private int floating_pop_women_30s_tue_time6;
	  
	  @Column(name="floating_pop_women_30s_wen_time1", length = 20, nullable =
	  false) private int floating_pop_women_30s_wen_time1;
	  
	  @Column(name="floating_pop_women_30s_wen_time2", length = 20, nullable =
	  false) private int floating_pop_women_30s_wen_time2;
	  
	  @Column(name="floating_pop_women_30s_wen_time3", length = 20, nullable =
	  false) private int floating_pop_women_30s_wen_time3;
	  
	  @Column(name="floating_pop_women_30s_wen_time4", length = 20, nullable =
	  false) private int floating_pop_women_30s_wen_time4;
	  
	  @Column(name="floating_pop_women_30s_wen_time5", length = 20, nullable =
	  false) private int floating_pop_women_30s_wen_time5;
	  
	  @Column(name="floating_pop_women_30s_wen_time6", length = 20, nullable =
	  false) private int floating_pop_women_30s_wen_time6;
	  
	  @Column(name="floating_pop_women_30s_thur_time1", length = 20, nullable =
	  false) private int floating_pop_women_30s_thur_time1;
	  
	  @Column(name="floating_pop_women_30s_thur_time2", length = 20, nullable =
	  false) private int floating_pop_women_30s_thur_time2;
	  
	  @Column(name="floating_pop_women_30s_thur_time3", length = 20, nullable =
	  false) private int floating_pop_women_30s_thur_time3;
	  
	  @Column(name="floating_pop_women_30s_thur_time4", length = 20, nullable =
	  false) private int floating_pop_women_30s_thur_time4;
	  
	  @Column(name="floating_pop_women_30s_thur_time5", length = 20, nullable =
	  false) private int floating_pop_women_30s_thur_time5;
	  
	  @Column(name="floating_pop_women_30s_thur_time6", length = 20, nullable =
	  false) private int floating_pop_women_30s_thur_time6;
	  
	  @Column(name="floating_pop_women_30s_fri_time1", length = 20, nullable =
	  false) private int floating_pop_women_30s_fri_time1;
	  
	  @Column(name="floating_pop_women_30s_fri_time2", length = 20, nullable =
	  false) private int floating_pop_women_30s_fri_time2;
	  
	  @Column(name="floating_pop_women_30s_fri_time3", length = 20, nullable =
	  false) private int floating_pop_women_30s_fri_time3;
	  
	  @Column(name="floating_pop_women_30s_fri_time4", length = 20, nullable =
	  false) private int floating_pop_women_30s_fri_time4;
	  
	  @Column(name="floating_pop_women_30s_fri_time5", length = 20, nullable =
	  false) private int floating_pop_women_30s_fri_time5;
	  
	  @Column(name="floating_pop_women_30s_fri_time6", length = 20, nullable =
	  false) private int floating_pop_women_30s_fri_time6;
	  
	  @Column(name="floating_pop_women_30s_sat_time1", length = 20, nullable =
	  false) private int floating_pop_women_30s_sat_time1;
	  
	  @Column(name="floating_pop_women_30s_sat_time2", length = 20, nullable =
	  false) private int floating_pop_women_30s_sat_time2;
	  
	  @Column(name="floating_pop_women_30s_sat_time3", length = 20, nullable =
	  false) private int floating_pop_women_30s_sat_time3;
	  
	  @Column(name="floating_pop_women_30s_sat_time4", length = 20, nullable =
	  false) private int floating_pop_women_30s_sat_time4;
	  
	  @Column(name="floating_pop_women_30s_sat_time5", length = 20, nullable =
	  false) private int floating_pop_women_30s_sat_time5;
	  
	  @Column(name="floating_pop_women_30s_sat_time6", length = 20, nullable =
	  false) private int floating_pop_women_30s_sat_time6;
	  
	  @Column(name="floating_pop_women_30s_sun_time1", length = 20, nullable =
	  false) private int floating_pop_women_30s_sun_time1;
	  
	  @Column(name="floating_pop_women_30s_sun_time2", length = 20, nullable =
	  false) private int floating_pop_women_30s_sun_time2;
	  
	  @Column(name="floating_pop_women_30s_sun_time3", length = 20, nullable =
	  false) private int floating_pop_women_30s_sun_time3;
	  
	  @Column(name="floating_pop_women_30s_sun_time4", length = 20, nullable =
	  false) private int floating_pop_women_30s_sun_time4;
	  
	  @Column(name="floating_pop_women_30s_sun_time5", length = 20, nullable =
	  false) private int floating_pop_women_30s_sun_time5;
	  
	  @Column(name="floating_pop_women_30s_sun_time6", length = 20, nullable =
	  false) private int floating_pop_women_30s_sun_time6;
	  
	  @Column(name="floating_pop_women_40s_mon_time1", length = 20, nullable =
	  false) private int floating_pop_women_40s_mon_time1;
	  
	  @Column(name="floating_pop_women_40s_mon_time2", length = 20, nullable =
	  false) private int floating_pop_women_40s_mon_time2;
	  
	  @Column(name="floating_pop_women_40s_mon_time3", length = 20, nullable =
	  false) private int floating_pop_women_40s_mon_time3;
	  
	  @Column(name="floating_pop_women_40s_mon_time4", length = 20, nullable =
	  false) private int floating_pop_women_40s_mon_time4;
	  
	  @Column(name="floating_pop_women_40s_mon_time5", length = 20, nullable =
	  false) private int floating_pop_women_40s_mon_time5;
	  
	  @Column(name="floating_pop_women_40s_mon_time6", length = 20, nullable =
	  false) private int floating_pop_women_40s_mon_time6;
	  
	  @Column(name="floating_pop_women_40s_tue_time1", length = 20, nullable =
	  false) private int floating_pop_women_40s_tue_time1;
	  
	  @Column(name="floating_pop_women_40s_tue_time2", length = 20, nullable =
	  false) private int floating_pop_women_40s_tue_time2;
	  
	  @Column(name="floating_pop_women_40s_tue_time3", length = 20, nullable =
	  false) private int floating_pop_women_40s_tue_time3;
	  
	  @Column(name="floating_pop_women_40s_tue_time4", length = 20, nullable =
	  false) private int floating_pop_women_40s_tue_time4;
	  
	  @Column(name="floating_pop_women_40s_tue_time5", length = 20, nullable =
	  false) private int floating_pop_women_40s_tue_time5;
	  
	  @Column(name="floating_pop_women_40s_tue_time6", length = 20, nullable =
	  false) private int floating_pop_women_40s_tue_time6;
	  
	  @Column(name="floating_pop_women_40s_wen_time1", length = 20, nullable =
	  false) private int floating_pop_women_40s_wen_time1;
	  
	  @Column(name="floating_pop_women_40s_wen_time2", length = 20, nullable =
	  false) private int floating_pop_women_40s_wen_time2;
	  
	  @Column(name="floating_pop_women_40s_wen_time3", length = 20, nullable =
	  false) private int floating_pop_women_40s_wen_time3;
	  
	  @Column(name="floating_pop_women_40s_wen_time4", length = 20, nullable =
	  false) private int floating_pop_women_40s_wen_time4;
	  
	  @Column(name="floating_pop_women_40s_wen_time5", length = 20, nullable =
	  false) private int floating_pop_women_40s_wen_time5;
	  
	  @Column(name="floating_pop_women_40s_wen_time6", length = 20, nullable =
	  false) private int floating_pop_women_40s_wen_time6;
	  
	  @Column(name="floating_pop_women_40s_thur_time1", length = 20, nullable =
	  false) private int floating_pop_women_40s_thur_time1;
	  
	  @Column(name="floating_pop_women_40s_thur_time2", length = 20, nullable =
	  false) private int floating_pop_women_40s_thur_time2;
	  
	  @Column(name="floating_pop_women_40s_thur_time3", length = 20, nullable =
	  false) private int floating_pop_women_40s_thur_time3;
	  
	  @Column(name="floating_pop_women_40s_thur_time4", length = 20, nullable =
	  false) private int floating_pop_women_40s_thur_time4;
	  
	  @Column(name="floating_pop_women_40s_thur_time5", length = 20, nullable =
	  false) private int floating_pop_women_40s_thur_time5;
	  
	  @Column(name="floating_pop_women_40s_thur_time6", length = 20, nullable =
	  false) private int floating_pop_women_40s_thur_time6;
	  
	  @Column(name="floating_pop_women_40s_fri_time1", length = 20, nullable =
	  false) private int floating_pop_women_40s_fri_time1;
	  
	  @Column(name="floating_pop_women_40s_fri_time2", length = 20, nullable =
	  false) private int floating_pop_women_40s_fri_time2;
	  
	  @Column(name="floating_pop_women_40s_fri_time3", length = 20, nullable =
	  false) private int floating_pop_women_40s_fri_time3;
	  
	  @Column(name="floating_pop_women_40s_fri_time4", length = 20, nullable =
	  false) private int floating_pop_women_40s_fri_time4;
	  
	  @Column(name="floating_pop_women_40s_fri_time5", length = 20, nullable =
	  false) private int floating_pop_women_40s_fri_time5;
	  
	  @Column(name="floating_pop_women_40s_fri_time6", length = 20, nullable =
	  false) private int floating_pop_women_40s_fri_time6;
	  
	  @Column(name="floating_pop_women_40s_sat_time1", length = 20, nullable =
	  false) private int floating_pop_women_40s_sat_time1;
	  
	  @Column(name="floating_pop_women_40s_sat_time2", length = 20, nullable =
	  false) private int floating_pop_women_40s_sat_time2;
	  
	  @Column(name="floating_pop_women_40s_sat_time3", length = 20, nullable =
	  false) private int floating_pop_women_40s_sat_time3;
	  
	  @Column(name="floating_pop_women_40s_sat_time4", length = 20, nullable =
	  false) private int floating_pop_women_40s_sat_time4;
	  
	  @Column(name="floating_pop_women_40s_sat_time5", length = 20, nullable =
	  false) private int floating_pop_women_40s_sat_time5;
	  
	  @Column(name="floating_pop_women_40s_sat_time6", length = 20, nullable =
	  false) private int floating_pop_women_40s_sat_time6;
	  
	  @Column(name="floating_pop_women_40s_sun_time1", length = 20, nullable =
	  false) private int floating_pop_women_40s_sun_time1;
	  
	  @Column(name="floating_pop_women_40s_sun_time2", length = 20, nullable =
	  false) private int floating_pop_women_40s_sun_time2;
	  
	  @Column(name="floating_pop_women_40s_sun_time3", length = 20, nullable =
	  false) private int floating_pop_women_40s_sun_time3;
	  
	  @Column(name="floating_pop_women_40s_sun_time4", length = 20, nullable =
	  false) private int floating_pop_women_40s_sun_time4;
	  
	  @Column(name="floating_pop_women_40s_sun_time5", length = 20, nullable =
	  false) private int floating_pop_women_40s_sun_time5;
	  
	  @Column(name="floating_pop_women_40s_sun_time6", length = 20, nullable =
	  false) private int floating_pop_women_40s_sun_time6;
	  
	  @Column(name="floating_pop_women_50s_mon_time1", length = 20, nullable =
	  false) private int floating_pop_women_50s_mon_time1;
	  
	  @Column(name="floating_pop_women_50s_mon_time2", length = 20, nullable =
	  false) private int floating_pop_women_50s_mon_time2;
	  
	  @Column(name="floating_pop_women_50s_mon_time3", length = 20, nullable =
	  false) private int floating_pop_women_50s_mon_time3;
	  
	  @Column(name="floating_pop_women_50s_mon_time4", length = 20, nullable =
	  false) private int floating_pop_women_50s_mon_time4;
	  
	  @Column(name="floating_pop_women_50s_mon_time5", length = 20, nullable =
	  false) private int floating_pop_women_50s_mon_time5;
	  
	  @Column(name="floating_pop_women_50s_mon_time6", length = 20, nullable =
	  false) private int floating_pop_women_50s_mon_time6;
	  
	  @Column(name="floating_pop_women_50s_tue_time1", length = 20, nullable =
	  false) private int floating_pop_women_50s_tue_time1;
	  
	  @Column(name="floating_pop_women_50s_tue_time2", length = 20, nullable =
	  false) private int floating_pop_women_50s_tue_time2;
	  
	  @Column(name="floating_pop_women_50s_tue_time3", length = 20, nullable =
	  false) private int floating_pop_women_50s_tue_time3;
	  
	  @Column(name="floating_pop_women_50s_tue_time4", length = 20, nullable =
	  false) private int floating_pop_women_50s_tue_time4;
	  
	  @Column(name="floating_pop_women_50s_tue_time5", length = 20, nullable =
	  false) private int floating_pop_women_50s_tue_time5;
	  
	  @Column(name="floating_pop_women_50s_tue_time6", length = 20, nullable =
	  false) private int floating_pop_women_50s_tue_time6;
	  
	  @Column(name="floating_pop_women_50s_wen_time1", length = 20, nullable =
	  false) private int floating_pop_women_50s_wen_time1;
	  
	  @Column(name="floating_pop_women_50s_wen_time2", length = 20, nullable =
	  false) private int floating_pop_women_50s_wen_time2;
	  
	  @Column(name="floating_pop_women_50s_wen_time3", length = 20, nullable =
	  false) private int floating_pop_women_50s_wen_time3;
	  
	  @Column(name="floating_pop_women_50s_wen_time4", length = 20, nullable =
	  false) private int floating_pop_women_50s_wen_time4;
	  
	  @Column(name="floating_pop_women_50s_wen_time5", length = 20, nullable =
	  false) private int floating_pop_women_50s_wen_time5;
	  
	  @Column(name="floating_pop_women_50s_wen_time6", length = 20, nullable =
	  false) private int floating_pop_women_50s_wen_time6;
	  
	  @Column(name="floating_pop_women_50s_thur_time1", length = 20, nullable =
	  false) private int floating_pop_women_50s_thur_time1;
	  
	  @Column(name="floating_pop_women_50s_thur_time2", length = 20, nullable =
	  false) private int floating_pop_women_50s_thur_time2;
	  
	  @Column(name="floating_pop_women_50s_thur_time3", length = 20, nullable =
	  false) private int floating_pop_women_50s_thur_time3;
	  
	  @Column(name="floating_pop_women_50s_thur_time4", length = 20, nullable =
	  false) private int floating_pop_women_50s_thur_time4;
	  
	  @Column(name="floating_pop_women_50s_thur_time5", length = 20, nullable =
	  false) private int floating_pop_women_50s_thur_time5;
	  
	  @Column(name="floating_pop_women_50s_thur_time6", length = 20, nullable =
	  false) private int floating_pop_women_50s_thur_time6;
	  
	  @Column(name="floating_pop_women_50s_fri_time1", length = 20, nullable =
	  false) private int floating_pop_women_50s_fri_time1;
	  
	  @Column(name="floating_pop_women_50s_fri_time2", length = 20, nullable =
	  false) private int floating_pop_women_50s_fri_time2;
	  
	  @Column(name="floating_pop_women_50s_fri_time3", length = 20, nullable =
	  false) private int floating_pop_women_50s_fri_time3;
	  
	  @Column(name="floating_pop_women_50s_fri_time4", length = 20, nullable =
	  false) private int floating_pop_women_50s_fri_time4;
	  
	  @Column(name="floating_pop_women_50s_fri_time5", length = 20, nullable =
	  false) private int floating_pop_women_50s_fri_time5;
	  
	  @Column(name="floating_pop_women_50s_fri_time6", length = 20, nullable =
	  false) private int floating_pop_women_50s_fri_time6;
	  
	  @Column(name="floating_pop_women_50s_sat_time1", length = 20, nullable =
	  false) private int floating_pop_women_50s_sat_time1;
	  
	  @Column(name="floating_pop_women_50s_sat_time2", length = 20, nullable =
	  false) private int floating_pop_women_50s_sat_time2;
	  
	  @Column(name="floating_pop_women_50s_sat_time3", length = 20, nullable =
	  false) private int floating_pop_women_50s_sat_time3;
	  
	  @Column(name="floating_pop_women_50s_sat_time4", length = 20, nullable =
	  false) private int floating_pop_women_50s_sat_time4;
	  
	  @Column(name="floating_pop_women_50s_sat_time5", length = 20, nullable =
	  false) private int floating_pop_women_50s_sat_time5;
	  
	  @Column(name="floating_pop_women_50s_sat_time6", length = 20, nullable =
	  false) private int floating_pop_women_50s_sat_time6;
	  
	  @Column(name="floating_pop_women_50s_sun_time1", length = 20, nullable =
	  false) private int floating_pop_women_50s_sun_time1;
	  
	  @Column(name="floating_pop_women_50s_sun_time2", length = 20, nullable =
	  false) private int floating_pop_women_50s_sun_time2;
	  
	  @Column(name="floating_pop_women_50s_sun_time3", length = 20, nullable =
	  false) private int floating_pop_women_50s_sun_time3;
	  
	  @Column(name="floating_pop_women_50s_sun_time4", length = 20, nullable =
	  false) private int floating_pop_women_50s_sun_time4;
	  
	  @Column(name="floating_pop_women_50s_sun_time5", length = 20, nullable =
	  false) private int floating_pop_women_50s_sun_time5;
	  
	  @Column(name="floating_pop_women_50s_sun_time6", length = 20, nullable =
	  false) private int floating_pop_women_50s_sun_time6;
	  
	  @Column(name="floating_pop_women_60s_mon_time1", length = 20, nullable =
	  false) private int floating_pop_women_60s_mon_time1;
	  
	  @Column(name="floating_pop_women_60s_mon_time2", length = 20, nullable =
	  false) private int floating_pop_women_60s_mon_time2;
	  
	  @Column(name="floating_pop_women_60s_mon_time3", length = 20, nullable =
	  false) private int floating_pop_women_60s_mon_time3;
	  
	  @Column(name="floating_pop_women_60s_mon_time4", length = 20, nullable =
	  false) private int floating_pop_women_60s_mon_time4;
	  
	  @Column(name="floating_pop_women_60s_mon_time5", length = 20, nullable =
	  false) private int floating_pop_women_60s_mon_time5;
	  
	  @Column(name="floating_pop_women_60s_mon_time6", length = 20, nullable =
	  false) private int floating_pop_women_60s_mon_time6;
	  
	  @Column(name="floating_pop_women_60s_tue_time1", length = 20, nullable =
	  false) private int floating_pop_women_60s_tue_time1;
	  
	  @Column(name="floating_pop_women_60s_tue_time2", length = 20, nullable =
	  false) private int floating_pop_women_60s_tue_time2;
	  
	  @Column(name="floating_pop_women_60s_tue_time3", length = 20, nullable =
	  false) private int floating_pop_women_60s_tue_time3;
	  
	  @Column(name="floating_pop_women_60s_tue_time4", length = 20, nullable =
	  false) private int floating_pop_women_60s_tue_time4;
	  
	  @Column(name="floating_pop_women_60s_tue_time5", length = 20, nullable =
	  false) private int floating_pop_women_60s_tue_time5;
	  
	  @Column(name="floating_pop_women_60s_tue_time6", length = 20, nullable =
	  false) private int floating_pop_women_60s_tue_time6;
	  
	  @Column(name="floating_pop_women_60s_wen_time1", length = 20, nullable =
	  false) private int floating_pop_women_60s_wen_time1;
	  
	  @Column(name="floating_pop_women_60s_wen_time2", length = 20, nullable =
	  false) private int floating_pop_women_60s_wen_time2;
	  
	  @Column(name="floating_pop_women_60s_wen_time3", length = 20, nullable =
	  false) private int floating_pop_women_60s_wen_time3;
	  
	  @Column(name="floating_pop_women_60s_wen_time4", length = 20, nullable =
	  false) private int floating_pop_women_60s_wen_time4;
	  
	  @Column(name="floating_pop_women_60s_wen_time5", length = 20, nullable =
	  false) private int floating_pop_women_60s_wen_time5;
	  
	  @Column(name="floating_pop_women_60s_wen_time6", length = 20, nullable =
	  false) private int floating_pop_women_60s_wen_time6;
	  
	  @Column(name="floating_pop_women_60s_thur_time1", length = 20, nullable =
	  false) private int floating_pop_women_60s_thur_time1;
	  
	  @Column(name="floating_pop_women_60s_thur_time2", length = 20, nullable =
	  false) private int floating_pop_women_60s_thur_time2;
	  
	  @Column(name="floating_pop_women_60s_thur_time3", length = 20, nullable =
	  false) private int floating_pop_women_60s_thur_time3;
	  
	  @Column(name="floating_pop_women_60s_thur_time4", length = 20, nullable =
	  false) private int floating_pop_women_60s_thur_time4;
	  
	  @Column(name="floating_pop_women_60s_thur_time5", length = 20, nullable =
	  false) private int floating_pop_women_60s_thur_time5;
	  
	  @Column(name="floating_pop_women_60s_thur_time6", length = 20, nullable =
	  false) private int floating_pop_women_60s_thur_time6;
	  
	  @Column(name="floating_pop_women_60s_fri_time1", length = 20, nullable =
	  false) private int floating_pop_women_60s_fri_time1;
	  
	  @Column(name="floating_pop_women_60s_fri_time2", length = 20, nullable =
	  false) private int floating_pop_women_60s_fri_time2;
	  
	  @Column(name="floating_pop_women_60s_fri_time3", length = 20, nullable =
	  false) private int floating_pop_women_60s_fri_time3;
	  
	  @Column(name="floating_pop_women_60s_fri_time4", length = 20, nullable =
	  false) private int floating_pop_women_60s_fri_time4;
	  
	  @Column(name="floating_pop_women_60s_fri_time5", length = 20, nullable =
	  false) private int floating_pop_women_60s_fri_time5;
	  
	  @Column(name="floating_pop_women_60s_fri_time6", length = 20, nullable =
	  false) private int floating_pop_women_60s_fri_time6;
	  
	  @Column(name="floating_pop_women_60s_sat_time1", length = 20, nullable =
	  false) private int floating_pop_women_60s_sat_time1;
	  
	  @Column(name="floating_pop_women_60s_sat_time2", length = 20, nullable =
	  false) private int floating_pop_women_60s_sat_time2;
	  
	  @Column(name="floating_pop_women_60s_sat_time3", length = 20, nullable =
	  false) private int floating_pop_women_60s_sat_time3;
	  
	  @Column(name="floating_pop_women_60s_sat_time4", length = 20, nullable =
	  false) private int floating_pop_women_60s_sat_time4;
	  
	  @Column(name="floating_pop_women_60s_sat_time5", length = 20, nullable =
	  false) private int floating_pop_women_60s_sat_time5;
	  
	  @Column(name="floating_pop_women_60s_sat_time6", length = 20, nullable =
	  false) private int floating_pop_women_60s_sat_time6;
	  
	  @Column(name="floating_pop_women_60s_sun_time1", length = 20, nullable =
	  false) private int floating_pop_women_60s_sun_time1;
	  
	  @Column(name="floating_pop_women_60s_sun_time2", length = 20, nullable =
	  false) private int floating_pop_women_60s_sun_time2;
	  
	  @Column(name="floating_pop_women_60s_sun_time3", length = 20, nullable =
	  false) private int floating_pop_women_60s_sun_time3;
	  
	  @Column(name="floating_pop_women_60s_sun_time4", length = 20, nullable =
	  false) private int floating_pop_women_60s_sun_time4;
	  
	  @Column(name="floating_pop_women_60s_sun_time5", length = 20, nullable =
	  false) private int floating_pop_women_60s_sun_time5;
	  
	  @Column(name="floating_pop_women_60s_sun_time6", length = 20, nullable =
	  false) private int floating_pop_women_60s_sun_time6;
	  
	  @Column(name="apartment_complex", length = 20, nullable = false) private int
	  apartment_complex;
	  
	  @Column(name="apartment_household_area_lessthan_66", length = 20, nullable =
	  false) private int apartment_household_area_lessthan_66;
	  
	  @Column(name="apartment_household_area_66", length = 20, nullable = false)
	  private int apartment_household_area_66;
	  
	  @Column(name="apartment_household_area_99", length = 20, nullable = false)
	  private int apartment_household_area_99;
	  
	  @Column(name="apartment_household_area_132", length = 20, nullable = false)
	  private int apartment_household_area_132;
	  
	  @Column(name="apartment_household_area_165", length = 20, nullable = false)
	  private int apartment_household_area_165;
	  
	  @Column(name="apartment_household_price_lessthan_1million", length = 20,
	  nullable = false) private int apartment_household_price_lessthan_1million;
	  
	  @Column(name="apartment_household_price_1million", length = 20, nullable =
	  false) private int apartment_household_price_1million;
	  
	  @Column(name="apartment_household_price_2million", length = 20, nullable =
	  false) private int apartment_household_price_2million;
	  
	  @Column(name="apartment_household_price_3million", length = 20, nullable =
	  false) private int apartment_household_price_3million;
	  
	  @Column(name="apartment_household_price_4million", length = 20, nullable =
	  false) private int apartment_household_price_4million;
	  
	  @Column(name="apartment_household_price_5million", length = 20, nullable =
	  false) private int apartment_household_price_5million;
	  
	  @Column(name="apartment_household_price_6million", length = 20, nullable =
	  false) private int apartment_household_price_6million;
	  
	  @Column(name="apartment_area_average", length = 20, nullable = false) private
	  int apartment_area_average;
	  
	  @Column(name="apartment_price_average", length = 20, nullable = false)
	  private int apartment_price_average;
	  
	  @Column(name="facilities", length = 20, nullable = false) private int
	  facilities;
	  
	  @Column(name="gov_office", length = 20, nullable = false) private int
	  gov_office;
	  
	  @Column(name="bank", length = 20, nullable = false) private int bank;
	  
	  @Column(name="hospital_general", length = 20, nullable = false) private int
	  hospital_general;
	  
	  @Column(name="hospital_normal", length = 20, nullable = false) private int
	  hospital_normal;
	  
	  @Column(name="pharmacy", length = 20, nullable = false) private int pharmacy;
	  
	  @Column(name="kindergarden", length = 20, nullable = false) private int
	  kindergarden;
	  
	  @Column(name="school_elementary", length = 20, nullable = false) private int
	  school_elementary;
	  
	  @Column(name="school_middle", length = 20, nullable = false) private int
	  school_middle;
	  
	  @Column(name="school_high", length = 20, nullable = false) private int
	  school_high;
	  
	  @Column(name="school_university", length = 20, nullable = false) private int
	  school_university;
	  
	  @Column(name="department", length = 20, nullable = false) private int
	  department;
	  
	  @Column(name="supermarket", length = 20, nullable = false) private int
	  supermarket;
	  
	  @Column(name="theater", length = 20, nullable = false) private int theater;
	  
	  @Column(name="accommodation", length = 20, nullable = false) private int
	  accommodation;
	  
	  @Column(name="airport", length = 20, nullable = false) private int airport;
	  
	  @Column(name="subway", length = 20, nullable = false) private int subway;
	  
	  @Column(name="bus_terminal", length = 20, nullable = false) private int
	  bus_terminal;
	  
	  @Column(name="subway_station", length = 20, nullable = false) private int
	  subway_station;
	  
	  @Column(name="bus_station", length = 20, nullable = false) private int
	  bus_station; }}
