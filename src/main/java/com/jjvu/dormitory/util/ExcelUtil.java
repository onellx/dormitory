package com.jjvu.dormitory.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.jjvu.dormitory.po.StudentInfo;

public class ExcelUtil {
	
	public List<StudentInfo> readExcelValue(File file) throws IOException, ParseException{
		
		
		//创建IO写入流
		InputStream is = new FileInputStream(file);
		//创建工作区间
		Workbook wb = new XSSFWorkbook(is);
		//得到表格第一页
		Sheet sheet = wb.getSheetAt(0);
		
		List<StudentInfo> list = new ArrayList<StudentInfo>();
		
		//循环表格行,从第二行开始读取
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			StudentInfo stuInfo = new StudentInfo();
			System.out.println("11------------"+row.getCell(4));
			if(row != null) {
				stuInfo.setStudentNo(String.valueOf(getCellFormatValue(row.getCell(0))));
				stuInfo.setStudentName(String.valueOf(getCellFormatValue(row.getCell(1))));
				stuInfo.setProfessionId(String.valueOf(getCellFormatValue(row.getCell(2))));
				stuInfo.setSystemId(Integer.parseInt(getCellFormatValue(row.getCell(3)).toString()));
				SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd");
				Date d = df.parse(getCellFormatValue(row.getCell(4)).toString());
				stuInfo.setStudentEnterDate(d);
				stuInfo.setStudentIdcardType(String.valueOf(getCellFormatValue(row.getCell(5))));
				stuInfo.setStudentIdcard(String.valueOf(getCellFormatValue(row.getCell(6))));
				stuInfo.setStudentSex(String.valueOf(getCellFormatValue(row.getCell(7))));
				Date d2 = df.parse(getCellFormatValue(row.getCell(8)).toString());
				stuInfo.setStudentBirthday(d2);
				stuInfo.setStudentNative(String.valueOf(getCellFormatValue(row.getCell(9))));
				stuInfo.setStudentNation(String.valueOf(getCellFormatValue(row.getCell(10))));
				stuInfo.setStudentTel(String.valueOf(getCellFormatValue(row.getCell(11))));
				stuInfo.setStudentEmail(String.valueOf(getCellFormatValue(row.getCell(12))));
				stuInfo.setStudentAddress(String.valueOf(getCellFormatValue(row.getCell(13))));
				stuInfo.setStudentCode(String.valueOf(getCellFormatValue(row.getCell(14))));
				stuInfo.setStudentLocal(String.valueOf(getCellFormatValue(row.getCell(15))));
				stuInfo.setStudentExamNum(String.valueOf(getCellFormatValue(row.getCell(16))));
			}
			
			list.add(stuInfo);
		}
		
		return list;
		
	}
	
	private Object getCellFormatValue(Cell cell) {
		Object cellValue;
		if(cell != null) {
			System.out.println(cell.getCellType());
			switch (cell.getCellType()) { //判断单元格格式
			case Cell.CELL_TYPE_FORMULA: //为日期格式
				if(DateUtil.isCellDateFormatted(cell)) { //判断当前的cell是否为Date 
					Date date = cell.getDateCellValue();
					cellValue = date;
				} else { // 如果是纯数字
					cellValue = String.valueOf(cell.getNumericCellValue());
				}
				break;
			case Cell.CELL_TYPE_STRING: //为Spring格式
				cellValue = cell.getRichStringCellValue().toString();
				break;
			case Cell.CELL_TYPE_NUMERIC:
				if(DateUtil.isCellDateFormatted(cell)) {
					Date date = cell.getDateCellValue();
					SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd");
					cellValue = df.format(date);
				}else {
					DecimalFormat df = new DecimalFormat("0");
					cellValue = df.format(cell.getNumericCellValue());
				}
				break;
			default: //默认的值
				cellValue = "";
				break;
			}
		}else {
			cellValue = "";
		}
		
		return cellValue;
	}

}
