package com.jjvu.dormitory.mapper;

import com.jjvu.dormitory.po.LeaveSchoolRecords;
import com.jjvu.dormitory.po.LeaveSchoolRecordsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LeaveSchoolRecordsMapper {
    int countByExample(LeaveSchoolRecordsExample example);

    int deleteByExample(LeaveSchoolRecordsExample example);

    int deleteByPrimaryKey(String leaveRecodesId);

    int insert(LeaveSchoolRecords record);

    int insertSelective(LeaveSchoolRecords record);

    List<LeaveSchoolRecords> selectByExample(LeaveSchoolRecordsExample example);

    LeaveSchoolRecords selectByPrimaryKey(String leaveRecodesId);

    int updateByExampleSelective(@Param("record") LeaveSchoolRecords record, @Param("example") LeaveSchoolRecordsExample example);

    int updateByExample(@Param("record") LeaveSchoolRecords record, @Param("example") LeaveSchoolRecordsExample example);

    int updateByPrimaryKeySelective(LeaveSchoolRecords record);

    int updateByPrimaryKey(LeaveSchoolRecords record);
}