package com.nakuri.objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nakuri.resources.CommonActions;

public class Nakuripage extends CommonActions {
	
	public Nakuripage(){
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath = "//input[@id='usernameField']")
	private WebElement emailId;
	
	@FindBy(xpath = "//input[@id='passwordField']")
	private WebElement password;
	
	@FindBy(xpath = "//button[text()='Login']")
	private WebElement login;
	
	@FindBy(xpath = "//div[text()='Jobs']")
	private WebElement jobs;
	
	@FindBy(xpath = "(//input[@name='qp'])[1]")
	private WebElement cmp;
	
	@FindBy(xpath ="//input[@placeholder='Location/Locality']")
	private WebElement location;
	
	@FindBy(xpath ="//button[text()='Search ']")
	private WebElement search;
	
	@FindBy(xpath="//a[@class='title fw500 ellipsis']")
	private WebElement jobname;
	
	public WebElement getJobname() {
		return jobname;
	}
	
	public WebElement getEmailId() {
		return emailId;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getJobs() {
		return jobs;
	}

	public WebElement getCmp() {
		return cmp;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getSearch() {
		return search;
	}
}
