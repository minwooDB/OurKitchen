package com.ourkitchen.app.kitchen.service;

import java.io.File;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.ourkitchen.app.kitchen.dto.FileDto;
import com.ourkitchen.data.entity.KitchenImageEntity;
import com.ourkitchen.data.repository.KitchenImageRepository;
import com.ourkitchen.utils.MD5Generator;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RequiredArgsConstructor
@Log4j2
@Service
public class FileService {
	private final KitchenImageRepository kitchenImageRepository;


	@Transactional
	public Long addKitchenImages(Long kitchenId, List<MultipartFile> files) {
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
				FileDto fileDto = new FileDto();
				fileDto.setOrgFileName(orgFileName);
				fileDto.setFileName(fileName);
				fileDto.setFilePath(filePath);
				fileDto.setKitchenId(kitchenId);
				Long imageId = kitchenImageRepository.save(fileDto.toEntity()).getId();
log.info("----------file Dto : {}", imageId.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return kitchenId;

	}

	@Transactional
	public Long saveFile(FileDto fileDto) {
		return kitchenImageRepository.save(fileDto.toEntity()).getId();
	}

	@Transactional
	public FileDto getFile(Long id) {
		KitchenImageEntity kitchenImage = kitchenImageRepository.findById(id).get();

		FileDto fileDto = FileDto.builder().id(id).orgFileName(kitchenImage.getOrgFileName())
				.fileName(kitchenImage.getFileName()).filePath(kitchenImage.getFilePath()).build();
		return fileDto;
	}
}