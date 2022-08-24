package com.nakuri.stepdefinition;

import org.junit.After;

import com.nakuri.resources.CommonActions;

import cucumber.api.java.Before;

public class Hooks extends CommonActions {
	
	CommonActions c = new CommonActions();
	@Before
	public void beforeScenario(){
		System.out.println("Before Scenario");
		c.BrowserLaunch();
	}
	
	@After
	public void afterScenario(){
		System.out.println("After Scenario");
		
	}




}
