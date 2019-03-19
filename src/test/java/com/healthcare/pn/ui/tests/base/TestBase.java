package com.healthcare.pn.ui.tests.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestBase {
	public static WebDriver driver;
	
	public WebDriver initializeDriver() throws IOException {
	Properties prop=new Properties();
	FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\data.properties");
	
	prop.load(fis);
	prop.getProperty("browser");
	String browserName=prop.getProperty("browser");
	
	if(browserName.equalsIgnoreCase("chrome"))
			{
		System.out.println("Open chrome Browser");
		System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe" );		
		driver=new ChromeDriver();
		
		
		//driver.get("http://www.qaclickacademy.com/");
			}
	
			else if (browserName.equalsIgnoreCase("firefox")) {
				//System.out.println("Open FireFox Browser");
				//driver=new FirefoxDriver();
			}
	
			else if (browserName.equalsIgnoreCase("ie")) {
				System.out.println("Open InternetExplorer driver");
			}
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
	return driver;
	}//end method
	
/*
	@BeforeClass
	public static void init() {
		System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe" );		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://opensource.demo.orangehrmlive.com/");

	}//end method 
*/
}//end class


