package com.jjvu.dormitory.Service;

import java.util.List;

import com.jjvu.dormitory.po.CollegeCustom;
import com.jjvu.dormitory.po.CollegeInfo;

public interface CollegeService {
	
	CollegeInfo findById(String collegeId) throws Exception;
	
	String saveCollege(CollegeInfo collegeInfo) throws Exception;
	
	void updateInfo(String collegeId, CollegeInfo collegeInfo) throws Exception;
	
	List<CollegeCustom> queryList() throws Exception;

}
