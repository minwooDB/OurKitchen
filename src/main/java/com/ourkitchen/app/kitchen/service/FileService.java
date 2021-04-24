package com.ourkitchen.app.kitchen.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ourkitchen.app.data.entity.KitchenImageEntity;
import com.ourkitchen.app.data.repository.KitchenImageRepository;
import com.ourkitchen.app.kitchen.dto.FileDto;

@Service
public class FileService {
	private KitchenImageRepository kitchenImageRepository;

    public FileService(KitchenImageRepository kitchenImageRepository) {
        this.kitchenImageRepository = kitchenImageRepository;
    }

    @Transactional
    public Long saveFile(FileDto fileDto) {
        return kitchenImageRepository.save(fileDto.toEntity()).getId();
    }

    @Transactional
    public FileDto getFile(Long id) {
        KitchenImageEntity kitchenImageEntity = KitchenImageEntity.findById(id).get();

        FileDto fileDto = FileDto.builder()
                .id(id)
                .orgName(kitchenImageEntity.getOrgName())
                .fileName(kitchenImageEntity.getFileName())
                .filePath(kitchenImageEntity.getFilePath())
                .build();
        return fileDto;
    }
}