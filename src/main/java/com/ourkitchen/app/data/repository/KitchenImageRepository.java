package com.ourkitchen.app.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ourkitchen.app.data.entity.KitchenImageEntity;

public interface KitchenImageRepository extends JpaRepository<KitchenImageEntity, Long>{
	
}
