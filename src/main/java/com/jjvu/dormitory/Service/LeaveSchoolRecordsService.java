package com.jjvu.dormitory.Service;

import java.util.List;

import com.jjvu.dormitory.po.LeaveSchoolRecords;


public interface LeaveSchoolRecordsService {

	List<LeaveSchoolRecords> LeaveSchoolList(String identifying);

	boolean stLeavechooled(String identifying);
}