package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browser {
	
	public static void main(String[] args) {
		
		//Browser Initialization
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//to browser launch----------get(URL);
		driver.get("https://www.facebook.com/");
		
		//to maximize window
		driver.manage().window().maximize();
		
		WebElement username =  driver.findElement(By.id("email"));
		username.sendKeys("keerthana@gmail.com");
       
		WebElement password =  driver.findElement(By.name("pass"));
		password.sendKeys("625544215");
		
		WebElement login =  driver.findElement(By.name("login"));
		login.click();
		
		WebElement fb =  driver.findElement(By.xpath("//div[text()='Log in to Facebook']"));
	    String text = fb.getText();
	    boolean b = fb.isDisplayed();
	    System.out.println(b);
	    
	    
	    if(text.equals("Log in to Facebook")){
	    	System.out.println("pass");
	    	
	    }else {
	    		System.out.println("fail");
	    		
	    	}	    	
	    	
	    WebElement fp =  driver.findElement(By.xpath("//div[contains(text(),'The password' )] "));
	    String fpT = fp.getText();
	    System.out.println(fpT);
	    
	    String attribute = fp.getAttribute("class");
	    System.out.println(attribute);
	    
	    String cssValue = fp.getCssValue("font size");
	    System.out.println(cssValue);
	    
	    String clr = fp.getCssValue("color");
	    System.out.println(clr);
	    
	    
	    
	    
	    
	    }
	    	
	    		    
       
		
	}
	
	


