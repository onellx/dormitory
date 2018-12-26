package com.jjvu.dormitory.Service.impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.transaction.annotation.Transactional;

import com.jjvu.dormitory.Service.BackSchoolRecordsService;
import com.jjvu.dormitory.mapper.BackSchoolRecordsMapper;
import com.jjvu.dormitory.po.BackSchoolRecords;
import com.jjvu.dormitory.po.BackSchoolRecordsExample;
import com.jjvu.dormitory.po.BackSchoolRecordsExample.Criteria;

@Transactional
public class BackSchoolRecordsServiceImpl implements BackSchoolRecordsService {

	@Resource
	private BackSchoolRecordsMapper backSchoolRecordsMapper;
	@Override
	public BackSchoolRecords selectByExamNum(String identifying) {
		BackSchoolRecordsExample backSchoolRecordsExample=new BackSchoolRecordsExample();
		Criteria criteria=backSchoolRecordsExample.createCriteria();
		criteria.andStudentExamNumEqualTo(identifying);
		backSchoolRecordsExample.setOrderByClause("BACK_RECODES_TIME DESC LIMIT 1");
		List<BackSchoolRecords> backSchoolRecords=backSchoolRecordsMapper.selectByExample(backSchoolRecordsExample);
		if(backSchoolRecords.size()>0){
			return backSchoolRecords.get(0);
		}
		return null;
	}
	@Override
	public boolean stBackSchooled(String identifying) {
		// TODO Auto-generated method stub
	    BackSchoolRecords backSchoolRecords=new BackSchoolRecords();
		Date date=new Date();
        DateFormat format=new SimpleDateFormat("yyyyMMddHHmmss");
        String time=format.format(date);
        int randoms=(int) (Math.random()*9000)+999;
        backSchoolRecords.setBackRecodesId(time+randoms);
        backSchoolRecords.setStudentExamNum(identifying);
        backSchoolRecords.setBackRecodesTime(time);
        backSchoolRecords.setBackRecodesState("1");
		int i=backSchoolRecordsMapper.insert(backSchoolRecords);
		if(i!=1){
			return false;
		}
		return true;
	}

}
