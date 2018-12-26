package com.jjvu.dormitory.po;

public class StudentCustom extends StudentInfo{
	
	private CollegeInfo collegeInfo;
	
	private ProfessionInfo professionInfo;
	
	private SystemInfo systemInfo;
	
	private DormInfo dormInfo;
	
	private DormroomInfo dormroomInfo;

	public CollegeInfo getCollegeInfo() {
		return collegeInfo;
	}

	public void setCollegeInfo(CollegeInfo collegeInfo) {
		this.collegeInfo = collegeInfo;
	}

	public ProfessionInfo getProfessionInfo() {
		return professionInfo;
	}

	public void setProfessionInfo(ProfessionInfo professionInfo) {
		this.professionInfo = professionInfo;
	}

	public SystemInfo getSystemInfo() {
		return systemInfo;
	}

	public void setSystemInfo(SystemInfo systemInfo) {
		this.systemInfo = systemInfo;
	}

	public DormInfo getDormInfo() {
		return dormInfo;
	}

	public void setDormInfo(DormInfo dormInfo) {
		this.dormInfo = dormInfo;
	}

	public DormroomInfo getDormroomInfo() {
		return dormroomInfo;
	}

	public void setDormroomInfo(DormroomInfo dormroomInfo) {
		this.dormroomInfo = dormroomInfo;
	}

	

}
