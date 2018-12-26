package com.jjvu.dormitory.Service;

import com.jjvu.dormitory.po.BackSchoolRecords;

public interface BackSchoolRecordsService {
	//根据高考号查一条最近的记录
	BackSchoolRecords selectByExamNum(String identifying);
	//添加返校记录
	boolean stBackSchooled(String identifying);
}
