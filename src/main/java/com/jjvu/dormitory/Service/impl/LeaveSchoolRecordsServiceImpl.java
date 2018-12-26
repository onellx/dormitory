package com.jjvu.dormitory.Service.impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.transaction.annotation.Transactional;

import com.jjvu.dormitory.Service.LeaveSchoolRecordsService;
import com.jjvu.dormitory.mapper.LeaveSchoolRecordsMapper;
import com.jjvu.dormitory.po.LeaveSchoolRecords;
import com.jjvu.dormitory.po.LeaveSchoolRecordsExample;
import com.jjvu.dormitory.po.LeaveSchoolRecordsExample.Criteria;

@Transactional
public class LeaveSchoolRecordsServiceImpl implements LeaveSchoolRecordsService {

	@Resource
	private LeaveSchoolRecordsMapper leaveSchoolRecordsMapper;
	@Override
	public List<LeaveSchoolRecords> LeaveSchoolList(String identifying) {
		// TODO Auto-generated method stub
		LeaveSchoolRecordsExample example=new LeaveSchoolRecordsExample();
		Criteria criteria=example.createCriteria();
		criteria.andStudentExamNumEqualTo(identifying).andLeaveRecodesStateEqualTo("1");
		example.setOrderByClause("LEAVE_RECODES_TIME DESC LIMIT 7");
		List<LeaveSchoolRecords> list=leaveSchoolRecordsMapper.selectByExample(example);	
		if(list.size()>0){
			return list;
		}
		return null;
	}
	@Override
	public boolean stLeavechooled(String identifying) {
		LeaveSchoolRecords leaveSchoolRecords=new LeaveSchoolRecords();
		Date date=new Date();
        DateFormat format=new SimpleDateFormat("yyyyMMddHHmmss");
        String time=format.format(date);
        int randoms=(int) (Math.random()*9000)+999;
        leaveSchoolRecords.setLeaveRecodesId(time+randoms);
		leaveSchoolRecords.setStudentExamNum(identifying);
		leaveSchoolRecords.setLeaveRecodesTime(time);
		leaveSchoolRecords.setLeaveRecodesState("1");
		int i=leaveSchoolRecordsMapper.insert(leaveSchoolRecords);
		if(i!=1){
			return false;
		}
		return true;
	}

	



}
