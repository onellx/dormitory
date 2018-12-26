package com.jjvu.dormitory.Service.impl;

import java.util.List;
import java.util.Random;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.jjvu.dormitory.Service.DormroomInfoService;
import com.jjvu.dormitory.exception.CustomException;
import com.jjvu.dormitory.mapper.DormInfoMapper;
import com.jjvu.dormitory.mapper.DormroomInfoMapper;
import com.jjvu.dormitory.mapper.DormroomInfoMapperCustom;
import com.jjvu.dormitory.po.DormCustom;
import com.jjvu.dormitory.po.DormInfo;
import com.jjvu.dormitory.po.DormroomCustom;
import com.jjvu.dormitory.po.DormroomInfo;
import com.jjvu.dormitory.po.DormroomQueryVo;

@Transactional
public class DormroomInfoServiceImpl implements DormroomInfoService {
	
	@Autowired
	private DormroomInfoMapper dormroomInfoMapper;
	@Autowired
	private DormInfoMapper dormInfoMapper;
	@Autowired
	private DormroomInfoMapperCustom dormroomInfoMapperCustom;

	@Override
	public void autoRoom(DormroomInfo dormroomInfo, DormCustom dormCustom) throws Exception {
		
		int roomFloor;
		String str;
		roomFloor = dormCustom.getRoomCount()/dormCustom.getFloorCount();
		
		for (int i = 1; i <= dormCustom.getFloorCount(); i++) {
			for (int j = 1; j <= roomFloor; j++) {
				str = j<10 ? ("" + i + 0 + j) : ("" + i + j);
				DormroomInfo dormroom = new DormroomInfo();
				
				/**
				 * 房间id的生成方案一
				 * 当前宿舍楼ID + 房间号 + 三位数随机数
				 */
		        int irn = new Random().nextInt(999-100+1)+100;
		        String roomId = dormroomInfo.getDormId()+str+irn;
				
				dormroom.setRoomId(roomId);
				dormroom.setRoomNum(str);
				dormroom.setDormId(dormroomInfo.getDormId());
				dormroom.setFloorNum(i);
				dormroom.setRoomBeds(dormroomInfo.getRoomBeds());
				dormroom.setRoomAssignbeds(0);
				dormroom.setRoomCharge(dormroomInfo.getRoomCharge());
				dormroom.setRoomUsecondition("1");//修改了此处，将原先的否改成了1
				dormroomInfoMapper.insertSelective(dormroom);
			}
		}
		//自动生成房间后计算宿舍楼的床位总数和已分配床位数并更新
		int bedCount = dormCustom.getRoomCount() * dormroomInfo.getRoomBeds();
		
		DormInfo dormInfo = dormInfoMapper.selectByPrimaryKey(dormroomInfo.getDormId());
		
		dormInfo.setBedCount(bedCount);
		dormInfoMapper.updateByPrimaryKeySelective(dormInfo);
		
	}
	
	@Override
	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	public List<DormroomCustom> queryList(DormroomQueryVo dormroomQueryVo) throws Exception {
		return dormroomInfoMapperCustom.queryList(dormroomQueryVo);
	}
	
	@Override
	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	public List<DormroomCustom> listNotFull(DormroomQueryVo dormroomQueryVo) throws Exception {
		List<DormroomCustom> list = dormroomInfoMapperCustom.listNotFull(dormroomQueryVo);
		return list;
	}

	@Override
	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	public DormroomCustom findById(String roomId) throws Exception {
		
		DormroomCustom dormroomCustom = dormroomInfoMapperCustom.findRoomInfo(roomId);
		if(dormroomCustom == null) {
			throw new CustomException("该宿舍房间信息不存在！");
		}
		return dormroomCustom;
	}

	@Override
	public void update(String roomId, DormroomInfo dormroomInfo) throws Exception {
		dormroomInfo.setRoomId(roomId);
		dormroomInfoMapper.updateByPrimaryKeySelective(dormroomInfo);
	}

}
