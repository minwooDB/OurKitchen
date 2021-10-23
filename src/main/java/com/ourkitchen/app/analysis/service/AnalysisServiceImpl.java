package com.ourkitchen.app.analysis.service;


import java.util.List;


import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ourkitchen.data.entity.DetailInfoEntity;
import com.ourkitchen.data.entity.GuInfoEntity;
import com.ourkitchen.data.entity.KitchenInfoEntity;
import com.ourkitchen.data.entity.TestEntity.AnalysisEntity;
import com.ourkitchen.data.entity.TradingAreaInfoEntity;
import com.ourkitchen.data.repository.TradingAreaInfoRepository;
import com.ourkitchen.data.repository.DetailInfoRepository;
import com.ourkitchen.data.repository.GuInfoRepository;
import com.ourkitchen.data.repository.KitchenInfoRepository;

@Service
public class AnalysisServiceImpl implements AnalysisService{
	
	@Autowired
	TradingAreaInfoRepository TradingAreaInfoRepository;
	
	@Autowired
	GuInfoRepository GuInfoRepository;
	
	@Autowired
	KitchenInfoRepository KitchenInfoRepository;
	
	@Autowired
	DetailInfoRepository DetailInfoRepository;
	
	
	@Override public List<KitchenInfoEntity> selectKitchenList() throws Exception{ 
		return KitchenInfoRepository.findByOrderId(); 
	
	}
    
	@Override
	public TradingAreaInfoEntity selectTradingareaInfo(int TradingId) throws Exception {
		List<TradingAreaInfoEntity> selectTradingareaInfo = TradingAreaInfoRepository.findBytradingId(TradingId);		
			return (TradingAreaInfoEntity) selectTradingareaInfo;
	}

	public GuInfoEntity selectGuInfo(int GuId) throws Exception {
		List <GuInfoEntity> selectGuInfo = GuInfoRepository.findByGuId(GuId);
			return (GuInfoEntity) selectGuInfo;
	}

	@Override
	public DetailInfoEntity selectDetailInfo(int id) throws Exception {
		List<DetailInfoEntity> selectDetailInfo = DetailInfoRepository.findByDetailId(id);
		return (DetailInfoEntity) selectDetailInfo;
	}
}
