package org.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskAlert {
	
public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();

		WebElement Alert1 =  driver.findElement(By.id("alertButton"));
		Alert1.click();
		
		
				Alert alert1 = driver.switchTo().alert();
				System.out.println(alert1.getText());
				alert1.accept();
				Thread.sleep(3000);
				
				WebElement Alert2 =  driver.findElement(By.id("timerAlertButton"));
				Alert2.click();
				Thread.sleep(5000);
				
				Alert alert2 = driver.switchTo().alert();
				System.out.println(alert2.getText());
				alert2.accept();
				
				
				WebElement Alert3 =  driver.findElement(By.id("confirmButton"));
				Alert3.click();
				Thread.sleep(3000);
				
				Alert alert3 = driver.switchTo().alert();
				System.out.println(alert3.getText());
				alert3.dismiss();
				
				
				JavascriptExecutor js = (JavascriptExecutor)driver;
				js.executeScript("window.scrollBy(0,500)");
				
				WebElement Alert4 =  driver.findElement(By.id("promtButton"));
				Alert4.click();
					
				Alert alert4 = driver.switchTo().alert();
				alert4.sendKeys("Keerthana");
				alert4.accept();
		
				WebElement promptresult =  driver.findElement(By.id("promptResult"));
				System.out.println(promptresult.getText());
				
				
				
}

}
