package com.example.spring.myapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sping.domain.TableVO;
import com.example.spring.myapp.model.mapper.TestTableMapper;

import lombok.RequiredArgsConstructor;

//DB에 접근하여 데이터를 조회하거나 조작하는 기능을 전담하는 객체
//DataBase에 접근하기 위한 로직 & 비지니스 로직을 분리하기 위해 사용한다.
@Service
@RequiredArgsConstructor
public class TestTableServiceImpl implements TestTableService { 
	@Autowired
	TestTableMapper testTableMapper;

	@Override
	public void insert(TableVO tableVO) throws Exception {
		testTableMapper.insert(tableVO);
	}

	@Override
	public List<TableVO> selectAllList() throws Exception {
		return testTableMapper.selectAllList();
	}

	@Override
	public TableVO selectByUserCode(int userCode) throws Exception {
		return testTableMapper.selectByUserCode();
	}

	@Override
	public int update(TableVO vo) throws Exception {
		return testTableMapper.update(vo);
	}

	@Override
	public int deleteByUserCode(int userCode) throws Exception {
		return testTableMapper.deleteByUserCode(userCode);
	}

	@Override
	public void delete(int userCode) throws Exception {
		testTableMapper.deleteByUserCode(userCode);
		
	}

}
