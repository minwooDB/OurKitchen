package com.ourkitchen.data.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ourkitchen.data.entity.TradingAreaInfoEntity;
import com.ourkitchen.data.entity.DetailInfoEntity;
import com.ourkitchen.data.entity.GuInfoEntity;

public interface DetailInfoRepository extends CrudRepository<DetailInfoEntity, Long> {
	@Query(nativeQuery = true, value = "SELECT * FROM detatil_tb as d WHERE d.id")
	List<DetailInfoEntity> findByDetailId(int Id);
}
