package com.jjvu.dormitory.mapper;

import com.jjvu.dormitory.po.MaclassModuleInfo;

public interface MaclassModuleInfoMapper {
    int deleteByPrimaryKey(Integer mmId);

    int insert(MaclassModuleInfo record);

    int insertSelective(MaclassModuleInfo record);

    MaclassModuleInfo selectByPrimaryKey(Integer mmId);

    int updateByPrimaryKeySelective(MaclassModuleInfo record);

    int updateByPrimaryKey(MaclassModuleInfo record);
}