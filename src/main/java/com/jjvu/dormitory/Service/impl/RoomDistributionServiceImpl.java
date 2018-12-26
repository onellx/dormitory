package com.jjvu.dormitory.Service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.jjvu.dormitory.Service.RoomDistributionService;
import com.jjvu.dormitory.exception.CustomException;
import com.jjvu.dormitory.mapper.CollegeRoomInfoMapper;
import com.jjvu.dormitory.mapper.DormroomInfoMapper;
import com.jjvu.dormitory.mapper.DormroomInfoMapperCustom;
import com.jjvu.dormitory.mapper.StudentInfoMapper;
import com.jjvu.dormitory.po.CollegeRoomInfo;
import com.jjvu.dormitory.po.DormroomInfo;
import com.jjvu.dormitory.po.StudentInfo;

@Transactional
public class RoomDistributionServiceImpl implements RoomDistributionService {
	
	@Autowired
	private CollegeRoomInfoMapper collegeRoomInfoMapper;
	@Autowired
	private StudentInfoMapper studentInfoMapper;
	@Autowired
	private DormroomInfoMapper dormroomInfoMapper;
	@Autowired
	private DormroomInfoMapperCustom dormroomInfoMapperCustom;

	@Override
	public void roomToCollege(String[] roomIds, String collegeId) throws Exception {
		for (int i = 0; i < roomIds.length; i++) {
			CollegeRoomInfo collegeRoomInfo = new CollegeRoomInfo();
			collegeRoomInfo.setCollegeId(collegeId);
			collegeRoomInfo.setRoomId(roomIds[i]);
			collegeRoomInfoMapper.insertSelective(collegeRoomInfo);
		}
	}

	@Override
	public void studntToRoom(String[] studentIds, String roomId) throws Exception {
		for (int i = 0; i < studentIds.length; i++) {
			DormroomInfo dormroomInfo = dormroomInfoMapper.selectByPrimaryKey(roomId);
			if(dormroomInfo.getRoomAssignbeds()
					< dormroomInfo.getRoomBeds()) {
				
				StudentInfo studentInfo = new StudentInfo();
				studentInfo.setStudentId(studentIds[i]);
				studentInfo.setRoomId(roomId);
				studentInfoMapper.
					updateByPrimaryKeySelective(studentInfo);
				
				dormroomInfoMapperCustom.assignbedsPlus(roomId);
				
			} else {
				throw new CustomException("该房间人数已满！");
			}
		}
	}

	@Override
	public void roomChangeOne(String studentId, String roomId) throws Exception {
		
		StudentInfo studentInfo = studentInfoMapper.selectByPrimaryKey(studentId);
		
		if(studentInfo == null) {
			throw new CustomException("该学生不存在！");
		}
		
		DormroomInfo dormroomInfo = dormroomInfoMapper.selectByPrimaryKey(roomId);
		
		if(dormroomInfo == null) {
			throw new CustomException("该房间不存在！");
		}
		
		if(dormroomInfo.getRoomAssignbeds()
				>= dormroomInfo.getRoomBeds()) {
			throw new CustomException("该房间已满！");
		}
		
		String rawRoomId = studentInfo.getRoomId();
		
		studentInfo.setStudentId(studentId);
		studentInfo.setRoomId(roomId);
		
		studentInfoMapper.updateByPrimaryKeySelective(studentInfo);
		
		//原房间分配床位数减一
		dormroomInfoMapperCustom.assignbedsLess(rawRoomId);
		//新房间分配床位数加一
		dormroomInfoMapperCustom.assignbedsPlus(roomId);
		
	}

	@Override
	public void roomExChange(String[] studentIds) throws Exception {
		
		if(studentIds.length > 2) {
			throw new CustomException("不可选择两个以上的学生互换寝室！");
		}
		
		StudentInfo info1 = studentInfoMapper.selectByPrimaryKey(studentIds[0]);
		StudentInfo info2 = studentInfoMapper.selectByPrimaryKey(studentIds[1]);

		if(info1 == null || info2 == null) {
			throw new CustomException("有一个学生不存在数据库中！");
		}
		
		String roomIdTemp;
		
		roomIdTemp = info1.getRoomId();
		info1.setRoomId(info2.getRoomId());
		info2.setRoomId(roomIdTemp);
		
		studentInfoMapper.updateByPrimaryKeySelective(info1);
		studentInfoMapper.updateByPrimaryKeySelective(info2);
		
	}
	
}
