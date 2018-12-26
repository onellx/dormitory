package com.jjvu.dormitory.po;

public class ManagerQueryVo {
	
	private Manager manager;
	
	private ManagerCustom managerCustom;
	
	private ManagerClass managerClass;

	public ManagerClass getManagerClass() {
		return managerClass;
	}

	public void setManagerClass(ManagerClass managerClass) {
		this.managerClass = managerClass;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	public ManagerCustom getManagerCustom() {
		return managerCustom;
	}

	public void setManagerCustom(ManagerCustom managerCustom) {
		this.managerCustom = managerCustom;
	}

}
