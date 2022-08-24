package org.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown2 {
	
	public static void main (String [] args){
		
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement Products = driver.findElement(By.id("first"));
		Select sgoogle = new Select(Products);
		sgoogle.selectByVisibleText("Google");
		
		WebElement Animals = driver.findElement(By.id("animals"));
		Select sbabycat = new Select(Animals);
		sbabycat.selectByVisibleText("babycat");
		
		WebElement Custom = driver.findElement(By.id("custom"));
		Select td = new Select(Custom);
		td.selectByVisibleText("td");
		
	}

}
