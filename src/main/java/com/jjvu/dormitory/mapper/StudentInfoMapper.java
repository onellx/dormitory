package com.jjvu.dormitory.mapper;

import com.jjvu.dormitory.po.StudentInfo;

public interface StudentInfoMapper {
    int deleteByPrimaryKey(String studentId);

    int insert(StudentInfo record);

    int insertSelective(StudentInfo record);

    StudentInfo selectByPrimaryKey(String studentId);

    int updateByPrimaryKeySelective(StudentInfo record);

    int updateByPrimaryKey(StudentInfo record);


}