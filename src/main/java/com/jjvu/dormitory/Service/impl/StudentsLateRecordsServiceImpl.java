package com.jjvu.dormitory.Service.impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.transaction.annotation.Transactional;

import com.jjvu.dormitory.Service.StudentsLateRecordsService;
import com.jjvu.dormitory.mapper.StudentsLateRecordsMapper;
import com.jjvu.dormitory.po.StudentsLateRecords;
import com.jjvu.dormitory.po.StudentsLateRecordsExample;
import com.jjvu.dormitory.po.StudentsLateRecordsExample.Criteria;

@Transactional
public class StudentsLateRecordsServiceImpl implements StudentsLateRecordsService {
	@Resource
	private StudentsLateRecordsMapper studentsLateRecordsMapper;

	@Override
	public List<StudentsLateRecords> StudentLateList(String identifying) {
		// TODO Auto-generated method stub
		StudentsLateRecordsExample example=new StudentsLateRecordsExample();
		Criteria criteria=example.createCriteria();
		criteria.andStudentExamNumEqualTo(identifying).andLateRecordsStateEqualTo("1");
		example.setOrderByClause("ITEMS_RECORDS_TIME DESC LIMIT 7");
		List<StudentsLateRecords> list=studentsLateRecordsMapper.selectByExample(example);
		if(list.size()>0){
			return list;
		}
		return null;
	}

	@Override
	public boolean stParty(String identifying) {
		 StudentsLateRecords studentsLateRecords=new StudentsLateRecords();
			Date date=new Date();
	        DateFormat format=new SimpleDateFormat("yyyyMMddHHmmss");
	        String time=format.format(date);
	        int randoms=(int) (Math.random()*9000)+999;
	        studentsLateRecords.setLateRecordsId(time+randoms);
	        studentsLateRecords.setStudentExamNum(identifying);
	        studentsLateRecords.setItemsRecordsTime(time);
	        studentsLateRecords.setLateRecordsState("1");
			int i=studentsLateRecordsMapper.insert(studentsLateRecords);
			if(i!=1){
				return false;
			}
			return true;
	}


}
