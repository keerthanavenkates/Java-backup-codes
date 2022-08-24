package com.nakuri.stepdefinition;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//resources//Features//Nakuri.feature",
					glue  ="com.nakuri.stepdefinition",
				plugin	  = "html:target",
				monochrome= true,
					dryRun= false)

public class TestRunner {

}
