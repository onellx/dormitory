package com.jjvu.dormitory.Service;

import java.util.List;

import com.jjvu.dormitory.po.SystemInfo;

public interface SystemInfoService {
	
	List<SystemInfo> queryList() throws Exception;
	
	SystemInfo findById(Integer systemId) throws Exception;
	
	int saveSystemInfo(SystemInfo systemInfo) throws Exception;
	
	void updateSystemInfo(Integer systemId, SystemInfo systemInfo) throws Exception;

}
