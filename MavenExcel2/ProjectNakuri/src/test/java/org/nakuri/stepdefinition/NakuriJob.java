package org.nakuri.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class NakuriJob {
	static WebDriver driver;
	
	@Given("I want to Launch browser and url")
	public void i_want_to_Launch_browser_and_url() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	}

	@Given("I want to login")
	public void i_want_to_login() {
		WebElement login = driver.findElement(By.xpath("//div[contains(text(),'Login')]"));
		
	    login.click();
	}

	@When("I want to search for jobs")
	public void i_want_to_search_for_jobs() {
	    
	}

	@When("I want to pic a job")
	public void i_want_to_pic_a_job() {
	    
	}

	@Then("I want to write in excel")
	public void i_want_to_write_in_excel() {
	   
	}



}