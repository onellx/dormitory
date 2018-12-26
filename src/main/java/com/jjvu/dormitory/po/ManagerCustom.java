package com.jjvu.dormitory.po;

public class ManagerCustom extends Manager{
	
	private ManagerClass managerClass;
	
	private DormInfo dormInfo;

	public DormInfo getDormInfo() {
		return dormInfo;
	}

	public void setDormInfo(DormInfo dormInfo) {
		this.dormInfo = dormInfo;
	}

	public ManagerClass getManagerClass() {
		return managerClass;
	}

	public void setManagerClass(ManagerClass managerClass) {
		this.managerClass = managerClass;
	}
	
}
