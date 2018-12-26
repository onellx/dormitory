package com.jjvu.dormitory.po;

public class DormroomQueryVo {

	private DormroomInfo dormroomInfo;
	
	private DormroomCustom dormroomCustom;
	
	private Manager manager;

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	public DormroomInfo getDormroomInfo() {
		return dormroomInfo;
	}

	public void setDormroomInfo(DormroomInfo dormroomInfo) {
		this.dormroomInfo = dormroomInfo;
	}

	public DormroomCustom getDormroomCustom() {
		return dormroomCustom;
	}

	public void setDormroomCustom(DormroomCustom dormroomCustom) {
		this.dormroomCustom = dormroomCustom;
	}
	
}
