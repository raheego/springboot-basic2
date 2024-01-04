package com.encore.kakaosearch.kakao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.encore.kakaosearch.kakao.dto.SearchLocalReq;

@SpringBootTest
public class KakaoClientTest {
	@Autowired
	private KakaoClient kakaoClient;
	
	@Test
	public void searchLocalTest() {
		System.out.println("테스트1");
		
		var search = new SearchLocalReq();
		search.setQuery("전북 익산시 부송동 100");
		
		var result = kakaoClient.searchLocalRes(search);
		System.out.println(result);
	}
}
