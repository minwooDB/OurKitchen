package com.ourkitchen.app.kitchen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

import com.ourkitchen.app.kitchen.service.FileService;

public class FileController {
	@Autowired
	private FileService fileService;
	
	
}
