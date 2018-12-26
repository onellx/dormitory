package com.jjvu.dormitory.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.jjvu.dormitory.Service.SystemInfoService;
import com.jjvu.dormitory.exception.CustomException;
import com.jjvu.dormitory.mapper.SystemInfoMapper;
import com.jjvu.dormitory.mapper.SystemInfoMapperCustom;
import com.jjvu.dormitory.po.SystemInfo;

@Transactional
public class SystemInfoServiceImpl implements SystemInfoService {
	
	@Autowired
	private SystemInfoMapper systemInfoMapper;
	@Autowired
	private SystemInfoMapperCustom systemInfoMapperCustom;

	@Override
	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	public List<SystemInfo> queryList() throws Exception {
		return systemInfoMapperCustom.queryList();
	}

	@Override
	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	public SystemInfo findById(Integer systemId) throws Exception {
		SystemInfo systemInfo = systemInfoMapper.selectByPrimaryKey(systemId);
		if(systemInfo == null) {
			throw new CustomException("该学制信息不存在！");
		}
		return systemInfo;
	}

	@Override
	public int saveSystemInfo(SystemInfo systemInfo) throws Exception {
		return systemInfoMapper.insertSelective(systemInfo);
	}

	@Override
	public void updateSystemInfo(Integer systemId, SystemInfo systemInfo) throws Exception {
		SystemInfo system = systemInfoMapper.selectByPrimaryKey(systemId);
		if(system == null) {
			throw new CustomException("该学制信息不存在！");
		}
		systemInfo.setSystemId(systemId);
		systemInfoMapper.updateByPrimaryKeySelective(systemInfo);
	}

}
