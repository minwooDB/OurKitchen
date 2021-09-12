package com.ourkitchen.data.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ourkitchen.data.entity.KitchenInfoEntity;

@Repository
public interface KitchenInfoRepository extends JpaRepository<KitchenInfoEntity, Integer>{
	public List<KitchenInfoEntity> findByNameContaining(String name);
	
}