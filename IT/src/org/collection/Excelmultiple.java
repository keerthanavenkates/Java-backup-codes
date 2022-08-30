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
		sheet.createRow(0);
		
		sheet.getRow(0).createCell(0).setCellValue("Employee Name");
		
		List<String> name = new ArrayList<String>();
		name.add("Keerthana");
		name.add("Venkatesh");
		name.add("Dhanvika");
		name.add("Nivetha");
		name.add("Deepan");
		name.add("Ahash");
		
			for (int i=0; i<name.size(); i++){	
				sheet.createRow(i+1);
				sheet.getRow(i+1).createCell(0).setCellValue(name.get(i));
				
			}
			sheet.createRow(1);	
			sheet.getRow(0).createCell(1).setCellValue("Employeeid");
			List<String> id = new ArrayList<String>();
				id.add("121");
				id.add("131");
				id.add("141");
				id.add("151");
				id.add("161");
				id.add("171");	
				
				for (int i1=0; i1<id.size(); i1++){	
						sheet.createRow(i1+1);
						sheet.getRow(i1+1).createCell(1).setCellValue(id.get(i1));
					}	
					
			
				work.write(f);
				work.close();	
			
					
				}
			
			
		}