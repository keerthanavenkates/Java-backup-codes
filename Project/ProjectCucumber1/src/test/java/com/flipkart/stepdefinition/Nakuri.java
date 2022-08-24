
package com.flipkart.stepdefinition;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.flipkart.objectrepository.Nakuripage;
import com.flipkart.resources.CommonActions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Nakuri extends Nakuripage {
	
	CommonActions c = new CommonActions();
	Nakuripage n = new Nakuripage();
	public static WebDriver driver;

	
	
	@Given("Launch browser")
	public void launch_browser() {
		c.Browserlaunch();	}

	@Given("Click Register")
	public void click_Register() throws InterruptedException {
		Thread.sleep(1000);
	n.getRegister().click();
	
	}

	@When("Give fullname")
	public void give_fullname() throws Exception {
		c.windowsHandling();

		c.insertText(n.getFullname(), "Keerthana Venkatesh");
	}

	@When("Give email")
	public void give_email() {
		c.insertText(n.getFullname(),"keerthanavenkatesh2706@gmail.com");
		
	}

	@When("Give password")
	public void give_password() {
		c.insertText(n.getPw(),"Dhanvi18*");	
	}

	@When("Give Mobile")
	public void give_Mobile() {
		c.insertText(n.getMobile(),"8248596819");
	}

	@Then("upload resume")
	public void upload_resume() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", n.getUpload());
		js.executeScript("window.scrollBy(0,1500)");
		
		
		n.getUpload().click();
		Runtime.getRuntime().exec("D:\\FileUploadScript.exe");
	}

	@Then("Register click")
	public void register_click() {
	
		n.getReg().click();
	}



}