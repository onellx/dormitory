package com.jjvu.dormitory.Service;

import java.util.List;

import com.jjvu.dormitory.po.DormCustom;
import com.jjvu.dormitory.po.DormroomCustom;
import com.jjvu.dormitory.po.DormroomInfo;
import com.jjvu.dormitory.po.DormroomQueryVo;

public interface DormroomInfoService {

	void autoRoom(DormroomInfo dormroomInfo, DormCustom dormCustom) throws Exception;

	List<DormroomCustom> queryList(DormroomQueryVo dormroomQueryVo) throws Exception;
	
	List<DormroomCustom> listNotFull(DormroomQueryVo dormroomQueryVo) throws Exception;

	DormroomCustom findById(String roomID) throws Exception;

	void update(String roomId, DormroomInfo dormroomInfo) throws Exception;
	

}
