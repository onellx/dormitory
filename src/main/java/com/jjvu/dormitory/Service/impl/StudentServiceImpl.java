package com.jjvu.dormitory.Service.impl;

import java.io.File;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.jjvu.dormitory.Service.StudentService;
import com.jjvu.dormitory.exception.CustomException;
import com.jjvu.dormitory.mapper.StudentInfoMapper;
import com.jjvu.dormitory.mapper.StudentInfoMapperCustom;
import com.jjvu.dormitory.po.StudentCustom;
import com.jjvu.dormitory.po.StudentInfo;
import com.jjvu.dormitory.po.StudentQueryVo;
import com.jjvu.dormitory.util.ExcelUtil;

@Transactional
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentInfoMapper studentInfoMapper;
	@Autowired
	private StudentInfoMapperCustom studentInfoMapperCustom;
	
	@Override
	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	public List<StudentCustom> infoList(StudentQueryVo studentQueryVo) throws Exception {
		return studentInfoMapperCustom.infoList(studentQueryVo);
	}
	
	@Override
	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	public List<StudentCustom> roomNotFullList(StudentQueryVo studentQueryVo) {
		return studentInfoMapperCustom.roomNotFull(studentQueryVo);
	}

	@Override
	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	public StudentCustom findInfoById(String studentId) throws Exception {
		System.out.println("111111111111111111"+studentId);
		StudentCustom studentCustom = studentInfoMapperCustom.infoById(studentId);
		System.out.println("111111111111111111"+studentCustom.getStudentId());
		if(studentCustom == null) {
			throw new CustomException("该学生信息不存在！");
		}
		return studentCustom;
	}
	
	@Override
	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	public StudentCustom findJsonInfoByNo(String studentId) throws Exception {
		return studentInfoMapperCustom.infoByNo(studentId);
	}
	
	@Override
	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	public StudentCustom findUpdateById(String studentId) throws Exception {
		StudentInfo studentInfo = studentInfoMapper.selectByPrimaryKey(studentId);
		if(studentInfo == null) {
			throw new CustomException("该学生信息不存在！");
		}
		StudentCustom studentCustom = new StudentCustom();
		BeanUtils.copyProperties(studentInfo, studentCustom);
		return studentCustom;
	}

	@Override
	public void updateInfo(String studentId, StudentInfo studentInfo) throws Exception {
		StudentInfo student = studentInfoMapper.selectByPrimaryKey(studentId);
		if(student == null) {
			throw new CustomException("该学生信息不存在！");
		}
		studentInfo.setStudentId(studentId);
		studentInfoMapper.updateByPrimaryKeySelective(studentInfo);
	}

	@Override
	public void studentSave(File newFile) throws Exception {
		
		ExcelUtil excelUtil = new ExcelUtil();
		
		List<StudentInfo> list = excelUtil.readExcelValue(newFile);
		
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
		String nowDate = df.format(new Date());

		for (int i = 0; i < list.size(); i++) {
			
			int irn = new Random().nextInt(999-100+1)+100;
			String studentId = nowDate+irn;
			StudentInfo info = list.get(i);
			info.setStudentId(studentId);
			
			studentInfoMapper.insertSelective(info);
		}
		
	}

	@Override
	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	public void updateByPrimaryKey(String studentId)  throws Exception{
		StudentInfo studentInfo = studentInfoMapper.selectByPrimaryKey(studentId);
		if(studentInfo == null) {
			throw new CustomException("该学生信息不存在！");
		}
		studentInfo.setRoomId("");
		studentInfoMapper.updateByPrimaryKey(studentInfo);
	}

	@Override
	public List<StudentCustom> infoEmigrationList(StudentQueryVo studentQueryVo) throws Exception {
		Calendar cale = Calendar.getInstance();
		int year = cale.get(Calendar.YEAR);
		studentQueryVo.setDate(String.valueOf(year-3));
		return studentInfoMapperCustom.infoList(studentQueryVo);
	}


}
