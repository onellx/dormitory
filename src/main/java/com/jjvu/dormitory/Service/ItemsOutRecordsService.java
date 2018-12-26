package com.jjvu.dormitory.Service;

import java.util.List;

import com.jjvu.dormitory.po.ItemsOutRecords;
import com.jjvu.dormitory.po.ItemsOutRecordsCustom;


public interface ItemsOutRecordsService {

	List<ItemsOutRecordsCustom> ItemsOutList(String identifying);

	String itemAway(String identifying, String stId);

	ItemsOutRecords itemOutRecordState(String identifying);

	String updateItemsRecordState(String identifying,String state);
}