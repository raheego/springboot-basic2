package com.encore.kakaosearch.kakao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.encore.kakaosearch.kakao.dto.SearchLocalReq;
import com.encore.kakaosearch.kakao.dto.SearchLocalRes;

@Component
public class KakaoClient {
	
	@Value("${kakao.api.key}")
	private String kakaoApiKey;
	
	@Value("${kakao.url.search.local}")
	private String kakaoLocalSearchUrl;
	
	public SearchLocalRes searchLocalRes(SearchLocalReq searchLocalReq) {
		String kakaoAuthorization = "KakaoAK " + kakaoApiKey;
		
		var uri = UriComponentsBuilder.fromUriString(kakaoLocalSearchUrl).queryParams(searchLocalReq.toMultiValueMap())
				.build().encode().toUri();

		var headers = new HttpHeaders();
		headers.set("Authorization", kakaoAuthorization);
		headers.setContentType(MediaType.APPLICATION_JSON);

		var httpEntity = new HttpEntity<>(headers);
		var responseType = new ParameterizedTypeReference<SearchLocalRes>() {
		};

		var responseEntity = new RestTemplate().exchange(uri, HttpMethod.GET, httpEntity, responseType);

		return responseEntity.getBody();
	}
	
}
