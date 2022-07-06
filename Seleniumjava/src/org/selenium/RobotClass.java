package org.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotClass {
	
	public static void main(String [] args) throws AWTException, InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com//");
		driver.manage().window().maximize();	

		Actions a = new Actions(driver);
		
		WebElement user = driver.findElement(By.id("email"));
		a.sendKeys(user,"Keerthana@gmail.com").build().perform();
			
		WebElement pass = driver.findElement(By.name("pass"));
		a.sendKeys(pass,"44554455").build().perform();
		
		WebElement login = driver.findElement(By.name("login"));
		a.click(login).build().perform();
		
		WebElement fb = driver.findElement(By.xpath("//div[contains(text(),'Facebook')]"));
		a.doubleClick(fb).build().perform();
		
		a.contextClick(fb).build().perform();
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement emailclear = driver.findElement(By.id("email"));
	    emailclear.clear();
	    
	    a.contextClick(emailclear).build().perform();
		Thread.sleep(1000);
	    
	    r.keyPress(KeyEvent.VK_DOWN);
	    r.keyPress(KeyEvent.VK_DOWN);
	    r.keyRelease(KeyEvent.VK_DOWN);
	   	
	    r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	
		
		
		
		
		
		
		
			
		
	}

}
