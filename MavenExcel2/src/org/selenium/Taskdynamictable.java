package org.selenium;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Taskdynamictable {

	
public static void main(String[] args) throws IOException {
		
		
	System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.guru99.com/test/web-table-element.php");
	driver.manage().window().maximize();
	
	WebElement tbody =  driver.findElement(By.tagName("tbody"));
	
  List<WebElement> trows = tbody.findElements(By.tagName("tr"));
  
  for (int i =0; i< trows.size(); i++){

      WebElement row  =trows.get(i);  
      List<WebElement> tdatas = row.findElements(By.tagName("td"));
     
    	  WebElement name  =tdatas.get(0);  
    	  String cmpname = name.getText();
    	  
    	  if(cmpname.contains("Rashtriya")){
    	 WebElement data  =tdatas.get(3); 
    	 String text = data.getText();
    	  System.out.println("Rashtriya Chemicals current price is ="+text);
    	  }
    	  else{
    		  System.out.println("company name is not Rashtriya");
    	  }
    		 
    	  }	
  
  		TakesScreenshot ts = (TakesScreenshot)driver;
  		File source = ts.getScreenshotAs(OutputType.FILE);
  		File destination = new File(".//Records//Report.png");
  		FileUtils.copyFile(source, destination);
  		
  		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		
  		TakesScreenshot ts2 = (TakesScreenshot)driver;
  		File source2 = ts2.getScreenshotAs(OutputType.FILE);
  		File destination2 = new File(".//Records//Report2.png");
  		FileUtils.copyFile(source2, destination2);
  		
  		
  		driver.close();
  		
	
	
}
		
	
}
