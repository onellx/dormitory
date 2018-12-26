package com.jjvu.dormitory.mapper;

import com.jjvu.dormitory.po.CollegeInfo;

public interface CollegeInfoMapper {
    int deleteByPrimaryKey(String collegeId);

    int insert(CollegeInfo record);

    int insertSelective(CollegeInfo record);

    CollegeInfo selectByPrimaryKey(String collegeId);

    int updateByPrimaryKeySelective(CollegeInfo record);

    int updateByPrimaryKey(CollegeInfo record);
}