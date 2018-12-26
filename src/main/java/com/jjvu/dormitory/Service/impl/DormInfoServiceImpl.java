package com.jjvu.dormitory.Service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.jjvu.dormitory.Service.DormInfoService;
import com.jjvu.dormitory.exception.CustomException;
import com.jjvu.dormitory.mapper.DormInfoMapper;
import com.jjvu.dormitory.mapper.DormInfoMapperCustom;
import com.jjvu.dormitory.po.DormCustom;
import com.jjvu.dormitory.po.DormInfo;
import com.jjvu.dormitory.po.DormQueryVo;

@Transactional
public class DormInfoServiceImpl implements DormInfoService {
	
	@Autowired
	private DormInfoMapper dormInfoMapper;
	
	@Autowired
	private DormInfoMapperCustom dormInfoMapperCustom;
	
	@Override
	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	public DormCustom findById(String dormId) throws Exception {
		
		DormInfo dormInfo = dormInfoMapper.selectByPrimaryKey(dormId);
		
		if(dormInfo == null) {
			throw new CustomException("该宿舍楼信息不存在！");
		}
		
		DormCustom dormCustom = new DormCustom();
		BeanUtils.copyProperties(dormInfo, dormCustom);
		
		return dormCustom;
	}
	
	@Override
	public boolean saveDorm(DormInfo dormInfo) throws Exception {
		
		DormInfo dorm = dormInfoMapper.selectByPrimaryKey(dormInfo.getDormId());
		
		if(dorm != null) {
			throw new CustomException("宿舍编号已存在！");
		}
		
		//床位总数和已分配床位数默认设为0
		dormInfo.setBedCount(0);
		dormInfo.setAssignCount(0);
		dormInfo.setUseCondition("否");
		
		if(dormInfoMapper.insertSelective(dormInfo) > 0) {
			return true;
		}
		return false;
	}

	@Override
	public int updateInfo(String dormId, DormCustom dormCustom) throws Exception {
		dormCustom.setDormId(dormId);
		return dormInfoMapper.updateByPrimaryKeySelective(dormCustom);
		
	}
	
	@Override
	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	public List<DormCustom> queryList(DormQueryVo dormQueryVo) throws Exception {
		return dormInfoMapperCustom.queryList(dormQueryVo);
	}

	/**
	 * 给学院分配宿舍时所需要的数据
	 */
	@Override
	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	public DormCustom findDormAndroomToCollege(DormQueryVo dormQueryVo) throws Exception {
		DormCustom dormCustom = dormInfoMapperCustom.findDormAndroomToCollege(dormQueryVo);
		if(dormCustom == null) {
			throw new CustomException("该宿舍楼不存在！");
		}
		return dormCustom;
	}

}
