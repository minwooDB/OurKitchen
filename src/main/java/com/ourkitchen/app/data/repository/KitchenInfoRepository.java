package com.ourkitchen.app.data.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.ourkitchen.app.data.entity.KitchenInfoEntity;

@Repository
public interface KitchenInfoRepository extends JpaRepository<KitchenInfoEntity, Long>{

}
