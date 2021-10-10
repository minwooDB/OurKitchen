package com.ourkitchen.data.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ourkitchen.data.entity.KitchenImageEntity;
import com.ourkitchen.data.entity.KitchenInfoEntity;

@Repository
public interface KitchenImageRepository extends JpaRepository<KitchenImageEntity, Integer>{

	List<KitchenImageEntity> findAllByKitchenInfo(KitchenInfoEntity kitchen);
	
}
