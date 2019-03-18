package com.healthcare.pn.ui.tests.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.healthcare.pn.ui.tests.base.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageStep extends TestBase{
	@Given("^Initialize the browser with chrome$")
	public void initialize_the_browser_with_chrome() throws Throwable {
	initializeDriver();
	}

	@Given("^Navigate to \"([^\"]*)\" Site$")
	public void navigate_to_Site(String arg1) throws Throwable {
	  
	}

	@Given("^Click on Login link in home page to land on Secure sign in Page$")
	public void click_on_Login_link_in_home_page_to_land_on_Secure_sign_in_Page() throws Throwable {
	  
	}

	@When("^User enters test(\\d+)@gmail\\.com and (\\d+) and logs in$")
	public void user_enters_test_gmail_com_and_and_logs_in(int arg1, int arg2) throws Throwable {
	 
	}

	@Then("^Verify that user is succesfully logged in$")
	public void verify_that_user_is_succesfully_logged_in() throws Throwable {
	 
	}

	@Then("^close browsers$")
	public void close_browsers() throws Throwable {
		driver.close();
	   
	}
	
}
