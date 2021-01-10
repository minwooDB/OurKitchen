package com.ourkitchen.app.auth.dto;

import java.time.LocalDateTime;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ourkitchen.app.data.entity.UserEntity;
import com.ourkitchen.enums.Classification;
import com.ourkitchen.enums.StatusCode;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class UserDto {
	private Long id;
	
	@NotBlank(message="�̸����� �ʼ� �Է� ���Դϴ�.")
	@Email(message="�̸��� ���Ŀ� ���� �ʽ��ϴ�.")
	private String email;
	
	@NotBlank(message="�̸��� �ʼ� �Է� ���Դϴ�.")
	@Size(min=4, max=20)
	private String name;
	
	@JsonIgnore
	@NotBlank(message="��й�ȣ�� �ʼ� �Է� ���Դϴ�.")
	//@Pattern(regexp="(?=.*\\d)(?=.*[a-zA-Z]).{6,12}", message="��й�ȣ�� ������ ���ڰ� ���� 1�� �̻� ���Ե� 6��~12���� ��й�ȣ���� �մϴ�.")
	private String password;
	
	@Pattern(regexp="^\\d{10}$", message="-�� ������ �ڵ��� ��ȣ�� �Է��ؾ� �մϴ�.")
	private String phoneNum;
	
	private Classification classification;
	private LocalDateTime lastLogin;
	private StatusCode active;
	private LocalDateTime createdDate;
	private LocalDateTime modifiedDate;
	
	public UserEntity toEntity() {
		return UserEntity.builder()
				.id(id)
				.email(email)
				.password(password)
				.name(name)
				.phoneNum(phoneNum)
				.classification(classification)
				.active(active)
				.lastLogin(lastLogin)
				.build();
	}
	
	@Builder
	public UserDto(Long id, String email, String name, String password, String phoneNum, Classification classification) {
		this.id = id;
		this.email = email;
		this.name = name;
		this.password = password;
		this.phoneNum = phoneNum;
		this.classification = classification;
	}
}
