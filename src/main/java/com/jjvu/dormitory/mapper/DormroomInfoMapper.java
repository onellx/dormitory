package com.jjvu.dormitory.mapper;

import com.jjvu.dormitory.po.DormroomInfo;

public interface DormroomInfoMapper {
    int deleteByPrimaryKey(String roomId);

    int insert(DormroomInfo record);

    int insertSelective(DormroomInfo record);

    DormroomInfo selectByPrimaryKey(String roomId);

    int updateByPrimaryKeySelective(DormroomInfo record);

    int updateByPrimaryKey(DormroomInfo record);
}