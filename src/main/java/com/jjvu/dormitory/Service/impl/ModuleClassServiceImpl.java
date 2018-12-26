package com.jjvu.dormitory.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.jjvu.dormitory.Service.ModuleClassService;
import com.jjvu.dormitory.exception.CustomException;
import com.jjvu.dormitory.mapper.ModuleClassInfoMapper;
import com.jjvu.dormitory.mapper.ModuleClassInfoMapperCustom;
import com.jjvu.dormitory.po.Manager;
import com.jjvu.dormitory.po.ModuleClassCustom;
import com.jjvu.dormitory.po.ModuleClassInfo;

@Transactional
public class ModuleClassServiceImpl implements ModuleClassService {
	
	@Autowired
	private ModuleClassInfoMapper moduleClassInfoMapper;
	@Autowired
	private ModuleClassInfoMapperCustom moduleClassInfoMapperCustom;

	@Override
	public ModuleClassInfo findById(Integer moduleClassId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateInfo(Integer moduleClassId, ModuleClassInfo moduleClassInfo) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public List<ModuleClassCustom> queryList() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ModuleClassCustom> moduleForNav(Manager manager) throws Exception {
		if(manager == null) {
			throw new CustomException("非法登录");
		}
		List<ModuleClassCustom> list = moduleClassInfoMapperCustom.moduleForNavInClass(manager.getManagerId());
		return list;
	}

}
