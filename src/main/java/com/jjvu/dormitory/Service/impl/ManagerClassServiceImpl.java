package com.jjvu.dormitory.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.jjvu.dormitory.Service.ManagerClassService;
import com.jjvu.dormitory.mapper.ManagerClassMapper;
import com.jjvu.dormitory.mapper.ManagerClassMapperCustom;
import com.jjvu.dormitory.po.ManagerClass;
import com.jjvu.dormitory.po.ManagerClassCustom;

@Transactional
public class ManagerClassServiceImpl implements ManagerClassService {
	
	@Autowired
	private ManagerClassMapper managerClassMapper;
	@Autowired
	private ManagerClassMapperCustom managerClassMapperCustom;

	@Override
	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	public ManagerClass findById(Integer managerClassId) throws Exception {
		return managerClassMapper.selectByPrimaryKey(managerClassId);
	}
	
	@Override
	public ManagerClassCustom findClassInfo(Integer managerClassId) throws Exception {
		return null;
	}

	@Override
	public int saveManager(ManagerClass managerClass) throws Exception {
		return managerClassMapper.insertSelective(managerClass);
	}

	@Override
	public void updateInfo(Integer managerClassId, ManagerClass managerClass) throws Exception {
		managerClass.setManagerClassId(managerClassId);
		managerClassMapper.updateByPrimaryKeySelective(managerClass);
	}

	@Override
	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	public List<ManagerClass> queryList() throws Exception {
		return managerClassMapperCustom.queryList();
	}
	
	/**
	 * 管理员-模块管理
	 */
	@Override
	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	public List<ManagerClassCustom> findManagerClassModule() throws Exception {
		return managerClassMapperCustom.findClassModule();
	}
	
}
