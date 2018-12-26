package com.jjvu.dormitory.mapper;

import java.util.List;

import com.jjvu.dormitory.po.Manager;
import com.jjvu.dormitory.po.ManagerCustom;
import com.jjvu.dormitory.po.ManagerQueryVo;

public interface ManagerMapperCustom {
	
	List<ManagerCustom> queryList(ManagerQueryVo managerQueryVo);
	
	Manager login(Manager manager);
	
	ManagerCustom dormitoryManagerInfo(Integer managerId);
	
	ManagerCustom findInfoById(Integer managerId);
	
}