package org.selenium;


import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Taskframe {
	
public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		
		//	WebElement username  =  driver.findElement(By.xpath("//iframe[@id='a077aa5e]"));
		//driver.switchTo().frame(frame);
		
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		System.out.println(frames.size());
		
		for(int i=1; i< frames.size(); i++){
			
			try{
				
				driver.switchTo().frame(i);
				WebElement img  =  driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
				
				img.click();
				Thread.sleep(3000);
	
			}catch(Exception e){
				System.out.println("image is not available in this frame: "+i);
				driver.switchTo().parentFrame();		
			}
		}
			
		String windowHandle = driver.getWindowHandle();
		
		Set<String>allwindow = driver.getWindowHandles();
		for(String url : allwindow){
			
			if(!url.equals(windowHandle)){
				driver.switchTo().window(url);
			
				
			}
		}
		Thread.sleep(5000);
		WebElement text  =  driver.findElement(By.xpath("//span[contains(text(),'Testing')]"));
		System.out.println(text.getText());
		Thread.sleep(5000);	
		
		driver.switchTo().window(windowHandle);
		
		WebElement username  =  driver.findElement(By.id("philadelphia-field-email"));
		username.sendKeys("keerthanasekar333@gmail.com");
		
		Actions a = new Actions(driver);
		
		WebElement Submit =  driver.findElement(By.id("philadelphia-field-submit"));
		a.moveToElement(Submit).build().perform();
		Submit.click();
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
		
			
		
}
}

