package com.jjvu.dormitory.Service;

import java.util.List;

import com.jjvu.dormitory.po.ProfessionCustom;
import com.jjvu.dormitory.po.ProfessionInfo;

public interface ProfessionService {
	
	ProfessionInfo findById(String professionId) throws Exception;
	
	String saveProfession(ProfessionInfo professionInfo) throws Exception;
	
	void updateInfo(String professionId, ProfessionInfo professionInfo) throws Exception;
	
	List<ProfessionCustom> queryList() throws Exception;

}
