package com.jjvu.dormitory.Service;


import java.util.List;

import com.jjvu.dormitory.po.StudentsLateRecords;


public interface StudentsLateRecordsService {
	List<StudentsLateRecords >StudentLateList(String identifying);

	boolean stParty(String identifying);
    
}