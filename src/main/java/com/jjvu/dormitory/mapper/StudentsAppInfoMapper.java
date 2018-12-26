package com.jjvu.dormitory.mapper;

import com.jjvu.dormitory.po.StudentsAppInfoCustom;
import com.jjvu.dormitory.po.StudentsAppInfo;
import com.jjvu.dormitory.po.StudentsAppInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentsAppInfoMapper {
    int countByExample(StudentsAppInfoExample example);

    int deleteByExample(StudentsAppInfoExample example);

    int deleteByPrimaryKey(String studentsAppId);

    int insert(StudentsAppInfo record);

    int insertSelective(StudentsAppInfo record);

    List<StudentsAppInfo> selectByExample(StudentsAppInfoExample example);

    StudentsAppInfo selectByPrimaryKey(String studentsAppId);

    int updateByExampleSelective(@Param("record") StudentsAppInfo record, @Param("example") StudentsAppInfoExample example);

    int updateByExample(@Param("record") StudentsAppInfo record, @Param("example") StudentsAppInfoExample example);

    int updateByPrimaryKeySelective(StudentsAppInfo record);

    int updateByPrimaryKey(StudentsAppInfo record);
    
    StudentsAppInfoCustom selectByStudentsInfoCustom(String studentExamNum);
    
	List<StudentsAppInfoCustom> selectbyManagerId(String managerId);
	
}