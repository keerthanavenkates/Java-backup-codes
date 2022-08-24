 package com.nakuri.stepdefinition;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nakuri.objectrepository.Nakuripage;
import com.nakuri.resources.CommonActions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class Nakurijobs extends CommonActions {
	
	CommonActions c = new CommonActions();
	Nakuripage n = new Nakuripage();
	
	@Given("I want to Launch browser and url")
	public void i_want_to_Launch_browser_and_url() {

	   
	}

	@Given("I want to login")
	public void i_want_to_login() {
		n.getEmailId().sendKeys("keerthanasekar333@gmail.com");
		n.getPassword().sendKeys("ramesh27");
		n.getLogin().click();    
	   
	}

	@When("I want to search for jobs")
	public void i_want_to_search_for_jobs() throws InterruptedException, IOException  {

		 WebElement ele = driver.findElement(By.xpath("//div[text()='Jobs']"));
		 WebElement ele1 = driver.findElement(By.xpath("//div[text()='Jobs']")); 
		ele1.click();
		c.windowsHandling();
		n.getCmp();
		n.getCmp().click();
		n.getCmp().sendKeys("SoftwareTesting");
		n.getLocation().click();
		Thread.sleep(1000);
		n.getLocation().sendKeys("Chennai");
		n.getSearch().click();
		Thread.sleep(1000);
		 WebElement scroll = driver.findElement(By.xpath("//span[contains(text(),'Freshness')]")); 	
	
		c.scrollDown(scroll);
		
		WebElement fresh = driver.findElement(By.xpath("//input[@id='filter-freshnessFor']"));
		fresh.click();
		WebElement fresh2 = driver.findElement(By.xpath("//a[contains(text(),' Last 7 days ')]"));
		
		fresh2.click();
	    
	WebElement job1 = driver.findElement(By.xpath("//a[@class='title fw500 ellipsis']"));
	String s = job1.getText();
	System.out.println(s);
	WebElement job2 = driver.findElement(By.xpath("//a[@title='Manual Test Engineer']"));
	WebElement job3 = driver.findElement(By.xpath("//a[@title='Software Testing Engineer']"));
	WebElement job4 = driver.findElement(By.xpath("//a[@title='Software Test Engineer/ Software Tester']"));
	WebElement job5 = driver.findElement(By.xpath("//a[@title='Software Test Engineer - Manual/Automation Testing']"));

	WebElement cmp1 = driver.findElement(By.xpath("//a[@title='Concentrix']"));
	WebElement cmp2 = driver.findElement(By.xpath("//a[@title='Agilysys Technologies India']"));
	WebElement cmp3 = driver.findElement(By.xpath("//a[@title='Matex']"));
	WebElement cmp4 = driver.findElement(By.xpath("//a[@title='CADS Software India']"));
	WebElement cmp5 = driver.findElement(By.xpath("//a[@title='Coddle Technologies']"));
	
		File file1 = new File(".//target//type121321.xls");
		
		FileOutputStream fs = new FileOutputStream(file1);
		HSSFWorkbook work = new HSSFWorkbook();
		HSSFSheet sheet = work.createSheet("SoftwareTestingjobs");
		HSSFRow row = sheet.createRow(0);
		HSSFCell col = row.createCell(0);

		
		col.setCellValue("Jobname");
		HSSFCell col2 = row.createCell(1);
		
		
		
		List<String> name = new ArrayList<String>();
		name.add(job1.getText());
		name.add(job2.getText());
		name.add(job3.getText());
		name.add(job4.getText());
		name.add(job5.getText());
			
			for (int i=0; i<name.size(); i++){
				
				HSSFRow r1 = sheet.createRow(i+1);
				HSSFCell c1 = r1.createCell(0);
				c1.setCellValue(name.get(i));					
			}	
		
			work.write(fs);	
			work.close();	
			
			
			
			col2.setCellValue("Cmpname");
			
			HSSFCell col3 = row.createCell(2);
			col3.setCellValue("Days");
			
			
			List<String> name2 = new ArrayList<String>();
			name2.add(cmp1.getText());
			name2.add(cmp2.getText());
			name2.add(cmp3.getText());
			name2.add(cmp4.getText());
			name2.add(cmp5.getText());
				
				for (int i=0; i<name2.size(); i++){

					HSSFRow row2 = sheet.createRow(i+1);
					HSSFCell c2 = row2.createCell(1);
					c2.setCellValue(name2.get(i));					
				}	
		
		
		work.write(fs);	
		work.close();		   
}


	@Then("I want to write in excel")
	public void i_want_to_write_in_excel() throws IOException {
				
	
}
		
}





