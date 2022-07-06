package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	
	public static void main(String[] args) {
		
		
		
		//Browser Intialisation
		System.getProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		
		//To browser launch------get(URL);
		driver.get("https://www.facebook.com/");
	}
	

}
