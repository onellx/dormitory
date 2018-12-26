package com.jjvu.dormitory.Service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.jjvu.dormitory.Service.CollegeService;
import com.jjvu.dormitory.exception.CustomException;
import com.jjvu.dormitory.mapper.CollegeInfoMapper;
import com.jjvu.dormitory.mapper.CollegeInfoMapperCustom;
import com.jjvu.dormitory.po.CollegeCustom;
import com.jjvu.dormitory.po.CollegeInfo;

@Transactional
public class CollegeServiceImpl implements CollegeService {
	
	@Autowired
	private CollegeInfoMapper collegeInfoMapper;
	@Autowired
	private CollegeInfoMapperCustom collegeInfoMapperCustom;

	@Override
	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	public CollegeInfo findById(String collegeId) throws Exception {
		CollegeInfo college = collegeInfoMapper.selectByPrimaryKey(collegeId);
		if(college == null) {
			throw new CustomException("该学院信息不存在！");
		}
		return college;
	}

	@Override
	public String saveCollege(CollegeInfo collegeInfo) throws Exception {
		
		/**
		 * 生成ID规则
		 * 日期加两位数的随机数
		 */
		int irn = new Random().nextInt(90)+10;
		String collegeId = new SimpleDateFormat("MMdd").format(new Date()) + irn;
		collegeInfo.setCollegeId(collegeId);
		collegeInfoMapper.insertSelective(collegeInfo);
		return collegeId;
	}
	
	@Override
	public void updateInfo(String collegeId, CollegeInfo collegeInfo) throws Exception {
		CollegeInfo college = collegeInfoMapper.selectByPrimaryKey(collegeId);
		if(college == null) {
			throw new CustomException("该学院信息不存在！");
		}
		collegeInfo.setCollegeId(collegeId);
		collegeInfoMapper.updateByPrimaryKeySelective(collegeInfo);
	}

	@Override
	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	public List<CollegeCustom> queryList() throws Exception {
		return collegeInfoMapperCustom.queryList();
	}

}
