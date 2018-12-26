package com.jjvu.dormitory.mapper;

import java.util.List;

import com.jjvu.dormitory.po.DormroomCustom;
import com.jjvu.dormitory.po.DormroomQueryVo;

public interface DormroomInfoMapperCustom {
	
	List<DormroomCustom> queryList(DormroomQueryVo dormroomQueryVo);
	
	List<DormroomCustom> listNotFull(DormroomQueryVo dormroomQueryVo);
	
	DormroomCustom findRoomInfo(String roomId);
	
	void assignbedsPlus(String roomId);
	
	void assignbedsLess(String roomId);
	
}