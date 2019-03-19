package com.healthcare.pn.ui.tests.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.portalHomepage;
import resources.TestBase;

public class LoginPageStep extends TestBase{
	@Given("^Initialize the browser with chrome$")
	public void initialize_the_browser_with_chrome() throws Throwable {
	initializeDriver();
	}

	@Given("^Navigate to \"([^\"]*)\" Site$")
	public void navigate_to_Site(String arg1) throws Throwable {
	  driver.get(arg1);
	}

	@Given("^Click on Login link in home page to land on Secure sign in Page$")
	public void click_on_Login_link_in_home_page_to_land_on_Secure_sign_in_Page() throws Throwable {
		LandingPage lp=new LandingPage (driver);
		lp.getLogin().click();
	  
	}

	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\" and logs in$")
	public void user_enters_and_and_logs_in(String arg1, String arg2) throws Throwable {
	  LoginPage lp=new LoginPage(driver);
	  lp.getEmail().sendKeys(arg1);
	  lp.getPassword().sendKeys(arg2);
	  lp.getLogin().click();
	}
	 
	

	@Then("^Verify that user is succesfully logged in$")
	public void verify_that_user_is_succesfully_logged_in() throws Throwable {
		portalHomepage l=new portalHomepage(driver);
		l.getSearchBox().isDisplayed();
		Assert.assertTrue(l.getSearchBox().isDisplayed());
	 
	}

	@Then("^close browsers$")
	public void close_browsers() throws Throwable {
	driver.close();
	   
	}
	
}
