 package com.ourkitchen.app.member.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

import com.ourkitchen.app.auth.dto.UserDetails;
import com.ourkitchen.app.kitchen.service.KitchenService;
import com.ourkitchen.app.member.dto.UserInfo;
import com.ourkitchen.app.member.service.MemberService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class MemberController {
	
	private final MemberService memberService;
	
	private final KitchenService kitchenService;

	@GetMapping("/info")
	public String viewMemberInfo() {
		
		return "profile/myinfo";
	}
	
	@GetMapping("/info/profile")
	public String viewMemberProfile(@AuthenticationPrincipal UserDetails userDetail, Model model) {
		UserInfo userInfo = new UserInfo();
		userInfo.setByEntity(userDetail.getUser());
		model.addAttribute("member", userInfo);
		return "profile/myinfo_profile";
	}
	
	@PutMapping("/info/profile")
	public String updateMemberProfile(@AuthenticationPrincipal UserDetails userDetail, @ModelAttribute("member") UserInfo userInfo, Model model) {
		
		memberService.updateUser(userDetail.getUser(), userInfo);
		model.addAttribute("member", userDetail.getUser());
		return "profile/myinfo_profile";
	}
	
	@GetMapping("/info/store")
	public String viewMyStores(@AuthenticationPrincipal UserDetails userDetail, Model model) {
		model.addAttribute("stores", kitchenService.findKitchenByUser(userDetail.getUser()));
		return "profile/myinfo_store";
	}

	@GetMapping("/info/store/{kitchenId}")
	public String viewMyStoreDetail(@PathVariable(name = "kitchenId") Integer kitchenId, Model model) {
		model.addAttribute("store", kitchenService.findKitchenById(kitchenId));
		return "profile/myinfo_store_detail";
	}
}
