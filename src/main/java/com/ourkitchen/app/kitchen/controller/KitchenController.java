package com.ourkitchen.app.kitchen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ourkitchen.app.kitchen.dto.KitchenDto;
import com.ourkitchen.app.kitchen.service.KitchenService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@AllArgsConstructor
@Controller
public class KitchenController {
	
	@Autowired
	private KitchenService kitchenService;
	
	@GetMapping("/kitchen")
	public String getKitchenList(Model model) {
		List<KitchenDto> kitchenDtoList = kitchenService.getKitchenList();
		model.addAttribute("KitchenList", kitchenDtoList);
		return "/kitchen";
	}

}
