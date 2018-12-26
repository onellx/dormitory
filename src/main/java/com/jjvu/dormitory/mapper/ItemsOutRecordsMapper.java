package com.jjvu.dormitory.mapper;

import com.jjvu.dormitory.po.ItemsOutRecordsCustom;
import com.jjvu.dormitory.po.ItemsOutRecords;
import com.jjvu.dormitory.po.ItemsOutRecordsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItemsOutRecordsMapper {
    int countByExample(ItemsOutRecordsExample example);

    int deleteByExample(ItemsOutRecordsExample example);

    int deleteByPrimaryKey(String itemsRecordsId);

    int insert(ItemsOutRecords record);

    int insertSelective(ItemsOutRecords record);

    List<ItemsOutRecords> selectByExample(ItemsOutRecordsExample example);

    ItemsOutRecords selectByPrimaryKey(String itemsRecordsId);

    int updateByExampleSelective(@Param("record") ItemsOutRecords record, @Param("example") ItemsOutRecordsExample example);

    int updateByExample(@Param("record") ItemsOutRecords record, @Param("example") ItemsOutRecordsExample example);

    int updateByPrimaryKeySelective(ItemsOutRecords record);

    int updateByPrimaryKey(ItemsOutRecords record);
    
    List<ItemsOutRecordsCustom> itemsOutList(String identifying);
}