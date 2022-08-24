package org.flipkart.stepdefinition;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nakuri {
	

	@DataProvider(name="Fullname")
	public Object[][] Fullname(){
		return new Object[][]{{"Keerthana Venkatesh"}};

}
	
	@DataProvider(name="email")
	public Object[][] email(){
		return new Object[][]{{"keerthanavenkatesh2706@gmail.com"}};
	
}
	
	@DataProvider(name="password")
	public Object[][] password(){
		return new Object[][]{{"Dhanvi18*"}};
	
	}
	
	@DataProvider(name="mobile")
	public Object[][] mobile(){
		return new Object[][]{{"8248596819"}};
	
	}
	
	static long start;
	public static WebDriver driver;
	
	@Parameters("URL")
	@BeforeClass(groups="default")
	public static void BrowserLaunch(@Optional("https://www.naukri.com/")String url) {
		
		WebDriverManager.chromedriver().setup(); 
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	@BeforeMethod()
	public void startingTime() {
		System.out.println("Before");
		start = System.currentTimeMillis();
	}	
		@AfterMethod()
		public void endTime() {
			long end = System.currentTimeMillis();
			System.out.println("After time taken is :" +(end - start));
			
		}
		
		@Test(priority=1)
		public void Reg() {
		WebElement Reg =  driver.findElement(By.xpath("//div[contains(text(),'Register')]"));
		Reg.click();
		
		String parentURL = driver.getWindowHandle();
		
		Set<String>allURL = driver.getWindowHandles();
		
		for(String url : allURL){
			
			if(!url.equals(parentURL)){
				driver.switchTo().window(url);		
			}
		}
		
		}
		
		@Test(priority=2,dataProvider="Fullname")
		public void field1(String name){
			WebElement Fullname =  driver.findElement(By.id("name"));	
			Fullname.sendKeys(name,Keys.ENTER);
			
		}
		
		
		@Test(priority=3,dataProvider="email")
		public void field2(String name){
			WebElement mail =  driver.findElement(By.id("email"));
			mail.sendKeys(name,Keys.ENTER);
			
		}
		
		
		@Test(priority=4,dataProvider="password")
		public void field3(String name){
			WebElement pw =  driver.findElement(By.id("password"));
		pw.sendKeys(name,Keys.ENTER);
			
		}
		
		
		@Test(priority=5,dataProvider="mobile")
		public void field4(String name){
			WebElement mobile =  driver.findElement(By.id("mobile"));
			mobile.sendKeys(name,Keys.ENTER);
			
		}
		
		@Test(priority=6)
		public void uploadregister() throws Exception{
		WebElement upload = driver.findElement(By.xpath("//button[contains(text(),'Upload')]"));
		
		upload.click();
		Runtime.getRuntime().exec("D:\\FileUploadScript.exe");
		Thread.sleep(6000);
		WebElement Regnow =  driver.findElement(By.xpath("//button[contains(text(),'Register Now')]"));
		Regnow.click();
		
		
		
}
		
		
}






