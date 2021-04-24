package com.ourkitchen.app.kitchen.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.ourkitchen.app.kitchen.dto.FileDto;
import com.ourkitchen.app.kitchen.dto.KitchenDto;
import com.ourkitchen.app.kitchen.service.FileService;
import com.ourkitchen.app.kitchen.service.KitchenService;
import com.ourkitchen.util.MD5Generator;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@AllArgsConstructor
@Controller
public class KitchenController {

	@Autowired
	private KitchenService kitchenService;
	@Autowired
	private FileService fileService;

	@GetMapping("/kitchen")
	public String getKitchenList(Model model, @RequestParam(value = "page", defaultValue = "1") Integer pageNum) {
log.info("----------kitchenDtoList : {}", "doController");
		List<KitchenDto> kitchenDtoList = kitchenService.getKitchenList(pageNum);
		Integer[] pageList = kitchenService.getPageList(pageNum);

log.info("----------kitchenDtoList : {}", kitchenDtoList);
		model.addAttribute("kitchenList", kitchenDtoList);
		model.addAttribute("pageList", pageList);

		return "kitchen/list.html";
	}

	@GetMapping("/kitchen/write")
	public String dispKitchenWrite() {
		return "/kitchen/write";
	}

	@PostMapping("kitchen/write")
	public String addKitchenDetail(KitchenDto kitchenDto, @RequestParam("file") MultipartFile files) throws IOException {
		try {
			String orgFile = files.getOriginalFilename();
			String fileName = new MD5Generator(orgFile).toString();
			/*SOMI - 디렉토리 properties 파일에서 로딩*/
			 /* 실행되는 위치의 'files' 폴더에 파일이 저장됩니다. */
            String savePath = System.getProperty("user.dir") + "\\files";
            /* 파일이 저장되는 폴더가 없으면 폴더를 생성합니다. */
            if (!new File(savePath).exists()) {
                try{
                    new File(savePath).mkdir();
                }
                catch(Exception e){
                    e.getStackTrace();
                }
            }
            String filePath = savePath + "\\" + fileName;
            files.transferTo(new File(filePath));
            
            FileDto fileDto = new FileDto();
            fileDto.setOrgName(orgFile);
            fileDto.setFileName(fileName);
            fileDto.setFilePath(filePath);
            Long imageId = fileService.saveFile(fileDto);
            
            kitchenDto.setImageId(imageId);            
			/*SOMI - 수정*/
			kitchenDto.setUserId(1); // springSecurityUser.getId()
			kitchenDto.setLat(37.5602);
			kitchenDto.setLng(126.9847);
	
			kitchenService.addKitchenDetail(kitchenDto);
	log.info("----------kitchen Dto : {}", kitchenDto.toString());
	
			}catch(Exception e) {
				e.printStackTrace();
			}
		return "redirect:/";
	}

	@GetMapping("/kitchen/search")
	public String search(@RequestParam(value = "keyword") String keyword,@RequestParam(value= "page", defaultValue="1") Integer pageNum,  Model model) {
log.info("----------keyword : {}", keyword);
log.info("----------pageNum : {}", pageNum);
		List<KitchenDto> kitchenDtoList = kitchenService.searchPosts(pageNum,keyword);
		
		Integer[] pageList = kitchenService.getPageList(pageNum);
		
		model.addAttribute("kitchenList", kitchenDtoList);
		model.addAttribute("pageList", pageList);
		
		return "kitchen/list.html";
	}
	
}