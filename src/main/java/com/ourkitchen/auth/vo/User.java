package com.ourkitchen.auth.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.*;

@Getter
@Setter
@ToString
@Entity
@Table(name="user")
public class User {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="eamil")
	private String email;
	@Column(name="name")
	private String name;
	@Column(name="password")
	private String password;
	@Column(name="phone_num")
	private String phoneNum;
	
	@Enumerated(EnumType.STRING)
	@Column(name="classification")
	private Classification classification;
	
}