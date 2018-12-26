package com.jjvu.dormitory.Service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.jjvu.dormitory.po.ItemsInfo;


public interface ItemsInfoService {
	 List<ItemsInfo> selectList(String identifying);

	//JSONObject finbyId(String idItemInfo, File image);


	boolean ItemsAdd(ItemsInfo itemsInfo, String identifying, String basePath, MultipartFile file);


	ItemsInfo itemInfo(String idItemInfo);


	boolean checkComputer(String idItemInfo);

	boolean alterItem(ItemsInfo it, String identifying, MultipartFile file, String basePath);

	List<ItemsInfo> appliedOutItems(String identifying);

	boolean itemsIntoOk(String identifying);


   
}