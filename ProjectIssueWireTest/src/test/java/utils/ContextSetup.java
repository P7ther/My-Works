package utils;

import org.openqa.selenium.WebDriver;

import pageObjects.PageObjectIssueWire;

public class ContextSetup 
{
	public WebDriver driver;
	public PageObjectIssueWire pageobjectisuewire;
	public BaseTest basetest;
	public GenericUtils genericUtils;
	
 public ContextSetup() 
 
 {
	 basetest = new BaseTest();
	 pageobjectisuewire= new PageObjectIssueWire(basetest.WebDriverManger());
	 genericUtils = new GenericUtils(basetest.WebDriverManger());
	 
 }

	
	
}
