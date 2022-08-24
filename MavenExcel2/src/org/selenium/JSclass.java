package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JSclass {
	
	public static void main(String [] args) throws Exception{
		
		//System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com//");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement user = driver.findElement(By.id("email"));
		js.executeScript("arguments[0].setAttribute('value', 'Keerthana')" , user);
		
		WebElement pass = driver.findElement(By.name("pass"));
		js.executeScript("arguments[0].setAttribute('value', '225525')", pass);
		
		WebElement login = driver.findElement(By.name("login"));
		js.executeScript("arguments[0].click()",login);
		
		js.executeScript("window.scrollBy(0,200)");
		
		WebElement meta = driver.findElement(By.xpath("//span [contains (text(),' Meta © 2022')]"));
		js.executeScript("arguments[0].scrollIntoView(true)", meta);
		
		Thread.sleep(2000);
		
		WebElement fb = driver.findElement(By.xpath("//img[@alt='Facebook']"));
		js.executeScript("arguments[0].scrollIntoView(false)",fb);
		
		
		
	}
		
	

}
