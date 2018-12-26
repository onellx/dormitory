package com.jjvu.dormitory.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jjvu.dormitory.Service.ItemsOutRecordsService;
import com.jjvu.dormitory.app.json.Return;
import com.jjvu.dormitory.po.ItemsOutRecords;
import com.jjvu.dormitory.po.ItemsOutRecordsCustom;

@Controller
@RequestMapping("/app/itemsOutRecords")
public class ItemsOutRecordsController {

	@Autowired
	private ItemsOutRecordsService itemsOutRecordsService;
	
	/**
	 * 物品带出记录
	 * @param identifying
	 * @return
	 */
	@RequestMapping("/itemsout")
	public @ResponseBody List<ItemsOutRecordsCustom> itemsout(String identifying) {
		return itemsOutRecordsService.ItemsOutList(identifying);
	}
	
	/**
	 * 申请带出物品
	 * @param identifying
	 * @return
	 */
	@RequestMapping("/itemAway")
	public @ResponseBody Return itemAway(String identifying,String stId) {
		
		Return return1 = new Return();
		String i=itemsOutRecordsService.itemAway(identifying, stId);
		return1.setIdentifying(i);
		return return1;
	}
	
	/**
	 * 查看物品记录的状态
	 * @param identifying
	 * @return
	 */
	@RequestMapping("/itemOutRecordsState")
	public @ResponseBody Return itemOutRecordsState(String identifying) {
		
		Return return1 = new Return();
		
		ItemsOutRecords itemsOutRecords = 
				itemsOutRecordsService.itemOutRecordState(identifying);
		
		if(itemsOutRecords!=null){		
			return1.setIdentifying(itemsOutRecords.getItemsRecordsState());
		}
		
		return return1;
	}
	
	/**
	 * 撤销申请
	 * @param identifying
	 * @return
	 */
	@RequestMapping("/quashed")
	public @ResponseBody Return quashed(String identifying) {
		
		Return return1 = new Return();
		String i=itemsOutRecordsService.updateItemsRecordState(identifying,"2");
		return1.setIdentifying(i);
		return return1;
		
	}
	
}
