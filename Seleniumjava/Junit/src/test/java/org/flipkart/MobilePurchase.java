package org.flipkart;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MobilePurchase {
	
	static long start;
	public static WebDriver driver;
	
	
	@BeforeClass
	public static void BrowserLaunch() {
		
		WebDriverManager.chromedriver().setup(); 
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}


	
@Before
public void startingTime() {
	System.out.println("Before");
	start = System.currentTimeMillis();
	
}

@After
public void endTime() {
	long end = System.currentTimeMillis();
	System.out.println("After time taken is :" +(end - start));
}

@Test
public void Method1() throws InterruptedException{
	Thread.sleep(3000);
	System.out.println("login");
	WebElement Closeicon =  driver.findElement(By.xpath("//button[text()='✕']"));
	Closeicon.click();
}
	@Test
	public void Method2(){
		WebElement Searchbar =  driver.findElement(By.name("q"));
		Searchbar.sendKeys("samsung");
	}
	@Test
	public void Method3(){
		WebElement Searchicon =  driver.findElement(By.xpath("//button[@type='submit']"));
		Searchicon.click();
  
}
		
	@Test
	public void Method4() throws InterruptedException, IOException{
	
	Actions a = new Actions(driver);

		Thread.sleep(3000);
		
		WebElement newTab =  driver.findElement(By.xpath("//div[text()='SAMSUNG Galaxy F22 (Denim Blue, 128 GB)'][1]"));
		System.out.println(newTab.getText());
		a.moveToElement(newTab).build().perform();
		newTab.click();
		Thread.sleep(3000);
		
			String parentURL = driver.getWindowHandle();
			
			Set<String>allURL = driver.getWindowHandles();
			
			for(String url : allURL){
				
				if(!url.equals(parentURL)){
					driver.switchTo().window(parentURL);
					
				}
				
			}
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File Source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(".//target//Report.png");
		FileUtils.copyFile(Source, destination);
		
		
	}
	@Ignore
	//to ignore any particular method
	@Test
	//for strict validation assert useage
	//two methods
	//asserttrue
	//assertequals
	public void Method6(){
	String name = "Keerthana";
	Assert.assertEquals(name,"Venkatesh");
	}

}





