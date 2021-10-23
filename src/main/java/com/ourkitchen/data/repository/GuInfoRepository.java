package com.ourkitchen.data.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ourkitchen.data.entity.TradingAreaInfoEntity;
import com.ourkitchen.data.entity.GuInfoEntity;

public interface GuInfoRepository extends CrudRepository<GuInfoEntity, Long> {
	@Query(nativeQuery = true, value = "SELECT * FROM gu_preview_tb as g WHERE g.id")
	List<GuInfoEntity> findByGuId(int GuId);
}
