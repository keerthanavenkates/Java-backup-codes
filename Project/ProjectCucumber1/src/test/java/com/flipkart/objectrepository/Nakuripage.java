package com.flipkart.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.resources.CommonActions;

public class Nakuripage extends CommonActions {
	
	public Nakuripage() {
		PageFactory.initElements(driver, this);
				
	}
	@FindBy(xpath ="//div[contains(text(),'Register')]")
	private WebElement Register;

	@FindBy(id ="name")
	private WebElement Fullname;

	@FindBy(id ="email")
	private WebElement mail;
	
	@FindBy(id ="password")
	private WebElement pw;
	
	@FindBy(id ="mobile")
	private WebElement mobile;
	
	@FindBy(xpath="//button[contains(text(),'Upload')]")
	private WebElement upload;
	
	@FindBy(xpath = "//button[contains(text(),'Register Now')]")
	private WebElement Reg;

	public WebElement getRegister() {
		return Register;
	}

	public WebElement getFullname() {
		return Fullname;
	}

	public WebElement getMail() {
		return mail;
	}
	public WebElement getPw() {
		return pw;
	}

	public WebElement getMobile() {
		return mobile;
	}

	public WebElement getUpload() {
		return upload;
	}

	public WebElement getReg() {
		return Reg;
	}
	



}