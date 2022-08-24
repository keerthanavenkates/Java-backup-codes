package com.nakuri.resources;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonActions {
public static WebDriver driver;
	
	public void BrowserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();	
		driver.get("https://www.naukri.com/nlogin/login");	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public void insertText(WebElement ele, String value) {
		ele.sendKeys(value, Keys.ENTER);

	}
	
	public void windowsHandling() {
		String parentURL = driver.getWindowHandle();
		Set<String> allURL = driver.getWindowHandles();
		for(String url : allURL){
			if(!url.equals(parentURL)){
				System.out.println("window switched");
				driver.switchTo().window(url);
			}
		}

	}
	
	public void scrollDown(WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", ele);	
		
	}
	
	public void scrollDown() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)");

	}

}
