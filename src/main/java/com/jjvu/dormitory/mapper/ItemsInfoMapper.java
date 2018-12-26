package com.jjvu.dormitory.mapper;

import com.jjvu.dormitory.po.ItemsInfo;
import com.jjvu.dormitory.po.ItemsInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItemsInfoMapper {
    int countByExample(ItemsInfoExample example);

    int deleteByExample(ItemsInfoExample example);

    int deleteByPrimaryKey(String itemsInfoId);

    int insert(ItemsInfo record);

    int insertSelective(ItemsInfo record);

    List<ItemsInfo> selectByExample(ItemsInfoExample example);

    ItemsInfo selectByPrimaryKey(String itemsInfoId);

    int updateByExampleSelective(@Param("record") ItemsInfo record, @Param("example") ItemsInfoExample example);

    int updateByExample(@Param("record") ItemsInfo record, @Param("example") ItemsInfoExample example);

    int updateByPrimaryKeySelective(ItemsInfo record);

    int updateByPrimaryKey(ItemsInfo record);
}