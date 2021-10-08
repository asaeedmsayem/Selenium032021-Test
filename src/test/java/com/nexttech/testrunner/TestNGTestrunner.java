package com.nexttech.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

public class TestNGTestrunner {
	@CucumberOptions (
		      features = {"Features"},
		      glue = {"com.nexttech.stepdefs"}
		      
		      )
	public class TestRunner extends AbstractTestNGCucumberTests{}
}
