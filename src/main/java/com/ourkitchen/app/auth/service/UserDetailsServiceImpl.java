package com.ourkitchen.app.auth.service;

import java.time.LocalDateTime;
import java.util.Optional;

import org.apache.commons.lang3.StringUtils;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ourkitchen.app.auth.dto.UserDetails;
import com.ourkitchen.data.entity.UserEntity;
import com.ourkitchen.data.repository.UserRepository;
import com.ourkitchen.utils.constants.SystemCodeConstants;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RequiredArgsConstructor
@Service("userDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService{
	
	private final UserRepository userRepo;
	
	@Override
	@Transactional
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		Optional<UserEntity> oUserEntity = userRepo.findByEmail(username);
		UserEntity user = oUserEntity.orElseThrow(() -> new UsernameNotFoundException(String.format("[%s]는 없는 회원 이메일입니다.", username)));
		boolean isEnabled = StringUtils.equals(user.getActive().getCode(), SystemCodeConstants.ACCOUNT_ACTIVE);
		boolean isNonExpired = true;
		boolean passwordNonExpired = true;
		boolean isNonLocked = !StringUtils.equals(user.getActive().getCode(), SystemCodeConstants.ACCOUNT_DORMANT);
		return new UserDetails(user, isEnabled, isNonExpired, passwordNonExpired, isNonLocked);
	}
	
	@Transactional
    public int setBadCredentialsByUsername(String email) throws UsernameNotFoundException {

    	userRepo.findByEmail(email).orElseThrow(() -> new UsernameNotFoundException(String.format("[%s]는 없는 회원 이메일입니다.", email)));

        return 0;
    }

    @Transactional
	public boolean setAuthnSuccessByUsername(String email) {
        try {

    		Optional<UserEntity> oUserEntity = userRepo.findByEmail(email);
    		
    		UserEntity user = oUserEntity.orElseThrow(() -> new UsernameNotFoundException(String.format("[%s]는 없는 회원 이메일입니다.", email)));
    		
    		user.setLastLogin(LocalDateTime.now());

            userRepo.save(user);

            return true;

        } catch (UsernameNotFoundException ex) {

            log.debug("setAuthnSuccessByUsername : {}", ex.getMessage());

            return false;
        }
	}
}
