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
@EqualsAndHashCode(of = {"GuId"})
@Getter
@Setter
@Table(name="Preview_info2")
  
public class GuInfoEntity{
  @Id
  @Column(name="GuId")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int GuId;
  
  @Column(name="gu_code", length = 20, nullable = false) private
  int gu_code;
  
  @Column(name="gu_name", length = 20, nullable = false) private
  String gu_name;
  
  @Column(name="gu_total_resident_pop", length = 20, nullable = false) 
  private int gu_total_resident_pop;
  
  @Column(name="gu_total_resident_pop_men", length = 20, nullable = false) 
  private int gu_total_resident_pop_men;
  
  @Column(name="gu_total_resident_pop_women", length = 20, nullable = false) 
  private int gu_total_resident_pop_women;
  
  @Column(name="gu_total_economic_pop", length = 20, nullable = false) 
  private int gu_total_economic_pop;
  
  @Column(name="gu_total_economic_pop_men", length = 20, nullable = false) 
  private int gu_total_economic_pop_men;
  
  @Column(name="gu_total_economic_pop_women", length = 20, nullable = false) 
  private int gu_total_economic_pop_women;
  
  @Column(name="gu_total_floating_pop", length = 20, nullable = false) 
  private int gu_total_floating_pop;
  
  @Column(name="gu_total_floating_pop_men", length = 20, nullable = false) 
  private int gu_total_floating_pop_men;
  
  @Column(name="gu_total_floating_pop_women", length = 20, nullable = false) 
  private int gu_total_floating_pop_women;
  
@Builder
public GuInfoEntity(int GuId, int gu_code, String gu_name, int gu_total_resident_pop, int gu_total_resident_pop_men, int gu_total_resident_pop_women,
	   int gu_total_economic_pop, int gu_total_economic_pop_men, int gu_total_economic_pop_women, int gu_total_floating_pop, int gu_total_floating_pop_men, int gu_total_floating_pop_women) {
		this.GuId = GuId;
		this.gu_code = gu_code;
		this.gu_name = gu_name;
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
}