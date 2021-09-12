package com.ourkitchen.app.member.dto;

import com.ourkitchen.data.entity.UserEntity;
import com.ourkitchen.utils.enums.Role;

import lombok.Data;

@Data
public class UserInfo {
	
	private Integer id;
	
	private String email;
	
	private String name;
	
	private String phoneNum;
	
	private Role role;
	
	//private StatusCode active;
	
	public void setByEntity(UserEntity entity) {
		this.id = entity.getId();
		this.email = entity.getEmail();
		this.name = entity.getName();
		this.phoneNum = entity.getPhoneNum();
		this.role = entity.getRole();
		
	}
}
