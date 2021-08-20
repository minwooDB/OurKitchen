package com.ourkitchen.data.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ourkitchen.data.entity.AnalysisInfoEntity2;

public interface AnalysisInfoRepository2 extends JpaRepository<AnalysisInfoEntity2, Long> {
	public List<AnalysisInfoEntity2> findByGuCode(String GuCode);

}
