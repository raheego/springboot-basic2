package com.encore.kakaosearch.kakao.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SearchLocalRes {
	private Meta meta;
    private List<SearchLocalItem> documents;
	
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Meta {
    	private Integer total_count;
        private Integer pageable_count;
        private Boolean is_end;
    }
	
	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	public static class SearchLocalItem {
		private String address_name; //전체 지번 주소 또는 전체 도로명 주소
		private String x;
		private String y;
	}
}
