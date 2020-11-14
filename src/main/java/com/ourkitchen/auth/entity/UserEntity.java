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

@Entity
@Table(name="user")
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
	
	
	public UserEntity(Long id, String email, String name, String password, String phoneNum,
			Classification classification) {
		super();
		this.id = id;
		this.email = email;
		this.name = name;
		this.password = password;
		this.phoneNum = phoneNum;
		this.classification = classification;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public Classification getClassification() {
		return classification;
	}
	public void setClassification(Classification classification) {
		this.classification = classification;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", name=" + name + ", password=" + password + ", phoneNum="
				+ phoneNum + ", classification=" + classification + "]";
	}
	
	
}
