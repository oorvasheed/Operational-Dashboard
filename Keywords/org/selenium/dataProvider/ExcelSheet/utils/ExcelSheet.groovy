package org.selenium.dataProvider.ExcelSheet.utils

import org.apache.poi.ss.usermodel.DataFormatter
import org.apache.poi.xssf.usermodel.XSSFCell
import org.apache.poi.xssf.usermodel.XSSFRow
import org.apache.poi.xssf.usermodel.XSSFSheet
import org.apache.poi.xssf.usermodel.XSSFWorkbook
import org.testng.annotations.DataProvider
import org.testng.annotations.Test

public class ExcelSheet {
	
	public static String[][] getExcelData(String fileName) {
	//String fileName = "C:/Users/I1675/Downloads/Login.xlsx";
	XSSFWorkbook wkbook = new XSSFWorkbook("C:/Users/I1675/Downloads/"+fileName+".xlsx");
	XSSFSheet sheet = wkbook.getSheetAt(0);
	int lastRowNum =  sheet.getLastRowNum()
	short lastCellNum = sheet.getRow(0).getLastCellNum();
	String[][] data = new String[lastRowNum][lastCellNum]
	for(int i=1; i<lastRowNum; i++) {
	XSSFRow row = sheet.getRow(i);
	for(int j=0; j<lastCellNum; j++) {
	XSSFCell cell = row.getCell(j);
	DataFormatter format = new DataFormatter();
	String Value = format.formatCellValue(cell);
	//String Value = cell.getStringCellValue()
	System.out.println(Value);
	}
	}
	wkbook.close();
	return data;
	}
	
}
