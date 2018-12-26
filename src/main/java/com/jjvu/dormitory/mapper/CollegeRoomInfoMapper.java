package com.jjvu.dormitory.mapper;

import com.jjvu.dormitory.po.CollegeRoomInfo;

public interface CollegeRoomInfoMapper {
    int deleteByPrimaryKey(Integer crId);

    int insert(CollegeRoomInfo record);

    int insertSelective(CollegeRoomInfo record);

    CollegeRoomInfo selectByPrimaryKey(Integer crId);

    int updateByPrimaryKeySelective(CollegeRoomInfo record);

    int updateByPrimaryKey(CollegeRoomInfo record);
}