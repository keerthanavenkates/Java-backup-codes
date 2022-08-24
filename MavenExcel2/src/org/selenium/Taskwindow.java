package org.selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Taskwindow {
	
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();	

		Thread.sleep(1000);
		WebElement Closeicon =  driver.findElement(By.xpath("//button[text()='✕']"));
		Closeicon.click();
		
		Thread.sleep(3000);
		WebElement Searchbar =  driver.findElement(By.name("q"));
		Searchbar.sendKeys("realme");
		
		WebElement Searchicon =  driver.findElement(By.xpath("//button[@type='submit']"));
		Searchicon.click();
		
		Thread.sleep(3000);
		
		WebElement realme =  driver.findElement(By.xpath("//div[contains(text(),'realme')][1]"));
		realme.click();
		
		String parentURL = driver.getWindowHandle();
		
		Set<String>allURL = driver.getWindowHandles();
		
		for(String url : allURL){
			
			if(!url.equals(parentURL)){
				driver.switchTo().window(url);
				
			}
		}
		
		WebElement newTab = driver.findElement(By.xpath("//span[contains(text(),'realme')]"));
		System.out.println(newTab.getText());
		
		driver.close();
	
		
		Thread.sleep(3000);
		driver.switchTo().window(parentURL);
		Thread.sleep(3000);
		
		WebElement parentTab = driver.findElement(By.xpath("//span[contains(text(),'Add to Compare')][1]"));
		System.out.println(parentTab.getText());
		parentTab.click();
	

		driver.quit();
		
		
		
		
	}
	
}
