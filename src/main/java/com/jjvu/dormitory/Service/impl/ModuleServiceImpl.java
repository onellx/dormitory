package com.jjvu.dormitory.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.jjvu.dormitory.Service.ModuleService;
import com.jjvu.dormitory.exception.CustomException;
import com.jjvu.dormitory.mapper.ModuleInfoMapper;
import com.jjvu.dormitory.mapper.ModuleInfoMapperCustom;
import com.jjvu.dormitory.po.Manager;
import com.jjvu.dormitory.po.ModuleCustom;
import com.jjvu.dormitory.po.ModuleInfo;
import com.jjvu.dormitory.po.ModuleQueryVo;

@Transactional
public class ModuleServiceImpl implements ModuleService{
	
	@Autowired
	private ModuleInfoMapper moduleInfoMapper;
	@Autowired
	private ModuleInfoMapperCustom moduleInfoMapperCustom;

	@Override
	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	public ModuleInfo findById(Integer moduleId) throws Exception {
		ModuleInfo moduleInfo = moduleInfoMapper.selectByPrimaryKey(moduleId);
		if(moduleInfo == null) {
			throw new CustomException("该模块信息不存在！");
		}
		return moduleInfo;
	}

	@Override
	public void updateInfo(Integer moduleId, ModuleInfo moduleInfo) throws Exception {
		ModuleInfo module = moduleInfoMapper.selectByPrimaryKey(moduleId);
		if(module == null) {
			throw new CustomException("该模块信息不存在！");
		}
		moduleInfo.setModuleId(moduleId);
		moduleInfoMapper.updateByPrimaryKeySelective(moduleInfo);
	}

	@Override
	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	public List<ModuleCustom> queryList(ModuleQueryVo moduleQueryVo) throws Exception {
		return moduleInfoMapperCustom.queryList(moduleQueryVo);
	}
	
	@Override
	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	public List<ModuleCustom> findAvailable() throws Exception {
		return moduleInfoMapperCustom.findAvailable();
	}

	@Override
	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	public List<ModuleCustom> moduleForManager(Manager manager) throws Exception {
		return moduleInfoMapperCustom.moduleForManager(manager.getManagerId());
	}
	
}
