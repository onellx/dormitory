package com.jjvu.dormitory.mapper;

import com.jjvu.dormitory.po.ManagerClass;

public interface ManagerClassMapper {
    int deleteByPrimaryKey(Integer managerClassId);

    int insert(ManagerClass record);

    int insertSelective(ManagerClass record);

    ManagerClass selectByPrimaryKey(Integer managerClassId);

    int updateByPrimaryKeySelective(ManagerClass record);

    int updateByPrimaryKey(ManagerClass record);
}