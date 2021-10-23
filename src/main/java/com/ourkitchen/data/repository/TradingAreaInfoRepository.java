package com.ourkitchen.data.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.ourkitchen.data.entity.TradingAreaInfoEntity;


public interface TradingAreaInfoRepository extends CrudRepository<TradingAreaInfoRepository, Long> {
		@Query(nativeQuery = true, value = "SELECT * FROM tradingarea_preview_tb as t WHERE t.id")
		List<TradingAreaInfoEntity> findBytradingId(int tradingId);
}
// �������͸� �ۼ� �� ����Ǿ����� �߰� �ۼ� �κ��� �̾ �ۼ�