package com.jjvu.dormitory.po;

import java.util.List;

public class DormCustom extends DormInfo {
	
	private List<DormroomCustom> dormRoomList;

	public List<DormroomCustom> getDormRoomList() {
		return dormRoomList;
	}

	public void setDormRoomList(List<DormroomCustom> dormRoomList) {
		this.dormRoomList = dormRoomList;
	}

}
