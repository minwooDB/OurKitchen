package com.ourkitchen.data.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ourkitchen.data.entity.KitchenImageEntity;

@Repository
public interface KitchenImageRepository extends JpaRepository<KitchenImageEntity, Integer>{
	// List<KitchenImageEntity> findByFilePath_KitchenId(Integer kitchenId);
	// KitchenImageEntity findByFilePath_ImageId(Integer imageId);
}