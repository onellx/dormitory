package com.jjvu.dormitory.Service.impl;


import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.jjvu.dormitory.Service.BackSchoolRecordsService;
import com.jjvu.dormitory.Service.ItemsInfoService;
import com.jjvu.dormitory.Service.ItemsOutRecordsService;
import com.jjvu.dormitory.Service.LeaveSchoolRecordsService;
import com.jjvu.dormitory.Service.StudentsAppInfoService;
import com.jjvu.dormitory.mapper.StudentsAppInfoMapper;
import com.jjvu.dormitory.po.BackSchoolRecords;
import com.jjvu.dormitory.po.ItemsInfo;
import com.jjvu.dormitory.po.LeaveSchoolRecords;
import com.jjvu.dormitory.po.StudentsAppInfo;
import com.jjvu.dormitory.po.StudentsAppInfoCustom;
import com.jjvu.dormitory.po.StudentsAppInfoExample;
import com.jjvu.dormitory.po.StudentsAppInfoExample.Criteria;


@Transactional
public class StudentsAppInfoServiceImpl implements StudentsAppInfoService {
	@Autowired
	private StudentsAppInfoMapper studentsAppInfoMapper;
	@Autowired
	private LeaveSchoolRecordsService leaveSchoolRecordsService;
	@Autowired
	private BackSchoolRecordsService backSchoolRecordsService;
	@Autowired
	private ItemsInfoService itemsInfoService;
	@Autowired
	private ItemsOutRecordsService itemsOutRecordsService;
	@Override
	public StudentsAppInfo Login(String Account, String Passwd) {
		// TODO Auto-generated method stub
		StudentsAppInfoExample studentsAppInfoExample=new StudentsAppInfoExample();
		studentsAppInfoExample.or().andStudentExamNumEqualTo(Account).andStudentAppPasswdEqualTo(Passwd).andStudentsAppStateEqualTo("1");
		studentsAppInfoExample.or().andStudentAppPhoneEqualTo(Account).andStudentAppPasswdEqualTo(Passwd).andStudentsAppStateEqualTo("1");	
		List<StudentsAppInfo> list=studentsAppInfoMapper.selectByExample(studentsAppInfoExample);
		StudentsAppInfo studentsAppInfo = null;
		if(list.size()>0){
			studentsAppInfo=list.get(0);
		}
		
		return studentsAppInfo;
	}
	@Override
	public StudentsAppInfoCustom StAppInfoCustom(String studentExamNum) {
		// TODO Auto-generated method stub
		StudentsAppInfoCustom studentsAppInfoCustom=studentsAppInfoMapper.selectByStudentsInfoCustom(studentExamNum);
		if(studentsAppInfoCustom!=null){
			//1:在校 2：不在校
			studentsAppInfoCustom.setLeaveOrStay(leaveOrStay(studentExamNum));
			return studentsAppInfoCustom;
		}
		return null;
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
	public boolean stAppInfoUpdate(StudentsAppInfo studentsAppInfo,String identifying,String basePath,MultipartFile file) {
		Date date=new Date();
        DateFormat format=new SimpleDateFormat("yyyyMMddHHmmss");
        String time=format.format(date);
        if(file!=null) {
        	String s=saveStuImg(basePath,file,identifying+time );
				if(s!=null) {
					studentsAppInfo.setStudentAppHeard("Avatar/"+s);
				}	
        }
        if(!studentsAppInfo.equals(null)) {
        	studentsAppInfo.setAppChangeTime(time);
            StudentsAppInfoExample studentsAppInfoExample=new StudentsAppInfoExample();
            Criteria criteria=studentsAppInfoExample.createCriteria();
            criteria.andStudentExamNumEqualTo(identifying);
    		int i=studentsAppInfoMapper.updateByExampleSelective(studentsAppInfo, studentsAppInfoExample);
    		if(i==0){
    			return false;
    		}
    		return true;
        }
        return false;
        
	}
	
	@Override
	public StudentsAppInfo stAppcheckPhone(String identifying) {
		// TODO Auto-generated method stub
		StudentsAppInfoExample studentsAppInfoExample=new StudentsAppInfoExample();
		studentsAppInfoExample.or().andStudentAppPhoneEqualTo(identifying).andStudentsAppStateEqualTo("1");	
		List<StudentsAppInfo> list=studentsAppInfoMapper.selectByExample(studentsAppInfoExample);
		StudentsAppInfo studentsAppInfo = null;
		if(list.size()>0){
			studentsAppInfo=list.get(0);
		}
		
		return studentsAppInfo;
	}
	@Override
	public int stLeavSchoolAndItemsOk(String identifying) {
		List<ItemsInfo> itemsInfos=itemsInfoService.appliedOutItems(identifying);
		String leaveStay=leaveOrStay(identifying);
		if(leaveStay.equals("2")){
			//不在校
			return 1;
		}
		else  {
			leaveSchoolRecordsService.stLeavechooled(identifying);
			for (ItemsInfo itemsInfo : itemsInfos) {
				String i=itemsOutRecordsService.updateItemsRecordState(itemsInfo.getItemsInfoId(),"3");
				ItemsInfo it=new ItemsInfo();
				it.setItemsLocation("2");
				Date date=new Date();
		        DateFormat format=new SimpleDateFormat("yyyyMMddHHmmss");
		        String time=format.format(date);
		        it.setItemsLocationTime(time);
				itemsInfoService.alterItem(it, itemsInfo.getItemsInfoId(),null,null);
			}
		}
		return 0;
	}
	//管理员根据自身id查
	@Override
	public List<StudentsAppInfoCustom> adminStudents(String identifying) {
		List<StudentsAppInfoCustom> list=studentsAppInfoMapper.selectbyManagerId(identifying);
		if(list!=null){
			for (StudentsAppInfoCustom s : list) {
				//高考号
				String stNum=s.getStudentExamNum();
				//1:在校 2：不在校
				s.setLeaveOrStay(leaveOrStay(stNum));	
			}
			return list;
		}
		return null;
		
	}
	@Override
	public boolean stCheckPasswd(String identifying, String passwd) {
		StudentsAppInfoExample studentsAppInfoExample=new StudentsAppInfoExample();
		studentsAppInfoExample.or().andStudentExamNumEqualTo(identifying).andStudentAppPasswdEqualTo(passwd);
		List<StudentsAppInfo> list=studentsAppInfoMapper.selectByExample(studentsAppInfoExample);
		if(list.size()>0){
			return true;
		}
		return false;
	}
	
	private String saveStuImg(String path,MultipartFile file, String imageId) {
		
			//图片的原始名称
			String originalFilename = file.getOriginalFilename();
			//新的图片名称，考生号加扩展名
			String imageName = imageId + 
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
