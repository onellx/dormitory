package com.jjvu.dormitory.Service;

import java.util.List;

import com.jjvu.dormitory.po.Manager;
import com.jjvu.dormitory.po.ManagerCustom;
import com.jjvu.dormitory.po.ManagerQueryVo;

public interface ManagerService {

	Integer saveManager(Manager manager) throws Exception;

	ManagerCustom findById(Integer managerId) throws Exception;

	List<ManagerCustom> QueryList(ManagerQueryVo managerQueryVo) throws Exception;

	void updateInfo(Integer managerId, ManagerCustom managerCustom) throws Exception;

	Manager loginCheck(Manager manager) throws Exception;
	
	ManagerCustom dormitoryManagerInfo(Integer managerId) throws Exception;

}
