package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browser3 {
	
	public static void main(String[] args) throws Exception  {
		
		//Browser Initialization
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//to browser launch----------get(URL);
		driver.get("https://www.facebook.com/");
		
		//to maximize window
		driver.manage().window().maximize();
		
		WebElement CreateAccount =  driver.findElement(By.xpath("//a[text()=('Create New Account')]"));
		CreateAccount.click();
		Thread.sleep(2000);
		
		WebElement Firstname =  driver.findElement(By.xpath("//input[contains(@name,'firstname')]"));
		Firstname.sendKeys("Keerthana");
		Thread.sleep(2000);
		
		WebElement Surname =  driver.findElement(By.xpath("//input[contains(@name,'lastname')]"));
		Surname.sendKeys("Venkatesh");
		Thread.sleep(2000);
		
		WebElement emailaddress =  driver.findElement(By.xpath("//input[contains(@name,'reg_email__')]"));
		emailaddress.sendKeys("keerthanasekar333@gmail.com");
		Thread.sleep(2000);
		
		
		WebElement reenteremailaddress =  driver.findElement(By.xpath("//input[contains(@name,'reg_email_confirmation__')]"));
		reenteremailaddress.sendKeys("keerthanasekar333@gmail.com");
		Thread.sleep(2000);
		
		
		WebElement password =  driver.findElement(By.xpath("//input[contains(@name,'reg_passwd__')]"));
		password.sendKeys("123456");
		Thread.sleep(2000);
		
		WebElement day =  driver.findElement(By.id("day"));
		day.sendKeys("27");
		Thread.sleep(2000);
		
		WebElement month =  driver.findElement(By.id("month"));
		month.sendKeys("Sep");
		Thread.sleep(2000);
		
		WebElement year =  driver.findElement(By.id("year"));
		year.sendKeys("1993");
		Thread.sleep(2000);
		

		WebElement gender =  driver.findElement(By.xpath("//label[starts-with(text(),'Female')]"));
		gender.click();
		Thread.sleep(2000);
		
		WebElement SignUp =  driver.findElement(By.name("websubmit"));
		SignUp.click();
		Thread.sleep(2000);
		
	}

}
