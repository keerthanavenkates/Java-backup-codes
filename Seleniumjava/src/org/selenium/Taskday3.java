package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Taskday3 {
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		Actions a = new Actions(driver);
		
		WebElement Source1 =  driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement target1 =  driver.findElement(By.xpath("(//ol[@align='center'])[1]"));
		
		a.dragAndDrop(Source1,target1).build().perform();
		
		Thread.sleep(1000);
		WebElement Source2 =  driver.findElement(By.xpath("//a[text()=' 5000 ']"));	
		WebElement target2 =  driver.findElement(By.xpath("(//ol[@align='center'])[2]"));
		
		a.dragAndDrop(Source2, target2).build().perform();
		Thread.sleep(1000);
		
		
		WebElement Source3 =  driver.findElement(By.xpath("//a[text()=' SALES ']"));	
		WebElement target3 =  driver.findElement(By.xpath("(//ol[@align='center'])[3]"));
		
		a.dragAndDrop(Source3, target3).build().perform();
		Thread.sleep(1000);
		
		WebElement Source4 =  driver.findElement(By.xpath("//a[text()=' 5000']"));	
		WebElement target4 =  driver.findElement(By.xpath("(//ol[@align='center'])[4]"));
		
		a.dragAndDrop(Source4, target4).build().perform();
		Thread.sleep(1000);
		
		WebElement debitmovement =  driver.findElement(By.id("t7"));
		String text1 =	debitmovement.getText();
		System.out.println("Debit Movement" +text1);
		
		WebElement creditmovement =  driver.findElement(By.id("t8"));
		String text2 =	creditmovement.getText();
		System.out.println("Credit Movement" +text2);
		
		if (text1.equals(text2)){
		System.out.println("Equal");
		}
		else{
			System.out.println("Not Equal");
		
		}
		
		WebElement Perfect =  driver.findElement(By.xpath("//a[text()='Perfect!']"));
		a.moveToElement(Perfect).build().perform();
		
	}
	

}
