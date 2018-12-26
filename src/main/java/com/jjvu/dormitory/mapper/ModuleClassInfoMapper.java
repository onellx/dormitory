package com.jjvu.dormitory.mapper;

import com.jjvu.dormitory.po.ModuleClassInfo;

public interface ModuleClassInfoMapper {
    int deleteByPrimaryKey(Integer moduleClassId);

    int insert(ModuleClassInfo record);

    int insertSelective(ModuleClassInfo record);

    ModuleClassInfo selectByPrimaryKey(Integer moduleClassId);

    int updateByPrimaryKeySelective(ModuleClassInfo record);

    int updateByPrimaryKey(ModuleClassInfo record);
}