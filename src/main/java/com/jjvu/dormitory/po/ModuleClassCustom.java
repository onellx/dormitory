package com.jjvu.dormitory.po;

import java.util.List;

public class ModuleClassCustom extends ModuleClassInfo{
	
	private List<ModuleInfo> moduleList;

	public List<ModuleInfo> getModuleList() {
		return moduleList;
	}

	public void setModuleList(List<ModuleInfo> moduleList) {
		this.moduleList = moduleList;
	}

}
