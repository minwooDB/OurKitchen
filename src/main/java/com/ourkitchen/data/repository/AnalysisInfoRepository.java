package com.ourkitchen.data.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ourkitchen.data.entity.AnalysisInfoEntity;

public interface AnalysisInfoRepository extends JpaRepository<AnalysisInfoEntity, Long> {
	public List<AnalysisInfoEntity> findAllByTradingareaCode(String TradingareaCode);

}
