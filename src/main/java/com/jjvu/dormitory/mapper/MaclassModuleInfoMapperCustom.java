package com.jjvu.dormitory.mapper;

import java.util.List;

import com.jjvu.dormitory.po.MaclassModuleCustom;

public interface MaclassModuleInfoMapperCustom {
	
	List<MaclassModuleCustom> findMaclassModuleByMid(Integer managerClassId);
    
}