package com.jjvu.dormitory.Service;

import java.util.List;

import com.jjvu.dormitory.po.DormCustom;
import com.jjvu.dormitory.po.DormInfo;
import com.jjvu.dormitory.po.DormQueryVo;

public interface DormInfoService {
	
	DormCustom findById(String dormId) throws Exception;
	
	boolean saveDorm(DormInfo dormInfo) throws Exception;
	
	int updateInfo(String dormId, DormCustom dormCustom) throws Exception;

	List<DormCustom> queryList(DormQueryVo dormQueryVo) throws Exception;
	
	DormCustom findDormAndroomToCollege(DormQueryVo dormQueryVo) throws Exception;

}
