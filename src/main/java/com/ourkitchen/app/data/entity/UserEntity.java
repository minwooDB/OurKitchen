package com.ourkitchen.app.data.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang3.StringUtils;

import com.ourkitchen.utils.constants.SystemCodeConstants;
import com.ourkitchen.utils.enums.Role;
import com.ourkitchen.utils.enums.StatusCode;

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
@Table(name="user")
public class UserEntity {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="email", length = 255, nullable = false, unique=true)
	private String email;
	
	@Column(name="name", length = 20, nullable = false)
	private String name;
	
	@Column(name="password", length = 255, nullable = false)
	private String password;
	
	@Column(name="phone_num", length = 30)
	private String phoneNum;
	
	@Enumerated(EnumType.STRING)
	@Column(name="role", nullable = false)
	private Role role;
	
	@Column(name="last_login")
	private LocalDateTime lastLogin;
	
	@Enumerated(EnumType.STRING)
	@Column(name="active")
	private StatusCode active;

	@Builder
	public UserEntity(Long id, String email, String name, String password, String phoneNum, Role role, StatusCode active, LocalDateTime lastLogin) {
		this.id = id;
		this.email = email;
		this.name = name;
		this.password = password;
		this.phoneNum = phoneNum;
		this.role = role;
		this.active = active;
		this.lastLogin = lastLogin;
	}
	
	public boolean isActive() {
		return StringUtils.equals(getActive().toString(), SystemCodeConstants.ACCOUNT_ACTIVE);
	}
}
