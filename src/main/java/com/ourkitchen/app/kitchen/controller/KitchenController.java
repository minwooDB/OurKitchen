package com.ourkitchen.app.kitchen.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.ourkitchen.app.auth.dto.UserDetails;
import com.ourkitchen.app.kitchen.dto.FileDto;
import com.ourkitchen.app.kitchen.dto.KitchenDto;
import com.ourkitchen.app.kitchen.service.FileService;
import com.ourkitchen.app.kitchen.service.KitchenService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@AllArgsConstructor
@Controller
public class KitchenController {

	@Autowired
	private KitchenService kitchenService;
	@Autowired
	private FileService fileService;

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

	@GetMapping("/kitchen/form/save")
	public String saveKitchenForm() {
		return "/kitchen/save_form";
	}

	/**
	 * 주방 정보 등록
	 * @param kitchenDto
	 * @param files
	 * @return
	 * @throws IOException
	 */
	
	@PostMapping("kitchen")
	public String addKitchenDetail(@AuthenticationPrincipal UserDetails userDetails, KitchenDto kitchenDto, @RequestParam("files") List<MultipartFile> files)
			throws IOException {
		try {
log.info("----------do KitchenController : addKitchenDetail");
	
			/* SOMI - 수정 */
			kitchenDto.setUserId(userDetails.getUser().getId());
			kitchenDto.setLat(37.5602);
			kitchenDto.setLng(126.9847);
			Long kitchenId = kitchenService.addKitchenDetail(kitchenDto);
log.info("----------kitchen Dto : {}", kitchenDto.toString());
			
			fileService.addKitchenImages(kitchenId, files);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:/";
	}

	@GetMapping("/kitchen/search")
	public String search(@RequestParam(value = "keyword") String keyword,
			@RequestParam(value = "page", defaultValue = "1") Integer pageNum, Model model) {
		log.info("----------keyword : {}", keyword);
		log.info("----------pageNum : {}", pageNum);
		List<KitchenDto> kitchenDtoList = kitchenService.searchPosts(pageNum, keyword);

		Integer[] pageList = kitchenService.getPageList(pageNum);

		model.addAttribute("kitchenList", kitchenDtoList);
		model.addAttribute("pageList", pageList);

		return "kitchen/list.html";
	}

}