package com.jjvu.dormitory.mapper;

import java.util.List;

import com.jjvu.dormitory.po.ModuleCustom;
import com.jjvu.dormitory.po.ModuleQueryVo;

public interface ModuleInfoMapperCustom {
	
    List<ModuleCustom> queryList(ModuleQueryVo moduleQueryVo);
    
    List<ModuleCustom> findAvailable();
    
    List<ModuleCustom> moduleForManager(Integer managerId);
    
}