package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Taskstaticwebtable {

	
public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		
		WebElement tbody =  driver.findElement(By.tagName("tbody"));
		
      List<WebElement> trows = tbody.findElements(By.tagName("tr"));
      

      WebElement row  =trows.get(5);  
      List<WebElement> tdatas = row.findElements(By.tagName("td"));
     
    	  WebElement name  =tdatas.get(0);  
    	  String cmpname = name.getText();
    	  System.out.println("Company name is ="+cmpname);	
    	  
    	  WebElement data  =tdatas.get(3);  
    	  String text = data.getText();
    	  System.out.println("Rashtriya Chemicals : " +text);
    	  
    	  
	
	}
}
		
	



