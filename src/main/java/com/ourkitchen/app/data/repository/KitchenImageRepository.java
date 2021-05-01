package com.ourkitchen.app.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ourkitchen.app.data.entity.KitchenImageEntity;

@Repository
public interface KitchenImageRepository extends JpaRepository<KitchenImageEntity, Long>{
	
}
