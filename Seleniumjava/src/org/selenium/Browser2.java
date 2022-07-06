package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browser2 {
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.ie.driver", ".\\driver\\IEDriverServer.exe");
		WebDriver driver1 = new InternetExplorerDriver();
		
		driver1.get("https://www.facebook.com/");
		
		driver1.manage().window().maximize();
		
		String title = driver1.getTitle();
		
		String currentUrl = driver1.getCurrentUrl();
		
		driver1.navigate().refresh();
		
		driver1.quit();
		
		

		
		
	}
	
	
	
	

}
