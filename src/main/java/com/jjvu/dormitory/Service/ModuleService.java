package com.jjvu.dormitory.Service;

import java.util.List;

import com.jjvu.dormitory.po.Manager;
import com.jjvu.dormitory.po.ModuleCustom;
import com.jjvu.dormitory.po.ModuleInfo;
import com.jjvu.dormitory.po.ModuleQueryVo;

public interface ModuleService {
	
	ModuleInfo findById(Integer moduleId) throws Exception;
	
	void updateInfo(Integer moduleId, ModuleInfo moduleInfo) throws Exception;
	
	List<ModuleCustom> queryList(ModuleQueryVo moduleQueryVo) throws Exception;
	
	List<ModuleCustom> findAvailable() throws Exception;
	
	List<ModuleCustom> moduleForManager(Manager manager) throws Exception;

}
