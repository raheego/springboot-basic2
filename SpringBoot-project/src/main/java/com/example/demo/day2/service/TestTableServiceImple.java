package com.example.demo.day2.service;

import com.example.demo.day2.domain.TableVo;
import com.example.demo.day2.mapper.TestTableMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//DB에 접근하여 데이터를 조회핟거나 조작하는 기능 전담하는 객체
//DataBase에 접근하기 위한 로직& 비지니스 로직을 분리하기 위해 사용한다.

@Service
@RequiredArgsConstructor
public class TestTableServiceImple implements TestTableService{
    @Autowired
    TestTableMapper testTablemapper;
    @Override
    public void insert(TableVo tableVo) throws Exception {
        testTablemapper.insert(tableVo);

    }

    @Override
    public List<TableVo> selectAllList() throws Exception {
        return testTablemapper.selectAllList();
    }

    @Override
    public int update(TableVo tableVo) throws Exception {

        return testTablemapper.update(tableVo);
    }

    @Override
    public int deleteByUserCode(int userCode) throws Exception {

        return testTablemapper.deleteByUserCode(userCode);
    }

    public TableVo selectByUserCode() throws Exception{
        return testTablemapper.selectByUserCode();
    }
}