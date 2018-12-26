package com.jjvu.dormitory.Service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.jjvu.dormitory.po.StudentsAppInfo;
import com.jjvu.dormitory.po.StudentsAppInfoCustom;


public interface StudentsAppInfoService {
	StudentsAppInfo Login(String Account,String Passwd);
	StudentsAppInfoCustom StAppInfoCustom(String App_ID);
	boolean stAppInfoUpdate(StudentsAppInfo studentsAppInfo, String identifying,String basePath,MultipartFile file);
	StudentsAppInfo stAppcheckPhone(String identifying);
	int stLeavSchoolAndItemsOk(String identifying);
	//学生集合
	List<StudentsAppInfoCustom> adminStudents(String identifying);
	boolean stCheckPasswd(String identifying, String passwd);
}