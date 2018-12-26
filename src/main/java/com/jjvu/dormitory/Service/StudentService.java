package com.jjvu.dormitory.Service;

import java.io.File;
import java.util.List;

import com.jjvu.dormitory.po.StudentCustom;
import com.jjvu.dormitory.po.StudentInfo;
import com.jjvu.dormitory.po.StudentQueryVo;

public interface StudentService {
	
	List<StudentCustom> infoList(StudentQueryVo studentQueryVo) throws Exception;
	
	StudentCustom findInfoById(String studentId) throws Exception;
	
	StudentCustom findUpdateById(String studentId) throws Exception;
	
	void updateInfo(String studentId, StudentInfo studentInfo) throws Exception;
	
	StudentCustom findJsonInfoByNo(String studentId) throws Exception;

	List<StudentCustom> roomNotFullList(StudentQueryVo studentQueryVo) throws Exception;

	void studentSave(File newFile) throws Exception;

	void updateByPrimaryKey(String studentId) throws Exception;

	/**
	 * 查询毕业生住房情况
	 * @param studentQueryVo
	 * @return
	 * @throws Exception
	 */
	List<StudentCustom> infoEmigrationList(StudentQueryVo studentQueryVo) throws Exception;
	
}
