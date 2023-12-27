package com.example.spring.myapp.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.sping.domain.TableVO;

@Component //노테이션은 이 인터페이스가 Spring의 Bean으로 등록되어 IoC(Inversion of Control) 컨테이너에서 관리될 것임을 나타냅니다.
public interface TestTableService { // Spring의 Service 역할을 하는 인터페이스로, TestTableMapper를 사용하여 비즈니스 로직을 수행
	
	// C
	public void insert(TableVO tableVO) throws Exception;
	
	// R
	public List<TableVO> selectAllList() throws Exception;
	/* TableVO selectOne(long userCode) throws Exception; */
	public TableVO selectByUserCode(int userCode) throws Exception;
	
	// U
	public int update(TableVO vo) throws Exception;
		
	// D
	public int deleteByUserCode(int userCode) throws Exception;

	public void delete(int userCode)  throws Exception;
	
}
