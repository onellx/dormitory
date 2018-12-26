package com.jjvu.dormitory.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.jjvu.dormitory.Service.MaclassModuleService;
import com.jjvu.dormitory.mapper.MaclassModuleInfoMapper;
import com.jjvu.dormitory.mapper.MaclassModuleInfoMapperCustom;
import com.jjvu.dormitory.po.MaclassModuleCustom;
import com.jjvu.dormitory.po.MaclassModuleInfo;

@Transactional
public class MaclassModuleServiceImpl implements MaclassModuleService {
	
	@Autowired
	private MaclassModuleInfoMapper maclassModuleInfoMapper;
	@Autowired
	private MaclassModuleInfoMapperCustom maclassModuleInfoMapperCustom;

	@Override
	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	public List<MaclassModuleCustom> findMaclassModule(Integer managerClassId) throws Exception {
		return maclassModuleInfoMapperCustom.findMaclassModuleByMid(managerClassId);
	}

	@Override
	public Integer deleteRelation(Integer mmId) throws Exception {
		MaclassModuleInfo maclassModuleInfo = maclassModuleInfoMapper.selectByPrimaryKey(mmId);
		maclassModuleInfoMapper.deleteByPrimaryKey(mmId);
		return maclassModuleInfo.getManagerClassId();
	}

	@Override
	public void insertRelation(MaclassModuleInfo maclassModuleInfo) throws Exception {
		maclassModuleInfoMapper.insertSelective(maclassModuleInfo);
	}

}
