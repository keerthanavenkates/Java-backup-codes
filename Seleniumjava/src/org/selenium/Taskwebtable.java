package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Taskwebtable {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		
		WebElement tbody =  driver.findElement(By.tagName("tbody"));
		
      List<WebElement> trows = tbody.findElements(By.tagName("tr"));
      
      for (int i =0; i< trows.size(); i++){
      
      WebElement row  =trows.get(i);  
      List<WebElement> tdatas = row.findElements(By.tagName("td"));
      
      for (int j =0; j< tdatas.size(); j++){
      
    	  WebElement data  =tdatas.get(j);
    	  
    	  String text = data.getText();
    	  System.out.println(text);
    	  
 
      }	
		
	}
	
	
	
	}
}
		
	

