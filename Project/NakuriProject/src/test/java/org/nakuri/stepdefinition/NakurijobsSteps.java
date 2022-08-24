package org.nakuri.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class NakurijobsSteps {
	
	
@Given("user launch browser and get in to url")
public void user_launch_browser_and_get_in_to_url() {

	System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.naukri.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
}

@Given("user click login")
public void user_click_login() {
   
}
@When("user give credentials to login and click login")
public void user_give_credentials_to_login_and_click_login() {
}

@When("user search field for software tester jobs")
public void user_search_field_for_software_tester_jobs() {
    
}

@When("user write in excel")
public void user_write_in_excel() {
   
}

@Then("user search field for automation tester jobs")
public void user_search_field_for_automation_tester_jobs() {
    
}

@Then("user write in excel")
public void user_write_in_excel2() {
    
}



}
