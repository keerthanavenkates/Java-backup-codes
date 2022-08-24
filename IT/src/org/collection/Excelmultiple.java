package org.collection;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Excelmultiple {
	
	public static void main (String[] args) throws IOException {
		
		File file = new File(".//test//Nakuri.xls");
		
		FileOutputStream f = new FileOutputStream(file);
		HSSFWorkbook work = new HSSFWorkbook();
		HSSFSheet sheet = work.createSheet("Company");
		HSSFRow row = sheet.createRow(0);
		HSSFCell col = row.createCell(0);
		HSSFCell col2 = row.createCell(1);
		
		col.setCellValue("Employee Name");
		col2.setCellValue("Employee id");
		
		List<String> name = new ArrayList<String>();
		name.add("Keerthana");
		name.add("Venkatesh");
		name.add("Dhanvika");
		name.add("Nivetha");
		name.add("Deepan");
		name.add("Ahash");
		
			for (int i=0; i<name.size(); i++){
				
				HSSFRow r = sheet.createRow(i+1);
				HSSFCell c = r.createCell(0);
				c.setCellValue(name.get(i));
			
				List<String> id = new ArrayList<String>();
				id.add("121");
				id.add("131");
				id.add("141");
				id.add("151");
				id.add("161");
				id.add("171");	
				
				for (int j=0; j<id.size(); j++){
					
					HSSFRow r1= sheet.createRow(j+1);
					HSSFCell c1 = r1.createCell(1);
					c1.setCellValue(id.get(j));	
				
			}
			}
				
				work.write(f);
				work.close();	
				
			}
		
		
}



