package com.jjvu.dormitory.Service.impl;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.jjvu.dormitory.Service.ProfessionService;
import com.jjvu.dormitory.exception.CustomException;
import com.jjvu.dormitory.mapper.ProfessionInfoMapper;
import com.jjvu.dormitory.mapper.ProfessionInfoMapperCustom;
import com.jjvu.dormitory.po.ProfessionCustom;
import com.jjvu.dormitory.po.ProfessionInfo;

@Transactional
public class ProfessionServiceImpl implements ProfessionService {
	
	@Autowired
	private ProfessionInfoMapper professionInfoMapper;
	
	@Autowired
	private ProfessionInfoMapperCustom professionInfoMapperCustom;

	@Override
	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	public ProfessionInfo findById(String professionId) throws Exception {
		ProfessionInfo profession = professionInfoMapper.selectByPrimaryKey(professionId);
		if(profession == null) {
			throw new CustomException("该专业信息不存在！");
		}
		return profession;
	}

	@Override
	public String saveProfession(ProfessionInfo professionInfo) throws Exception {
		/**
		 * ID生成规则
		 * 学院ID加四位随机数
		 */
		int irn = new Random().nextInt(9000)+1000;
		String professionId = professionInfo.getCollegeId()+irn;
		professionInfo.setProfessionId(professionId);
		professionInfoMapper.insertSelective(professionInfo);
		return professionId;
	}

	@Override
	public void updateInfo(String professionId, ProfessionInfo professionInfo) throws Exception {
		ProfessionInfo profession = professionInfoMapper.selectByPrimaryKey(professionId);
		if(profession == null) {
			throw new CustomException("该专业信息不存在！");
		}
		professionInfo.setProfessionId(professionId);
		professionInfoMapper.updateByPrimaryKeySelective(professionInfo);
	}

	@Override
	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	public List<ProfessionCustom> queryList() throws Exception {
		return professionInfoMapperCustom.queryList();
	}

}
