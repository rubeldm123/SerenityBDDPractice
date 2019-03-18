package com.healthcare.pn.ui.tests;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
//@CucumberOptions(features="C:\\Users\\md954105\\git\\com.SerenityBDDPractice\\src\\test\\resources\\Feature\\login.feature")
@CucumberOptions(features=".\\src\\test\\resources\\Feature\\", glue="com.healthcare.pn.ui.tests.steps")


public class TestRunner {
	

}
