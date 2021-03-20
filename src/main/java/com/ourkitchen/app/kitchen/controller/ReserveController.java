package com.ourkitchen.app.kitchen.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import com.ourkitchen.app.auth.service.UserDetailsServiceImpl;
import com.ourkitchen.app.data.entity.AnalysisEntity;
import com.ourkitchen.app.data.repository.AnalysisRepository;
import com.ourkitchen.app.kitchen.dto.KitchenDto;

import antlr.collections.List;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@AllArgsConstructor
@Controller
@SessionAttributes("user")
public class ReserveController {
	
	@Autowired
	private AnalysisRepository analysisRepository;
	
	@GetMapping("/kitchen/search/reserve")
	public String KitchenSearch() {
		log.info("----------first");
		return "/kitchen/analysis";
	}
	
	/*
	 * @PostMapping("kitchen/search/reserve") public String
	 * SelectTime(KitchenTimeDto KitchenTimeDto) { log.info("----------sec"); return
	 * "redirect:/"; }
	 */
	/*
	 * @RequestMapping(value = "/analysis/lat/lng", method = RequestMethod.GET)
	 * public @ResponseBody Optional<AnalysisEntity> analysisData(Long rdnm) {
	 * return analysisRepository.findByRdnm(rdnm); }
	 */
	
}