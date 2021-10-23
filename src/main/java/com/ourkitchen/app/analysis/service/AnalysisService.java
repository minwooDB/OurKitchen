package com.ourkitchen.app.analysis.service;


import java.util.List;


import com.ourkitchen.data.entity.DetailInfoEntity;
import com.ourkitchen.data.entity.TradingAreaInfoEntity;
import com.ourkitchen.data.entity.GuInfoEntity;
import com.ourkitchen.data.entity.KitchenInfoEntity;

public interface AnalysisService {
	List<KitchenInfoEntity> selectKitchenList() throws Exception;
	TradingAreaInfoEntity selectTradingareaInfo(int TradingId) throws Exception;
	GuInfoEntity selectGuInfo(int GuId) throws Exception;
	DetailInfoEntity selectDetailInfo(int id) throws Exception;
}
