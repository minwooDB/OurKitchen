package com.ourkitchen.app.data.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ourkitchen.app.data.entity.KitchenInfoEntity;

@Repository
public interface KitchenInfoRepository extends JpaRepository<KitchenInfoEntity, Long>{
	public List<KitchenInfoEntity> findByNameContaining(String name);
}
