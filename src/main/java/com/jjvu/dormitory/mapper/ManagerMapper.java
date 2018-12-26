package com.jjvu.dormitory.mapper;

import com.jjvu.dormitory.po.Manager;

public interface ManagerMapper {
    int deleteByPrimaryKey(Integer managerId);

    int insert(Manager record);

    int insertSelective(Manager record);

    Manager selectByPrimaryKey(Integer managerId);

    int updateByPrimaryKeySelective(Manager record);

    int updateByPrimaryKey(Manager record);
}