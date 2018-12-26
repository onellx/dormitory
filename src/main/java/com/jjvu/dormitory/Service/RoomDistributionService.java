package com.jjvu.dormitory.Service;

public interface RoomDistributionService {
	
	/**
	 * 将房间分配给指定学院
	 * @param roomId
	 * @param collegeId
	 */
	void roomToCollege(String[] roomIds, String collegeId) throws Exception;
	
	/**
	 * 给学生分配房间
	 * @param studentId
	 * @param roomId
	 * @throws Exception
	 */
	void studntToRoom(String[] studentIds, String roomId) throws Exception;
	
	/**
	 * 单个学生更换寝室
	 * @param studentId
	 * @param roomId
	 * @throws Exception
	 */
	void roomChangeOne(String studentId, String roomId) throws Exception;
	
	/**
	 * 两个学生互换寝室
	 * @param studentIds
	 * @throws Exception
	 */
	void roomExChange(String[] studentIds) throws Exception;

}
