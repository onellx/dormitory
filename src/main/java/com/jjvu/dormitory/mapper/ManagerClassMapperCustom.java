package com.jjvu.dormitory.mapper;

import java.util.List;

import com.jjvu.dormitory.po.ManagerClass;
import com.jjvu.dormitory.po.ManagerClassCustom;

public interface ManagerClassMapperCustom {
	
	List<ManagerClass> queryList();
	
	List<ManagerClassCustom> findClassModule();
	
}