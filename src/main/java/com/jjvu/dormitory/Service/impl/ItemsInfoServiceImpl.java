package com.jjvu.dormitory.Service.impl;


import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.jjvu.dormitory.Service.ItemsInfoService;
import com.jjvu.dormitory.Service.ItemsOutRecordsService;
import com.jjvu.dormitory.mapper.ItemsInfoMapper;
import com.jjvu.dormitory.mapper.ItemsOutRecordsMapper;
import com.jjvu.dormitory.po.ItemsInfo;
import com.jjvu.dormitory.po.ItemsInfoExample;
import com.jjvu.dormitory.po.ItemsInfoExample.Criteria;
import com.jjvu.dormitory.po.ItemsOutRecords;


@Transactional
public class ItemsInfoServiceImpl implements ItemsInfoService {
	@Autowired
	private ItemsInfoMapper itemsInfoMapper;
	@Autowired
	private ItemsOutRecordsMapper itemsOutRecordsMapper;
	@Autowired
	private ItemsOutRecordsService itemsOutRecordsService;

	@Override
	public List<ItemsInfo> selectList(String identifying) {
		// TODO Auto-generated method stub
		ItemsInfoExample itemsInfoExample=new ItemsInfoExample();
		Criteria criteria=itemsInfoExample.createCriteria();
		criteria.andStudentExamNumEqualTo(identifying).andItemsStateEqualTo("1");
		List<ItemsInfo> list= itemsInfoMapper.selectByExample(itemsInfoExample);

		return list;
	}


	@Override
	public boolean ItemsAdd(ItemsInfo itemsInfo, String identifying ,String basePath, MultipartFile file) {
		// TODO Auto-generated method stub
		Date date=new Date();
        DateFormat format=new SimpleDateFormat("yyyyMMddHHmmss");
        String id1=format.format(date);
        int i=(int) (Math.random()*9000)+999;
        String itId=id1+i+identifying;
        String s=saveItImag(itId, file, basePath);
        if(s!=null) {
        	itemsInfo.setItemsInfoImage("ItemsPicture/"+s);
        }
        itemsInfo.setItemsInfoId(itId);
        itemsInfo.setStudentExamNum(identifying);
        itemsInfo.setItemsReview("1");
        itemsInfo.setItemsLocation("2");
        itemsInfo.setItemsState("1");
        int j=itemsInfoMapper.insert(itemsInfo);
        if(j==1){
        	return true;
        }

		return false;
	}

	@Override
	public ItemsInfo itemInfo(String idItemInfo) {
		// TODO Auto-generated method stub
		ItemsInfo itemsInfo=itemsInfoMapper.selectByPrimaryKey(idItemInfo);
		if(itemsInfo!=null){
			return itemsInfo;
		}
		return null;
	}

	@Override
	public boolean checkComputer(String identifying) {
		ItemsInfoExample example=new ItemsInfoExample();
		example.or().andComputerMacEqualTo(identifying).andItemsStateEqualTo("1");
		List<ItemsInfo> list=itemsInfoMapper.selectByExample(example);
		if(list.size()>0){
			return true;
		}
		return false;
	}


	@Override
	public boolean alterItem(ItemsInfo itemsInfo, String identifying,MultipartFile file, String basePath) {
		 if(file!=null) {
			 Date date=new Date();
		        DateFormat format=new SimpleDateFormat("yyyyMMddHHmmss");
		        String id1=format.format(date);
		        int i=(int) (Math.random()*9000)+999;
		        String itId=id1+i+identifying;
	        	String s=saveItImag(itId, file, basePath);
					if(s!=null) {
						itemsInfo.setItemsInfoImage("ItemsPicture/"+s);
					}	
	     }
		 if(!itemsInfo.equals(null)) {
			itemsInfo.setItemsInfoId(identifying);
			int i=itemsInfoMapper.updateByPrimaryKeySelective(itemsInfo);
			if(i==0){
				return false;
			}
			return true;
		 }
		 return false;
	
	}


	@Override
	public List<ItemsInfo> appliedOutItems(String identifying) {
		// TODO Auto-generated method stub
		List<ItemsInfo> itemsInfos=selectList(identifying);
		List<ItemsInfo> itemsInfos2=new ArrayList<ItemsInfo>();
		if(itemsInfos!=null){
			for (ItemsInfo itemsInfo : itemsInfos) {
				//物品标识
				String itemId=itemsInfo.getItemsInfoId();	
				//申请带出记录
				ItemsOutRecords iOutRecords=itemsOutRecordsService.itemOutRecordState(itemId);
				//申请带出状态
				String state=null;
				if(iOutRecords!=null){
					state=iOutRecords.getItemsRecordsState();	
					if(state.equals("1")&&itemsInfo.getItemsReview().equals("2")&&itemsInfo.getItemsLocation().equals("1")){
						itemsInfos2.add(itemsInfo);
					}
				}
			}
		}
		//已申请带出的物品
		return itemsInfos2;
	}


	@Override
	public boolean itemsIntoOk(String identifying) {
		ItemsInfo itemsInfo=itemsInfoMapper.selectByPrimaryKey(identifying);
		if(itemsInfo==null){
			return false;//找不到此物品
		}
		else if (itemsInfo.getItemsReview().equals("1")) {
			return false;//此物品未审核
		}
		else if (itemsInfo.getItemsLocation().equals("1")) {
			return false;//此物品已在校
		}
		else if (itemsInfo.getItemsState().equals("2")) {
			return false;//此物品被注销
		}
		itemsInfo.setItemsLocation("1");
		Date date=new Date();
        DateFormat format=new SimpleDateFormat("yyyyMMddHHmmss");
        String time=format.format(date);
		itemsInfo.setItemsLocationTime(time);
		int i=itemsInfoMapper.updateByPrimaryKeySelective(itemsInfo);
		if(i==0){
			return false;
		}
		return true;
	}
	public String saveItImag(String name,MultipartFile file,String path) {
		//图片的原始名称
		String originalFilename = file.getOriginalFilename();
		//新的图片名称，考生号加扩展名
		String imageName = name + 
				originalFilename.substring(originalFilename.lastIndexOf("."));
		
		File newFile = new File(path +"/"+ imageName);
		try {
			file.transferTo(newFile);
			return imageName;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return null;
	
		} 
		
		
	}
	
}
