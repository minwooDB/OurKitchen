package com.ourkitchen.auth.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.ourkitchen.auth.vo.Classification;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "user")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"id"})
public class UserEntity {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="eamil", length = 255, nullable = false)
	private String email;
	
	@Column(name="name", length = 20, nullable = false)
	private String name;
	
	@Column(name="password", length = 12, nullable = false)
	private String password;
	
	@Column(name="phone_num", length = 30, nullable = false)
	private String phoneNum;
	
	@Enumerated(EnumType.STRING)
	@Column(name="classification", nullable = false)
	private Classification classification;
	
}
