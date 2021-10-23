package com.ourkitchen.data.repository;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.ourkitchen.data.entity.KitchenInfoEntity;

public interface KitchenInfoRepository extends CrudRepository<KitchenInfoEntity, Long> {
		public List<KitchenInfoEntity> findByOrderId();
		//KitchenInfoEntity findBoardFile(@Param("idx") int idx, @Param("boardIdx") int boardIdx);
}
