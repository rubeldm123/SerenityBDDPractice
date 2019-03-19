package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import org.openqa.selenium.By;

public class portalHomepage {
	public WebDriver driver;
	
	By searchBox=By.cssSelector("[id*='search-courses']");
	
	public portalHomepage(WebDriver driver) {
		this.driver=driver;
		
	}
	
	//By login=By.cssSelector("[value='Log In']");
	
	public WebElement getSearchBox() {
		return driver.findElement(searchBox);
	}

}
