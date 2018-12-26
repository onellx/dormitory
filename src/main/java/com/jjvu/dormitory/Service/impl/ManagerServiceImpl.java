package com.jjvu.dormitory.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.jjvu.dormitory.Service.ManagerService;
import com.jjvu.dormitory.exception.CustomException;
import com.jjvu.dormitory.mapper.ManagerMapper;
import com.jjvu.dormitory.mapper.ManagerMapperCustom;
import com.jjvu.dormitory.po.Manager;
import com.jjvu.dormitory.po.ManagerCustom;
import com.jjvu.dormitory.po.ManagerQueryVo;

@Transactional
public class ManagerServiceImpl implements ManagerService {
	
	@Autowired
	private ManagerMapper managerMapper;
	@Autowired
	private ManagerMapperCustom managerMapperCustom;
	
	@Override
	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	public Manager loginCheck(Manager manager) throws Exception {
		
		if(managerMapperCustom.login(manager) == null) {
			return null;
		}
		return managerMapperCustom.login(manager);
	}

	@Override
	public Integer saveManager(Manager manager) throws Exception {
		return managerMapper.insertSelective(manager);
	}

	@Override
	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	public ManagerCustom findById(Integer managerId) throws Exception {
		ManagerCustom managerCustom = managerMapperCustom.findInfoById(managerId);
		
		if(managerCustom == null) {
			throw new CustomException("该管理员信息不存在！");
		}
		return managerCustom;
	}

	@Override
	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	public List<ManagerCustom> QueryList(ManagerQueryVo managerQueryVo) throws Exception {
		return managerMapperCustom.queryList(managerQueryVo);
	}

	@Override
	public void updateInfo(Integer managerId, ManagerCustom managerCustom) throws Exception {
		
		managerCustom.setManagerId(managerId);
		managerMapper.updateByPrimaryKeySelective(managerCustom);
		
	}
	
	@Override
	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	public ManagerCustom dormitoryManagerInfo(Integer managerId) throws Exception{
		return managerMapperCustom.dormitoryManagerInfo(managerId);
	}

}
