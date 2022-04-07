package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest 
{
	public WebDriver driver;
	
	public WebDriver WebDriverManger() 
	{
		if(driver == null) 
		{
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\Downloads\\FireFoxDriver\\geckodriver.exe");
		  driver = new FirefoxDriver();
		  driver.get("https://www.issuewire.com/");
		 
		}
		 return driver;
	}

}
