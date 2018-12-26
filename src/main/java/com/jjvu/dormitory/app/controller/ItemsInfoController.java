package com.jjvu.dormitory.app.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.alibaba.fastjson.JSON;
import com.jjvu.dormitory.Service.ItemsInfoService;
import com.jjvu.dormitory.app.json.Return;
import com.jjvu.dormitory.po.ItemsInfo;

@Controller
@RequestMapping("/app/itemsInfo")
public class ItemsInfoController {

	@Autowired
	private ItemsInfoService itemsInfoService;
	
	/**
	 * 物品列表
	 * @param identifying
	 * @return
	 */
	@RequestMapping("/ListItemsInfo")
	public @ResponseBody List<ItemsInfo> ListItemsInfo(String identifying) {
		List<ItemsInfo> itemsList = itemsInfoService.selectList(identifying);
		
		if(itemsList.size() > 0) {
			return itemsList;
		}else {
			return null;
		}
	}
	
	/**
	 * 增加物品
	 * @param request
	 * @param itemsInfo
	 * @param identifying
	 * @param file
	 * @return
	 * @throws IllegalStateException
	 * @throws IOException
	 */
	@RequestMapping("/addItemsInfo")
	public @ResponseBody Return addItemsInfo(HttpServletRequest request, 
					String itemsInfo, String identifying, MultipartFile file) 
					throws IllegalStateException, IOException {
		
		Return return1 = new Return();
		String basePath=null;
		ItemsInfo it = new ItemsInfo();
		if(!itemsInfo.equals("")&&itemsInfo!=null) {
			try {
			itemsInfo=URLDecoder.decode(itemsInfo,"utf-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			it=JSON.parseObject(itemsInfo,ItemsInfo.class);
		}
					
		//图片文件夹的绝对路径
		basePath = request.getServletContext().getRealPath("ItemsPicture/");
		if(itemsInfoService.ItemsAdd(it,identifying, basePath,file)) {
			return1.setIdentifying("1");
		}else {
			return1 = null;
		}
		
		return return1;
	}
	
	/**
	 * 物品详细信息
	 * @param identifying
	 * @return
	 */
	@RequestMapping("/itemInfo")
	public @ResponseBody ItemsInfo itemInfo(String identifying) {
		return itemsInfoService.itemInfo(identifying);	
	}
	
	/**
	 * 检查电脑是否存在
	 * @param identifying
	 * @return
	 */
	@RequestMapping("/checkComputer")
	public @ResponseBody Return checkComputer(String identifying) {
		
		Return return1 = new Return();
		
		if(itemsInfoService.checkComputer(identifying))	{
			return1.setIdentifying("1");
		}else {
			return1 = null;
		}
		
		return return1;
	}
	
	/**
	 * 修改物品信息
	 * @param request
	 * @param itemsInfo
	 * @param identifying
	 * @param file
	 * @return
	 * @throws IllegalStateException
	 * @throws IOException
	 */
	@RequestMapping("/alterItem")
	public @ResponseBody Return alterItem(HttpServletRequest request, 
		 @RequestParam(value="itemsInfo",required=false)String itemsInfo, String identifying) 
					throws IllegalStateException, IOException {
		
		Return return1 = new Return();
		MultipartFile file=null;
		String basePath=null;
		ItemsInfo it = new ItemsInfo();
		if(itemsInfo!=null&&!itemsInfo.equals("")){
		try {
			itemsInfo=URLDecoder.decode(itemsInfo,"utf-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			it=JSON.parseObject(itemsInfo,ItemsInfo.class);
			
				
		}
		
		if(request instanceof MultipartHttpServletRequest) {
			file = ((MultipartHttpServletRequest)request).getFile("file");
			//图片文件夹的绝对路径
			basePath = request.getServletContext().getRealPath("ItemsPicture/");
		
		}
		if(itemsInfoService.alterItem(it,identifying,file,basePath)){
			return1.setIdentifying("1");
		}else {
			return1=null;
		}	
			
		return return1;
	}
	
//	public @ResponseBody Return adminAlterItem(HttpServletRequest request, 
//			String itemsInfo, String identifying, MultipartFile file) 
//					throws IllegalStateException, IOException {
//		
//		Return return1 = new Return();
//		
//		try {
//			itemsInfo=URLDecoder.decode(itemsInfo,"utf-8");
//		} catch (UnsupportedEncodingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		ItemsInfo it = new ItemsInfo();
//		
//		if(itemsInfo!=null&&!itemsInfo.equals("null")){
//			it=JSON.parseObject(itemsInfo,ItemsInfo.class);
//		}
//		
//		if(file != null) {
//			//图片文件夹的绝对路径
//			String basePath = request.getServletContext().getRealPath("ItemsPicture");
//			//图片的原始名称
//			String originalFilename = file.getOriginalFilename();
//			//新的图片名称
//			String imageName = it.getItemsInfoId() + it.getItemsInfoCategory() + 
//					originalFilename.substring(originalFilename.lastIndexOf("."));
//			
//			File newFile = new File(basePath +"/"+ imageName);
//			
//			file.transferTo(newFile);
//			
//			it.setItemsInfoImage("ItemsPicture/"+imageName);
//			
//		}
//		
//		if(itemsInfoService.alterItem(it,identifying)){
//			return1.setIdentifying("1");
//		}else {
//			return1=null;
//		}
//		
//		return return1;
//	}
	
	/**
	 * 已申请带出物品
	 * @param identifying
	 * @return
	 */
	@RequestMapping("/appliedOutItems")
	public @ResponseBody List<ItemsInfo> appliedOutItems(String identifying) {
		
		List<ItemsInfo> itemsList=itemsInfoService.appliedOutItems(identifying);
		
		if(itemsList.size() > 0) {
			return itemsList;
		}else {
			return null;
		}
	}
	
	/**
	 * 带入物品
	 * @param identifying
	 * @return
	 */
	@RequestMapping("/itemsIntoOk")
	public @ResponseBody Return itemsIntoOk(String identifying) {
		
		Return return1 = new Return();
		
		if(itemsInfoService.itemsIntoOk(identifying)) {
			return1.setIdentifying(identifying);
		}else {
			return1 = null;
		}
		
		return return1;
	}
	
}
