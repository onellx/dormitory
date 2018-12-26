package com.jjvu.dormitory.po;

public class DormQueryVo {
	
	private DormInfo dormInfo;
	
	private DormCustom dormCustom;
	
	private DormroomInfo dormroomInfo;

	public DormroomInfo getDormroomInfo() {
		return dormroomInfo;
	}

	public void setDormroomInfo(DormroomInfo dormroomInfo) {
		this.dormroomInfo = dormroomInfo;
	}

	public DormCustom getDormCustom() {
		return dormCustom;
	}

	public void setDormCustom(DormCustom dormCustom) {
		this.dormCustom = dormCustom;
	}

	public DormInfo getDormInfo() {
		return dormInfo;
	}

	public void setDormInfo(DormInfo dormInfo) {
		this.dormInfo = dormInfo;
	}

}
