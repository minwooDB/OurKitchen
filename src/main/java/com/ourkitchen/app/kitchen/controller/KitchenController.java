package com.ourkitchen.app.kitchen.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.ourkitchen.app.auth.dto.UserDetails;
import com.ourkitchen.app.kitchen.dto.FileDto;
import com.ourkitchen.app.kitchen.dto.KitchenDetail;
import com.ourkitchen.app.kitchen.dto.KitchenDto;
import com.ourkitchen.app.kitchen.dto.KitchenListDto;
import com.ourkitchen.app.kitchen.service.FileService;
import com.ourkitchen.app.kitchen.service.KitchenService;
import com.ourkitchen.data.entity.KitchenInfoEntity;

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

	/**
	 * 주방 리스트 조회
	 * @param model
	 * @param pageNum
	 * @return
	 */
	@GetMapping("/kitchen")
	public String getKitchenList(Model model, @RequestParam(value = "page", defaultValue = "1") Integer pageNum) {
log.info("----------kitchenDtoList : {}", "doController");
		List<KitchenListDto> kitchenDtoList = kitchenService.getKitchenList(pageNum);
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
	@PostMapping("/kitchen")
	public String addKitchenDetail(@AuthenticationPrincipal UserDetails userDetails, KitchenDetail kitchenDetail, @RequestParam("files") List<MultipartFile> files)
			throws IOException {
		try {
log.info("----------do KitchenController : addKitchenDetail");
log.info("----------userDetails: {}", userDetails);
log.info("----------kitchenDetail : {}", kitchenDetail);
			/* SOMI - service로 트랜잭션 처리*/
		KitchenInfoEntity kitchen = kitchenService.addKitchenDetail(userDetails.getUser(), kitchenDetail, files);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:/";
	}
	
	/**
	 * 주방 상세 조회
	 * @param id
	 * @param model
	 * @return
	 */
	@GetMapping("/kitchen/{no}")
	public String getKitchenDetail(@PathVariable("no") Integer id, Model model) {
		KitchenDetail kitchenDetail = kitchenService.getPost(id);
		List<FileDto> fileDtoList = fileService.findAllByKitchen(kitchenService.findKitchenById(id));
		
		model.addAttribute("kitchenDetail", kitchenDetail);
		model.addAttribute("fileDtoList",fileDtoList);
log.info("fileDtoList : {}", fileDtoList);
		return "kitchen/post.html";
	}
	
/**
 * 주방 정보 검색
 * @param keyword
 * @param pageNum
 * @param model
 * @return
 */
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