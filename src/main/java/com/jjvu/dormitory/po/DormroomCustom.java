package com.jjvu.dormitory.po;

import java.util.List;

public class DormroomCustom extends DormroomInfo {
	
	private List<CollegeInfo> collegeList;
	
	private DormInfo dorm;
	
	private List<StudentInfo> studentList;
	
	public List<CollegeInfo> getCollegeList() {
		return collegeList;
	}

	public void setCollegeList(List<CollegeInfo> collegeList) {
		this.collegeList = collegeList;
	}

	public DormInfo getDorm() {
		return dorm;
	}

	public void setDorm(DormInfo dorm) {
		this.dorm = dorm;
	}

	public List<StudentInfo> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<StudentInfo> studentList) {
		this.studentList = studentList;
	}

}
