package com.jjvu.dormitory.mapper;

import com.jjvu.dormitory.po.BackSchoolRecords;
import com.jjvu.dormitory.po.BackSchoolRecordsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BackSchoolRecordsMapper {
    int countByExample(BackSchoolRecordsExample example);

    int deleteByExample(BackSchoolRecordsExample example);

    int deleteByPrimaryKey(String backRecodesId);

    int insert(BackSchoolRecords record);

    int insertSelective(BackSchoolRecords record);

    List<BackSchoolRecords> selectByExample(BackSchoolRecordsExample example);

    BackSchoolRecords selectByPrimaryKey(String backRecodesId);

    int updateByExampleSelective(@Param("record") BackSchoolRecords record, @Param("example") BackSchoolRecordsExample example);

    int updateByExample(@Param("record") BackSchoolRecords record, @Param("example") BackSchoolRecordsExample example);

    int updateByPrimaryKeySelective(BackSchoolRecords record);

    int updateByPrimaryKey(BackSchoolRecords record);
}