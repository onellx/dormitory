package com.jjvu.dormitory.mapper;

import java.util.List;

import com.jjvu.dormitory.po.StudentCustom;
import com.jjvu.dormitory.po.StudentInfo;
import com.jjvu.dormitory.po.StudentQueryVo;

public interface StudentInfoMapperCustom {
    
	List<StudentCustom> infoList(StudentQueryVo studentQueryVo);
	
	List<StudentCustom> roomNotFull(StudentQueryVo studentQueryVo);
	
	StudentCustom infoById(String studentId);
	
	StudentCustom infoByNo(String studentNo);
	
	void studentToRoom(StudentInfo studentInfo);
	
}