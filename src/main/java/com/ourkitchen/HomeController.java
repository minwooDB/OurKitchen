package com.ourkitchen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ourkitchen.auth.vo.Classification;
import com.ourkitchen.auth.vo.User;
import com.ourkitchen.repository.UserRepository;

@RestController
public class HomeController{

	@Autowired
	UserRepository userRepo;
	
    @GetMapping("/home")
    public String home(){
    	User user = new User();
		user.setEmail("@naver.com");
		user.setName("name");
		user.setPassword("1234");
		user.setClassification(Classification.P);
		System.out.println(userRepo.save(user).toString());
		
		
        return "test";
    }
}