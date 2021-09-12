package com.ourkitchen.app.kitchen.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.ourkitchen.app.kitchen.dto.KitchenDetail;
import com.ourkitchen.app.kitchen.dto.KitchenDto;
import com.ourkitchen.app.kitchen.dto.KitchenListDto;
import com.ourkitchen.data.entity.KitchenInfoEntity;
import com.ourkitchen.data.entity.UserEntity;
import com.ourkitchen.data.repository.KitchenInfoRepository;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Service("kitchenService")
@AllArgsConstructor
public class KitchenService {

	@Autowired
	private KitchenInfoRepository kitchenInfoRepository;
	@Autowired
	private FileService fileService;
	private static final int BLOCK_PATE_NUM_COUNT = 5; // 블럭에 존재하는 페이지 수
	private static final int PAGE_POST_COUNT = 9; // 한 페이지에 존재하는 게시글 수

	/**
	 * 주방 등록
	 * @param user
	 * @param kitchen
	 * @param files
	 * @return
	 */
	@Transactional
	public KitchenInfoEntity addKitchenDetail(UserEntity user, KitchenDetail kitchenDetail, List<MultipartFile> files) {
		KitchenInfoEntity kitchen = kitchenDetail.toEntity();
		kitchen.setUser(user);
		kitchen = kitchenInfoRepository.save(kitchen);
log.info("----------kitchen : {}", kitchen.toString());
		fileService.addKitchenImages(kitchen, files);
		return kitchen;
	}
	
	/**
	 * 주방 리스트 조회
	 * @param pageNum
	 * @return
	 */
	@Transactional
	public List<KitchenListDto> getKitchenList(Integer pageNum) {
		Page<KitchenInfoEntity> page = kitchenInfoRepository
				.findAll(PageRequest
						.of(pageNum-1, PAGE_POST_COUNT, Sort.by(Sort.Direction.DESC, "createdDate")));
		//List<KitchenInfoEntity> kitchens = kitchenInfoRepository.findAll();
		List<KitchenInfoEntity> kitchens = page.getContent();
		List<KitchenListDto> kitchenDtoList = new ArrayList<>();
	
log.info("----------kitchenInfoEntity : {}", kitchens);
		for (KitchenInfoEntity kitchen : kitchens) {
			// SOMI 대표 이미지
			//List<FileDto> dbFileList = fileService.findAllBy
			kitchenDtoList.add(KitchenListDto.convertEntityToDto(kitchen));
		}		
		return kitchenDtoList;
	}

	/** 
	 * 주방 정보 검색
	 * @param pageNum
	 * @param keyword
	 * @return
	 */
	@Transactional
	public List<KitchenDto> searchPosts(Integer pageNum, String keyword) {
		List<KitchenInfoEntity> kitchens = kitchenInfoRepository.findByNameContaining(keyword);

log.info("----------searchPosts : {}", kitchens);
		List<KitchenDto> kitchenDtoList = new ArrayList<>();
		if (kitchens.isEmpty())
			return kitchenDtoList;
		for (KitchenInfoEntity kitchen : kitchens) {
			kitchenDtoList.add(KitchenDto.convertEntityToDto(kitchen));
		}

		return kitchenDtoList;
	}

	public KitchenDetail getPost(Integer id) {
		Optional<KitchenInfoEntity> kitchenWrapper = kitchenInfoRepository.findById(id);
		KitchenInfoEntity kitchen = kitchenWrapper.get();
		
		KitchenDetail kitchenDetail = KitchenDetail.convertEntityToDto(kitchen);
		return kitchenDetail;
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
	public Integer getContentCount() {
		return (int) kitchenInfoRepository.count();
	}
	
	@Transactional
	public List<KitchenInfoEntity> findKitchenByUser(UserEntity user){
		return kitchenInfoRepository.findByUser(user);
	}

	@Transactional
	public KitchenInfoEntity findKitchenById(Integer kitchenId) {
		KitchenInfoEntity kitchen = kitchenInfoRepository.findById(kitchenId)
				.orElseThrow(() -> new EntityNotFoundException(String.format("kitchen [%s] not found", kitchenId)));
		if(kitchen.getKitchenImages().size()>0)
			kitchen.getKitchenImages().get(0);
		
		return kitchen;
	}
}