package com.ourkitchen.app.auth.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.ourkitchen.enums.Classification;
import com.ourkitchen.enums.StatusCode;

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
	
	@Column(name="last_login", nullable = false)
	private LocalDateTime lastLogin;
	
	@Enumerated(EnumType.STRING)
	@Column(name="active", nullable = false)
	private StatusCode active;

	@Builder
	public UserEntity(Long id, String email, String name, String password, String phoneNum, Classification classification) {
		this.id = id;
		this.email = email;
		this.name = name;
		this.password = password;
		this.phoneNum = phoneNum;
		this.classification = classification;
	}
}
