package com.example.demo.day2.mapper;
import com.example.demo.day2.domain.TableVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface TestTableMapper {

    //c
    public void insert(TableVo tableVO) throws Exception;

    //R
    public List<TableVo> selectAllList() throws Exception;
    public TableVo selectByUserCode() throws Exception;

    //U
    public int update(TableVo tableVO) throws Exception;

    //D
    public int deleteByUserCode(int userCode) throws Exception;
}
