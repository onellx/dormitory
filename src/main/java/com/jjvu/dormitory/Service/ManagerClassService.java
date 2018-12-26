package com.jjvu.dormitory.Service;

import java.util.List;

import com.jjvu.dormitory.po.ManagerClass;
import com.jjvu.dormitory.po.ManagerClassCustom;

public interface ManagerClassService {
	
	ManagerClass findById(Integer managerClassId) throws Exception;
	
	ManagerClassCustom findClassInfo(Integer managerClassId) throws Exception;
	
	int saveManager(ManagerClass managerClass) throws Exception;
	
	void updateInfo(Integer managerClassId, ManagerClass managerClass) throws Exception;

	List<ManagerClass> queryList() throws Exception;
	
	List<ManagerClassCustom> findManagerClassModule() throws Exception;
	
}
