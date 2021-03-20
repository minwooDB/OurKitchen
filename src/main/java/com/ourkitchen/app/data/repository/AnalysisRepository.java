package com.ourkitchen.app.data.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ourkitchen.app.data.entity.AnalysisEntity;
import com.ourkitchen.app.data.entity.UserEntity;
import com.sun.xml.bind.v2.schemagen.xmlschema.List;

@Repository
public interface AnalysisRepository extends JpaRepository<AnalysisEntity, Long>{

	List<AnalysisEntity> findByrdnmContaining(String keyword);
}
