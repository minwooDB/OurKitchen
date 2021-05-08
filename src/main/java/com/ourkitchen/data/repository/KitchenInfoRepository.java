package com.ourkitchen.data.repository;

import org.springframework.stereotype.Repository;

import com.ourkitchen.data.entity.KitchenInfoEntity;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface KitchenInfoRepository extends JpaRepository<KitchenInfoEntity, Long>{

}
