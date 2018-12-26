package com.jjvu.dormitory.mapper;

import com.jjvu.dormitory.po.ProfessionInfo;

public interface ProfessionInfoMapper {
    int deleteByPrimaryKey(String professionId);

    int insert(ProfessionInfo record);

    int insertSelective(ProfessionInfo record);

    ProfessionInfo selectByPrimaryKey(String professionId);

    int updateByPrimaryKeySelective(ProfessionInfo record);

    int updateByPrimaryKey(ProfessionInfo record);
}