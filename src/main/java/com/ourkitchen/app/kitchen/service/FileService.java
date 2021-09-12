package com.ourkitchen.app.kitchen.service;

import java.io.File;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.ourkitchen.app.kitchen.dto.FileDto;
import com.ourkitchen.data.entity.KitchenImageEntity;
import com.ourkitchen.data.entity.KitchenInfoEntity;
import com.ourkitchen.data.repository.KitchenImageRepository;
import com.ourkitchen.utils.MD5Generator;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RequiredArgsConstructor
@Log4j2
@Service("fileService")
public class FileService {
	private final KitchenImageRepository kitchenImageRepository;


	@Transactional
	public Integer addKitchenImages(KitchenInfoEntity kitchen, List<MultipartFile> files) {
		/* SOMI - 디렉토리 properties 파일에서 로딩 */
		try {/* 실행되는 위치의 'files' 폴더에 파일이 저장됩니다. */
			String savePath = "C:\\Users\\somi\\Documents\\OurKitchen\\img";
			/* 파일이 저장되는 폴더가 없으면 폴더를 생성합니다. */
			if (!new File(savePath).exists()) {
				try {
					new File(savePath).mkdir();
				} catch (Exception e) {
					e.getStackTrace();
				}
			}
			for (MultipartFile file : files) {
				String orgFileName = file.getOriginalFilename();
				String fileName = new MD5Generator(orgFileName).toString();
				String filePath = savePath + "\\" + fileName;
				file.transferTo(new File(filePath));
				
				//1
				FileDto fileDto = new FileDto();				
				fileDto.setOrgFileName(orgFileName);
				fileDto.setFileName(fileName);
				fileDto.setFilePath(filePath);
log.info("----------file Dto : {}", fileDto.toString());

				//2 filedto.toEntity()
			KitchenImageEntity kitchenImage = KitchenImageEntity.builder()
			.kitchenInfo(kitchen)
			.orgFileName(orgFileName)
			.filePath(filePath)
			.fileName(fileName)
			.build();

				//3
				Integer imageId = kitchenImageRepository.save(kitchenImage).getId();
log.info("----------imageId : {}", imageId);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return kitchen.getId();
	}

	@Transactional
	public Integer saveFile(FileDto fileDto) {
		return kitchenImageRepository.save(fileDto.toEntity()).getId();
	}
		
	/**
	 * 이미지 개별 조회
	 */
//	@Transactional(readOnly=true)
//	public FileDto findByFileId(Integer imageId) {
//		// SOMI 이미지 없는 exception
//		
//		KitchenImageEntity entity = KitchenImageRepository.findBy(imageId);
//		
//		// SOMI - filedto
//		FileDto fileDto = FileDto.builder()
//                .orgFileName(entity.getOrgFileName())
//                .filePath(entity.getFilePath())
//                .fileName(entity.getFileName())
//                .build();
//
//        return fileDto;
//	}
	
	/**
	 * 이미지 전체 조희
	 */
//	@Transactional(readOnly = true)
//    public List<FileDto> findAllByKitchen(Integer kitchenId){
//
//        List<KitchenImageEntity> kitchenImageList = kitchenImageRepository.findByFilePath_KitchenId(kitchenId);
//        // SOMI - 코드 수정
//        
//    }
}