package com.ourkitchen.app.auth.dto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

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
public class UserDetailsImpl implements UserDetails{

	private static final long serialVersionUID = 791497140437631835L;
	
	private Long id;
	
	@NotBlank(message="이메일은 필수 입력 값입니다.")
	@Email(message="이메일 형식에 맞지 않습니다.")
	private String email;
	
	@NotBlank(message="이름은 필수 입력 값입니다.")
	@Size(min=4, max=20)
	private String name;
	
	@JsonIgnore
	@NotBlank(message="비밀번호는 필수 입력 값입니다.")
	@Pattern(regexp="(?=.*\\d)(?=.*[a-zA-Z]).{6,12}", message="비밀번호는 영문과 숫자가 각각 1자 이상씩 포함된 6자~12자의 비밀번호여야 합니다.")
	private String password;
	
	@Pattern(regexp="^\\d{10}$", message="-를 제외한 핸드폰 번호를 입력해야 합니다.")
	private String phoneNum;
	
	private Classification classification;
	private LocalDateTime lastLogin;
	private StatusCode active;
	private LocalDateTime createdDate;
	private LocalDateTime modifiedDate;
	
	private String AUTHORITY;
	
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
	public UserDetailsImpl(Long id, String email, String name, String password, String phoneNum, Classification classification) {
		this.id = id;
		this.email = email;
		this.name = name;
		this.password = password;
		this.phoneNum = phoneNum;
		this.classification = classification;
	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		List<GrantedAuthority> auth = new ArrayList<GrantedAuthority>();
		auth.add(new SimpleGrantedAuthority(AUTHORITY));
		return auth;
	}
	@Override
	public String getPassword() {
		return password;
	}
	@Override
	public String getUsername() {
		return email;
	}
	@Override
	public boolean isAccountNonExpired() {
		return true;
	}
	@Override
	public boolean isAccountNonLocked() {
		return true;
	}
	@Override
	public boolean isCredentialsNonExpired() {
		return false;
	}
	@Override
	public boolean isEnabled() {
		return active==StatusCode.C01?true:false;
	}
	
}
