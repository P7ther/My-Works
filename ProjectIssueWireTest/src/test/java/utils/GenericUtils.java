package utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GenericUtils
{
	public WebDriver driver;

	public GenericUtils(WebDriver driver) 
	{
		this.driver=driver;
	}

	public void SwitchToMethod() 
	{
		//Switch Windows from parent to Child
		//driver.getWindowHandles() get you the window handel id of all the windows which is opened by the Automation.
		
		//It Has ParentId And ChildId.
		Set<String> windows =driver.getWindowHandles(); 
		Iterator<String> it=windows.iterator();
		String ParentId=it.next();
		String ChildId=it.next();
		driver.switchTo().window(ChildId);
		
		System.out.println("Satyajit Mohapatra");
	}



}
