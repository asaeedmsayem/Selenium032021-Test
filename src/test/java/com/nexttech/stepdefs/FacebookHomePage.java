package com.nexttech.stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class FacebookHomePage {

	WebDriver driver;
	
	@Given("^User visits Facebook home page$")
	public void user_visits_Facebook_home_page() throws Throwable {
		//how to open browser
		  
	    System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Chrome Driver\\chromedriver.exe");
	    driver = new ChromeDriver();
	    
	    //how to open url
	    
	        driver.get("https://amazon.com");

	}

	@Then("^User should see FB News Feed$")
	public void user_should_see_FB_News_Feed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

	}
}
