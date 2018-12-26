package com.jjvu.dormitory.mapper;

import java.util.List;

import com.jjvu.dormitory.po.DormInfo;

public interface DormInfoMapper {
    int deleteByPrimaryKey(String dormId);

    int insert(DormInfo record);

    int insertSelective(DormInfo record);

    DormInfo selectByPrimaryKey(String dormId);
    
    List<DormInfo> selectAll();

    int updateByPrimaryKeySelective(DormInfo record);

    int updateByPrimaryKey(DormInfo record);
}