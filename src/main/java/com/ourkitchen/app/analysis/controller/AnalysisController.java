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
	
	//�ش� �κ��� �����Ͽ� �ʿ� ���� �ֹ���� �˾�
	@GetMapping("/")
	public ModelAndView openKithcenList() throws Exception{
		ModelAndView mv = new ModelAndView("/kitchen");
		
		List<KitchenInfoEntity> list = analysisService.selectKitchenList();
		//�ֹ� ������ Ȱ���Ͽ� ���񽺿��� �ش� �Լ� ���� �ʿ���
		mv.addObject("list", list);
		return mv;
	}
	
	@GetMapping("/analysis/Info/{GuId}/{TradingId}")
	public String analysisInfo(@PathVariable("GuId") int GuId, @PathVariable("TradingId") int TradingId, Model model) throws Exception {
		//�м� ���� Ȯ���� ���� html �߰� �ʿ�
		//�� �ڵ�� ��� ������ �Ѱܹ޾� �ش� �μ��� ������ ���� �˻�
		
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
		//��� �������� �󼼺��⸦ Ŭ���Ͽ� �̵�
		//�Լ� �߰� �ʿ�
		
		return "analysisdetail";
	}
	
}
