package org.selenium;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	
	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com//");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	WebElement create = driver.findElement(By.xpath("//a[text()='Create New Account']"));
	create.click();
	
	WebElement day = driver.findElement(By.id("day"));
	Select sday = new Select(day);
	sday.selectByIndex(27);
	

	WebElement month = driver.findElement(By.id("month"));
	Select smonth = new Select(month);
	smonth.selectByVisibleText("Sep");
	
	WebElement year = driver.findElement(By.id("year"));
	Select syear = new Select(year);
	
	List<WebElement> options = syear.getOptions();
	
	for(WebElement all: options){
		
		System.out.println(all.getText());
		
		if (all.getText().equals("1993")){
			System.out.println(all.getText());
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
}