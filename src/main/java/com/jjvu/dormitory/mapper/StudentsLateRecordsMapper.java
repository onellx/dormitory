package com.jjvu.dormitory.mapper;

import com.jjvu.dormitory.po.StudentsLateRecords;
import com.jjvu.dormitory.po.StudentsLateRecordsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentsLateRecordsMapper {
    int countByExample(StudentsLateRecordsExample example);

    int deleteByExample(StudentsLateRecordsExample example);

    int deleteByPrimaryKey(String lateRecordsId);

    int insert(StudentsLateRecords record);

    int insertSelective(StudentsLateRecords record);

    List<StudentsLateRecords> selectByExample(StudentsLateRecordsExample example);

    StudentsLateRecords selectByPrimaryKey(String lateRecordsId);

    int updateByExampleSelective(@Param("record") StudentsLateRecords record, @Param("example") StudentsLateRecordsExample example);

    int updateByExample(@Param("record") StudentsLateRecords record, @Param("example") StudentsLateRecordsExample example);

    int updateByPrimaryKeySelective(StudentsLateRecords record);

    int updateByPrimaryKey(StudentsLateRecords record);
}