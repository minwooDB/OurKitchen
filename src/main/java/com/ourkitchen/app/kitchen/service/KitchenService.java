package com.ourkitchen.app.kitchen.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ourkitchen.app.data.entity.KitchenInfoEntity;
import com.ourkitchen.app.data.repository.KitchenInfoRepository;
import com.ourkitchen.app.kitchen.dto.KitchenDto;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Service("kitchenService")
@AllArgsConstructor
public class KitchenService {

	private KitchenInfoRepository kitchenInfoRepo;
	
	@Transactional
	public Long addKitchenDetail(KitchenDto kitchenDto) {
		return kitchenInfoRepo.save(kitchenDto.toEntity()).getId();
	}
	
	/*
	 * @Transactional public List<KitchenDto> getKitchenList(){
	 * List<KitchenInfoEntity> kitchens = kitchenInfoRepository.findAll();
	 * List<KitchenDto> kitchenDtoList = new ArrayList<>();
	 * 
	 * for(KitchenInfoEntity kitchen : kitchens) { KitchenDto kitchenDto =
	 * KitchenDto.builder() .id(kitchen.getId()) .name(kitchen.getName())
	 * .address(kitchen.getAddress()) .tel(kitchen.getTel())
	 * .biz_report(kitchen.getBiz_report()) .lat(kitchen.getLat())
	 * .lng(kitchen.getLng()) .capacity(kitchen.getCapacity())
	 * .ac(kitchen.getCapacity()) .user_id(kitchen.getUser_id()) .build();
	 * kitchenDtoList.add(kitchenDto); } return kitchenDtoList; }
	 */
}
