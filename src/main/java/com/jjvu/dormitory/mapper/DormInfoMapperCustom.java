package com.jjvu.dormitory.mapper;

import java.util.List;

import com.jjvu.dormitory.po.DormCustom;
import com.jjvu.dormitory.po.DormQueryVo;

public interface DormInfoMapperCustom {
	
    List<DormCustom> queryList(DormQueryVo dormQueryVo);
    
    DormCustom findDormAndroomToCollege(DormQueryVo dormQueryVo);
    
}