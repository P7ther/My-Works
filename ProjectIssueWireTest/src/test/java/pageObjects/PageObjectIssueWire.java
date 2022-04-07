package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectIssueWire 
{
  public WebDriver driver;
  public  IssuePage issuepage;
	
	public PageObjectIssueWire(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	public IssuePage GetIssueWire() 
	{
		issuepage = new IssuePage(driver);
		 return issuepage;
	}
}
