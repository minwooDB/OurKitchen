package com.ourkitchen.app.kitchen.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import com.ourkitchen.enums.Role;
import com.ourkitchen.enums.StatusCode;
import lombok.AllArgsConstructor;

import com.ourkitchen.app.data.repository.AnalysisRepository;
import com.ourkitchen.app.kitchen.dto.AnalysisDto;
@Service
@AllArgsConstructor
public class AnalysisService(AnalysisRepository analysisrepository) {	
	
	@Transactional
	public List <AnalysisDto> searchPosts(String keyword) {
	List<AnalysisDto> Data = AnalysisRepository.findByTitleContaining(keyword);
	}
	
	@private
	/*
	 * public AnalysisDto getInfo(String lat, String lng) throws IOException,
	 * ParserConfigurationException, SAXException { AnalysisDto dto= new
	 * AnalysisDto(); String geturl =
	 * "http://apis.data.go.kr/B553077/api/open/sdsc/storeListInRadius?radius=500&cx="
	 * +lat+"&cy="+lng+
	 * "&ServiceKey=rkmcp%2FgXodpKhbXkhC2pTeCwKYTLjKntTfpG6zzcxCJ7kIKUIL8PTIhvJqxWTWoN34f6FaKey8bJmKg4ZGxAzA%3D%3D";
	 * 
	 * @Transactional
	 * public List<AnalysisDto> analysisPosts(String keyword)   	
	 * 
	 * 
	 * URL url = null; try { url = new URL(geturl); } catch (MalformedURLException
	 * e) { // TODO Auto-generated catch block e.printStackTrace(); } URLConnection
	 * conn = url.openConnection(); HttpURLConnection httpConnection =
	 * (HttpURLConnection) conn; InputStream is = null; InputStreamReader isr =
	 * null;
	 * 
	 * is = new URL(geturl).openStream(); isr = new InputStreamReader(is, "UTF-8");
	 * 
	 * BufferedReader rd = new BufferedReader(isr,400);
	 * 
	 * StringBuffer strbuf = new StringBuffer();
	 * 
	 * DocumentBuilderFactory docFact = DocumentBuilderFactory.newInstance();
	 * docFact.setNamespaceAware(true); DocumentBuilder docBuild =
	 * docFact.newDocumentBuilder();
	 * 
	 * Document doc = docBuild.parse(new InputSource(new
	 * StringReader(strbuf.toString())));
	 * 
	 * NodeList AnalysisInfo = doc.getElementsByTagName("item");
	 * System.out.println("파싱할 리스트 수 : "+ AnalysisInfo.getLength()); return dto;
	 * 
	 * 
	 * }
	 */
}
