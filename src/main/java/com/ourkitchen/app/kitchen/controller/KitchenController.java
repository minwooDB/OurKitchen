package com.ourkitchen.app.kitchen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	public String getKitchenList(Model model, @RequestParam(value = "page", defaultValue = "1") Integer pageNum) {
log.info("----------kitchenDtoList : {}", "doController");
		List<KitchenDto> kitchenDtoList = kitchenService.getKitchenList(pageNum);
		Integer[] pageList = kitchenService.getPageList(pageNum);

log.info("----------kitchenDtoList : {}", kitchenDtoList);
		model.addAttribute("kitchenList", kitchenDtoList);
		model.addAttribute("pageList", pageList);

		return "kitchen/list.html";
	}

	@GetMapping("/kitchen/write")
	public String dispKitchenWrite() {
		return "/kitchen/write";
	}

	@PostMapping("kitchen/write")
	public String addKitchenDetail(KitchenDto kitchenDto) {
		kitchenDto.setUserId(1); // springSecurityUser.getId()
		kitchenDto.setLat(37.5602);
		kitchenDto.setLng(126.9847);

log.info("----------kitchen Dto : {}", kitchenDto.toString());
		kitchenService.addKitchenDetail(kitchenDto);

		return "redirect:/";
	}

	@GetMapping("/kitchen/search")
	public String search(@RequestParam(value = "keyword") String keyword,@RequestParam(value= "page", defaultValue="1") Integer pageNum,  Model model) {
log.info("----------keyword : {}", keyword);
log.info("----------pageNum : {}", pageNum);
		List<KitchenDto> kitchenDtoList = kitchenService.searchPosts(pageNum,keyword);
		Integer[] pageList = kitchenService.getPageList(pageNum);
		model.addAttribute("kitchenList", kitchenDtoList);
		model.addAttribute("pageList", pageList);
		return "kitchen/list.html";
	}
}