package com.ourkitchen.app.kitchen.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
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

	private KitchenInfoRepository kitchenInfoRepository;
	private static final int BLOCK_PATE_NUM_COUNT = 5; // 블럭에 존재하는 페이지 수
	private static final int PAGE_POST_COUNT = 9; // 한 페이지에 존재하는 게시글 수

	@Transactional
	public Long addKitchenDetail(KitchenDto kitchenDto) {
		return kitchenInfoRepository.save(kitchenDto.toEntity()).getId();
	}

	@Transactional
	public List<KitchenDto> getKitchenList(Integer pageNum) {
log.info("----------kitchenDtoList : {}", "doService.getKitchenList");
		
		Page<KitchenInfoEntity> page = kitchenInfoRepository
				.findAll(PageRequest
						.of(pageNum-1, PAGE_POST_COUNT, Sort.by(Sort.Direction.DESC, "createdDate")));
log.info("----------kitchenDtoList : {}", "doService.page");
		//List<KitchenInfoEntity> kitchens = kitchenInfoRepository.findAll();
		List<KitchenInfoEntity> kitchens = page.getContent();
		List<KitchenDto> kitchenDtoList = new ArrayList<>();

log.info("----------kitchenInfoEntity : {}", kitchens);
		for (KitchenInfoEntity kitchen : kitchens) {
			kitchenDtoList.add(this.convertEntityToDto(kitchen));
		}
		
		return kitchenDtoList;
	}

	@Transactional
	public List<KitchenDto> searchPosts(Integer pageNum, String keyword) {
		List<KitchenInfoEntity> kitchens = kitchenInfoRepository.findByNameContaining(keyword);

log.info("----------searchPosts : {}", kitchens);
		List<KitchenDto> kitchenDtoList = new ArrayList<>();
		if (kitchens.isEmpty())
			return kitchenDtoList;
		for (KitchenInfoEntity kitchen : kitchens) {
			kitchenDtoList.add(this.convertEntityToDto(kitchen));
		}

		return kitchenDtoList;
	}

	public KitchenDto convertEntityToDto(KitchenInfoEntity kitchen) {
		return KitchenDto.builder().id(kitchen.getId()).name(kitchen.getName()).address(kitchen.getAddress())
				.telNum(kitchen.getTelNum()).bizReport(kitchen.getBizReport()).lat(kitchen.getLat())
				.lng(kitchen.getLng()).capacity(kitchen.getCapacity()).pyeong(kitchen.getPyeong())
				.userId(kitchen.getUserId()).imageId(kitchen.getImageId()).build();
	}
	
	public Integer[] getPageList(Integer curPageNum) {
		Integer[] pageList = new Integer[BLOCK_PATE_NUM_COUNT];
		
		// 총 게시글 수
		Double postsTotalCount = Double.valueOf(this.getContentCount());
		
		// 촉 게시글 수를 기준으로 계산한 마지막 페이지 번호 계산
		Integer totalLastPageNum = (int)(Math.ceil((postsTotalCount/PAGE_POST_COUNT)));
		
		// 현재 페이지를 기준으로 블럭의 마지막 페이지 번호 계산
		Integer blockLastPageNum = (totalLastPageNum > curPageNum + BLOCK_PATE_NUM_COUNT)
				? curPageNum + BLOCK_PATE_NUM_COUNT
						: totalLastPageNum;
		
		// 페이지 시작 번호 조정
		curPageNum = (curPageNum<=3) ? 1: curPageNum-2;
		
		// 페이지 번호 할당
		for(int val=curPageNum, i=0;val<=blockLastPageNum;val++, i++) {
			pageList[i] = val;
		}
		
		return pageList;
	}
	
	@Transactional
	public Long getContentCount() {
		return kitchenInfoRepository.count();
	}
}