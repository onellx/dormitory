package com.jjvu.dormitory.mapper;

import java.util.List;

import com.jjvu.dormitory.po.CollegeCustom;

public interface CollegeInfoMapperCustom {
	List<CollegeCustom> queryList() throws Exception;
}