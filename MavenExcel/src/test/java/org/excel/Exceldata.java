package org.excel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Exceldata {
	
	public static void main (String[] args) throws IOException {
		
		File file = new File(".//target//Data.xlsx");
		
		FileOutputStream f = new FileOutputStream(file);
		HSSFWorkbook work = new HSSFWorkbook();
		HSSFSheet sheet = work.createSheet("Company");
		HSSFRow row = sheet.createRow(0);
		HSSFCell col = row.createCell(0);
		
		col.setCellValue("Employee Name");
		
		List<String> name = new ArrayList();
		name.add("Keerthana");
		name.add("Venkatesh");
		name.add("Dhanvika");
		name.add("Nivetha");
		name.add("Deepan");
		
			for (int i=0; i<name.size(); i++){
				
				HSSFRow r = sheet.createRow(i+1);
				HSSFCell c = r.createCell(0);
				c.setCellValue(name.get(i));
				
			}	
		work.write(f);
		work.close();	
		
	}
	
	

}
