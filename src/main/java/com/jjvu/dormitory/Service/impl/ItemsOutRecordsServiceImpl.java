package com.jjvu.dormitory.Service.impl;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.jjvu.dormitory.Service.BackSchoolRecordsService;
import com.jjvu.dormitory.Service.ItemsOutRecordsService;
import com.jjvu.dormitory.Service.LeaveSchoolRecordsService;
import com.jjvu.dormitory.mapper.ItemsInfoMapper;
import com.jjvu.dormitory.mapper.ItemsOutRecordsMapper;
import com.jjvu.dormitory.po.BackSchoolRecords;
import com.jjvu.dormitory.po.ItemsInfo;
import com.jjvu.dormitory.po.ItemsOutRecords;
import com.jjvu.dormitory.po.ItemsOutRecordsCustom;
import com.jjvu.dormitory.po.ItemsOutRecordsExample;
import com.jjvu.dormitory.po.ItemsOutRecordsExample.Criteria;
import com.jjvu.dormitory.po.LeaveSchoolRecords;


@Transactional
public class ItemsOutRecordsServiceImpl implements ItemsOutRecordsService {
	@Resource
	private ItemsOutRecordsMapper itemsOutRecordsMapper;
	@Resource
	private ItemsInfoMapper itemsInfoMapper;
	@Autowired
	private LeaveSchoolRecordsService leaveSchoolRecordsService;
	@Autowired
	private BackSchoolRecordsService backSchoolRecordsService;
	
	@Override
	public List<ItemsOutRecordsCustom> ItemsOutList(String identifying) {
		// TODO Auto-generated method stub
		List<ItemsOutRecordsCustom> list=itemsOutRecordsMapper.itemsOutList(identifying);
		if(list.size()>0){	
			return list;
		}
		return null;
	}

	@Override
	public String itemAway(String identifying, String stId) {
		// TODO Auto-generated method stub
		ItemsInfo itemsInfo=itemsInfoMapper.selectByPrimaryKey(identifying);
		
		if(itemsInfo==null){
			return "1";//找不到此物品
		}
		else if (itemsInfo.getItemsReview().equals("1")) {
			return "2";//此物品未审核
		}
		else if (itemsInfo.getItemsLocation().equals("2")) {
			return "3";//此物品已被带出
		}
		else if (itemsInfo.getItemsState().equals("2")) {
			return "4";//此物品被注销
		}
		else if (itemsInfo.getItemsState().equals("2")) {
			return "4";//此物品被注销
		}
		else if (leaveOrStay(stId).equals("2")) {
			return "6";//学生未在校
		}
		ItemsOutRecords itemsOutRecords=new ItemsOutRecords();
		Date date=new Date();
        DateFormat format=new SimpleDateFormat("yyyyMMddHHmmss");
        String id1=format.format(date);
        int id2=(int) (Math.random()*9000)+999;
        itemsOutRecords.setItemsRecordsId(id1+id2);
        itemsOutRecords.setItemsInfoId(identifying);
        itemsOutRecords.setItemsRecordsTime(id1);
        itemsOutRecords.setItemsRecordsState("1");
		int i=itemsOutRecordsMapper.insert(itemsOutRecords);
		if(i==1){
			return "0";
		}
		return "5";//添加失败
	}
	
	//是否在校
	private String leaveOrStay(String identifying) {
		//离校时间，返校时间
		String leaveTime="",backTime="";
		//离校记录
		List<LeaveSchoolRecords> leaveSchoolRecords=leaveSchoolRecordsService.LeaveSchoolList(identifying);
		//返校记录
		BackSchoolRecords backSchoolRecords=backSchoolRecordsService.selectByExamNum(identifying);
		if(leaveSchoolRecords!=null){
			leaveTime=leaveSchoolRecordsService.LeaveSchoolList(identifying).get(0).getLeaveRecodesTime();
		}
		if(backSchoolRecords!=null){
			backTime=backSchoolRecords.getBackRecodesTime();
		}
		if(leaveTime.compareTo(backTime)==1||backTime==null){
			return "2";
		}
		return "1";
		
	}

	@Override
	public ItemsOutRecords itemOutRecordState(String identifying) {
		ItemsOutRecordsExample example=new ItemsOutRecordsExample();
		Criteria criteria=example.createCriteria();
		criteria.andItemsInfoIdEqualTo(identifying);
		example.setOrderByClause("ITEMS_RECORDS_TIME DESC LIMIT 1");
		List<ItemsOutRecords> itemsOutRecordsList=itemsOutRecordsMapper.selectByExample(example);
		if(itemsOutRecordsList.size()>0){
			return itemsOutRecordsList.get(0);
		}
		return null;
	}

	@Override
	public String updateItemsRecordState(String identifying,String state) {
		// TODO Auto-generated method stub
		ItemsInfo itemsInfo=itemsInfoMapper.selectByPrimaryKey(identifying);
		if(itemsInfo==null){
			return "1";//找不到此物品
		}
		else if (itemsInfo.getItemsReview().equals("1")) {
			return "2";//此物品未审核
		}
		else if (itemsInfo.getItemsLocation().equals("2")) {
			return "3";//此物品已被带出
		}
		else if (itemsInfo.getItemsState().equals("2")) {
			return "4";//此物品被注销
		}
		ItemsOutRecords itemsOutRecords=itemOutRecordState(identifying);
		if(itemsOutRecords.getItemsRecordsState().equals("1")){
			Date date=new Date();
			DateFormat format=new SimpleDateFormat("yyyyMMddHHmmss");
			String time=format.format(date);
			itemsOutRecords.setItemsRecordsState(state);
			itemsOutRecords.setItemsRecordsTime(time);
			int i=itemsOutRecordsMapper.updateByPrimaryKeySelective(itemsOutRecords);
			if(i!=0){
				return "0";
			}
		}
		return "5";
		
	}


}
