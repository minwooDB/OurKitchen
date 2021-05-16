package com.ourkitchen.app.auth.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ourkitchen.data.entity.UserEntity;
import com.ourkitchen.utils.constants.SystemCodeConstants;
import com.ourkitchen.utils.enums.Role;
import com.ourkitchen.utils.enums.StatusCode;

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
	
	@NotBlank(message="이메일은 필수로 입력해주세요")
	@Email(message="이메일 형식에 맞지 않는 값입니다.")
	private String email;
	
	@NotBlank(message="이름은 필수로 입력해주세요.")
	@Size(min=4, max=20)
	private String name;
	
	@JsonIgnore
	@NotBlank(message="비밀번호는 필수로 입력해주세요.")
	@Pattern(regexp="(?=.*\\d)(?=.*[a-zA-Z]).{8,16}", message="8~16자 영문(대소문자), 숫자를 포함하세요.")
	private String password;
	
	@Pattern(regexp="^\\d{10}$", message="-를 제외한 핸드폰 번호를 입력해주세요.")
	private String phoneNum;
	
	private String role;
	
	public UserEntity toEntity() {
		return UserEntity.builder()
				.id(id)
				.email(email)
				.password(password)
				.name(name)
				.phoneNum(phoneNum)
				.role(Role.valueOf(role))
				.active(StatusCode.valueOf(SystemCodeConstants.ACCOUNT_ACTIVE))
				.build();
	}
	
}