package com.encore.kakaosearch.kakao.dto;

import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SearchLocalReq {
	private String query = "";
	
	private String analyze_type = "similar";
	
	private Integer page = 1;
	
	private Integer size = 1;
	
	public MultiValueMap<String, String> toMultiValueMap(){
		
		var map = new LinkedMultiValueMap<String, String>();
		
		map.add("query", query);
		map.add("analyze_type", analyze_type);
		map.add("page", String.valueOf(page));
		map.add("size", String.valueOf(size));
		
		return map;
	}
}
