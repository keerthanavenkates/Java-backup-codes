package org.selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nakuri {
public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
		Thread.sleep(1000);
		WebElement Reg =  driver.findElement(By.xpath("//div[contains(text(),'Register')]"));
		Reg.click();
		
		String parentURL = driver.getWindowHandle();
		
		Set<String>allURL = driver.getWindowHandles();
		
		for(String url : allURL){
			
			if(!url.equals(parentURL)){
				driver.switchTo().window(url);		
			}
		}
		
		WebElement Fullname =  driver.findElement(By.id("name"));
		Fullname.sendKeys("Keerthana Venkatesh");
		
		WebElement mail =  driver.findElement(By.id("email"));
		mail.sendKeys("keerthanavenkatesh2706@gmail.com");
		
		WebElement pw =  driver.findElement(By.id("password"));
		pw.sendKeys("Dhanvi18*");
		
		WebElement mobile =  driver.findElement(By.id("mobile"));
		mobile.sendKeys("8248596819");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement upload = driver.findElement(By.xpath("//button[contains(text(),'Upload')]"));
		js.executeScript("arguments[0].scrollIntoView(true)", upload);
		js.executeScript("window.scrollBy(0,1500)");
		
		
		upload.click();
		Runtime.getRuntime().exec("D:\\FileUploadScript.exe");
		Thread.sleep(6000);
		WebElement Regnow =  driver.findElement(By.xpath("//button[contains(text(),'Register Now')]"));
		Regnow.click();
		
		
		//C:\Users\HP\Documents\FileUploadScript.au3

		
		
		
}

}