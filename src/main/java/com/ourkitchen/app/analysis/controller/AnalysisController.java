package com.ourkitchen.app.analysis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import com.ourkitchen.app.analysis.service.AnalysisService;
import com.ourkitchen.data.entity.DetailInfoEntity;
import com.ourkitchen.data.entity.TradingAreaInfoEntity;
import com.ourkitchen.data.entity.GuInfoEntity;
import com.ourkitchen.data.entity.KitchenInfoEntity;


@Controller
public class AnalysisController {
	
	@Autowired
	private AnalysisService analysisService;
	
	//해당 부분을 변경하여 맵에 관련 주방들이 팝업
	@GetMapping("/")
	public ModelAndView openKithcenList() throws Exception{
		ModelAndView mv = new ModelAndView("/kitchen");
		
		List<KitchenInfoEntity> list = analysisService.selectKitchenList();
		//주방 정보를 활용하여 서비스에서 해당 함수 생성 필요함
		mv.addObject("list", list);
		return mv;
	}
	
	@GetMapping("/analysis/Info/{GuId}/{TradingId}")
	public String analysisInfo(@PathVariable("GuId") int GuId, @PathVariable("TradingId") int TradingId, Model model) throws Exception {
		//분석 정보 확인을 위한 html 추가 필요
		//구 코드와 상권 정보를 넘겨받아 해당 인수로 프리뷰 정보 검색
		
		TradingAreaInfoEntity tradingareainfo = analysisService.selectTradingareaInfo(TradingId);
		tradingareainfo = analysisService.selectTradingareaInfo(TradingId);
		
		GuInfoEntity guinfo = analysisService.selectGuInfo(GuId);
		tradingareainfo = analysisService.selectTradingareaInfo(GuId);
		
		model.addAttribute("tradingareainfo", tradingareainfo);
		model.addAttribute("guanalysisinfo", guinfo);
		return "analysis";
	}
	
	@GetMapping("/analysis/Info/{gucode}/{tradingareacode}/detail")
	public String analysisInfoDetail(@PathVariable("id") int id, Model model) throws Exception {
		
		DetailInfoEntity detail = analysisService.selectDetailInfo(id);
		model.addAttribute("detail", detail);
		//요약 정보에서 상세보기를 클릭하여 이동
		//함수 추가 필요
		
		return "analysisdetail";
	}
	
}
