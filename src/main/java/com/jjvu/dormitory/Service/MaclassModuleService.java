package com.jjvu.dormitory.Service;

import java.util.List;

import com.jjvu.dormitory.po.MaclassModuleCustom;
import com.jjvu.dormitory.po.MaclassModuleInfo;

public interface MaclassModuleService {
	
	List<MaclassModuleCustom> findMaclassModule(Integer managerClassId) throws Exception;
	
	Integer deleteRelation(Integer mmId) throws Exception;
	
	void insertRelation(MaclassModuleInfo maclassModuleInfo) throws Exception;

}
