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
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@Table(name="Preview_info")
@Data
public class KitchenInfoEntity{  
  @Id
  @Column(name="id")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  
  @Column(nullable = false) 
  private String resident_pop_most;
  
  @Column(nullable = false) 
  private String economic_pop_most;
  
  @Column(nullable = false) 
  private String floating_pop_most;
  
  @Column(nullable = false) 
  private String apartment_area_most;
  
  @Column(nullable = false) 
  private String apartment_area_avg;
  
  @Column(nullable = false) 
  private String apartment_price_most;
  
  @Column(nullable = false) 
  private String apartment_price_avg;
  
  @Column(nullable = false) 
  private String facilities_most;
  
  @Builder
  public KitchenInfoEntity(int id, String resident_pop_most, String economic_pop_most, String floating_pop_most, String apartment_area_most, String apartment_area_avg, String apartment_price_most,
  	   String apartment_price_avg, String facilities_most) {
  		this.id = id;
  		this.resident_pop_most = resident_pop_most;
  		this.economic_pop_most = economic_pop_most;
  		this.floating_pop_most = floating_pop_most;
  		this.apartment_area_most = apartment_area_most;
  		this.apartment_area_avg = apartment_area_avg;
  		this.apartment_price_most = apartment_price_most;
  		this.apartment_price_avg = apartment_price_avg;
  		this.facilities_most = facilities_most;
  	}
}