package com.jjvu.dormitory.mapper;

import com.jjvu.dormitory.po.SystemInfo;

public interface SystemInfoMapper {
    int deleteByPrimaryKey(Integer systemId);

    int insert(SystemInfo record);

    int insertSelective(SystemInfo record);

    SystemInfo selectByPrimaryKey(Integer systemId);

    int updateByPrimaryKeySelective(SystemInfo record);

    int updateByPrimaryKey(SystemInfo record);
}