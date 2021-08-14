package com.ourkitchen.app.analysis.controller;

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

import com.ourkitchen.app.analysis.dto.AnalysisDto;
import com.ourkitchen.app.analysis.service.AnalysisService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@AllArgsConstructor
@Controller
public class AnalysisController {

	@Autowired
	private AnalysisService analysisService;

	/**
	 * 주방 조회
	 * @param model
	 * @param pageNum
	 * @return
	 */
		@GetMapping("kitchen/analysis")
	public String getAnalysisList(Model model, @RequestParam(value = "page", defaultValue = "1") Integer pageNum) {
log.info("----------analysisDtoList : {}", "doController");
		List<AnalysisDto> analysisDtoList = analysisService.getAnalysisList(pageNum);
		Integer[] pageList = analysisService.getPageList(pageNum);

log.info("----------analysisDtoList : {}", analysisDtoList);
		model.addAttribute("analysisList", analysisDtoList);
		model.addAttribute("pageList", pageList);

		return "kitchen/analysis/list.html";
	}

	@GetMapping("/analsysis/form/save")
	public String saveAnalysisForm() {
		return "/analysis/save_form";
	}
}
