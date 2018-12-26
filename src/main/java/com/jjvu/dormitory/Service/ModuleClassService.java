package com.jjvu.dormitory.Service;

import java.util.List;

import com.jjvu.dormitory.po.Manager;
import com.jjvu.dormitory.po.ModuleClassCustom;
import com.jjvu.dormitory.po.ModuleClassInfo;

public interface ModuleClassService {
	
	ModuleClassInfo findById(Integer moduleClassId) throws Exception;
	
	void updateInfo(Integer moduleClassId, ModuleClassInfo moduleClassInfo) throws Exception;
	
	List<ModuleClassCustom> queryList() throws Exception;
	
	List<ModuleClassCustom> moduleForNav(Manager manager) throws Exception;

}
