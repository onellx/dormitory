package com.jjvu.dormitory.mapper;

import java.util.List;

import com.jjvu.dormitory.po.ModuleClassCustom;

public interface ModuleClassInfoMapperCustom {
    
	List<ModuleClassCustom> moduleForNavInClass(Integer managerId);
	
}