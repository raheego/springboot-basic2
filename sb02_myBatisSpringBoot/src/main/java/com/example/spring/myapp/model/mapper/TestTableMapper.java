
package com.example.spring.myapp.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.sping.domain.TableVO;


@Mapper //어노테이션은 이 인터페이스가 MyBatis의 Mapper로 사용될 것임을 나타냅니다.
public interface TestTableMapper { //mybatis의 mapper 역할
	
	// C
	public void insert(TableVO tableVO) throws Exception;
	
	// R
	public List<TableVO> selectAllList() throws Exception;
	public TableVO selectByUserCode() throws Exception;
	
	// U
	public int update(TableVO vo) throws Exception;
	
	// D
	public int deleteByUserCode(int UserCode) throws Exception;
	
}
