package com.ourkitchen.data.entity;
  
import java.util.List;

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

import org.springframework.data.jpa.repository.Query;

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
@Table(name="Preview_info")
public class AnalysisInfoEntity{
  
  @Id
  @Column(name="id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  
  @Column(name="resident_pop_most", length = 20, nullable = false) 
  private String resident_pop_most;
  
  @Column(name="economic_pop_most", length = 20, nullable = false) 
  private String economic_pop_most;
  
  @Column(name="floating_pop_most", length = 20, nullable = false) 
  private String floating_pop_most;
  
  @Column(name="apartment_area_most", length = 20, nullable = false) 
  private String apartment_area_most;
  
  @Column(name="apartment_area_avg", length = 20, nullable = false) 
  private int apartment_area_avg;
  
  @Column(name="apartment_price_most", length = 20, nullable = false) 
  private int apartment_price_most;
  
  @Column(name="apartment_price_avg", length = 20, nullable = false) 
  private int apartment_price_avg;
  
  @Column(name="facilities_most", length = 20, nullable = false) 
  private String facilities_most;
  
  @Builder
  public AnalysisInfoEntity(int id, String resident_pop_most, String economic_pop_most, String floating_pop_most, int apartment_area_avg, int apartment_price_most,
  	   int apartment_price_avg, String facilities_most) {
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