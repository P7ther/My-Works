package stepDefinations;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utils.ContextSetup;

public class Hooks 
{
	ContextSetup contextsetup;
	
	public Hooks(ContextSetup contextsetup)
	{
		this.contextsetup=contextsetup;
	}
	
	@After
	public void Afterscenario()
	{
		
		contextsetup.basetest.WebDriverManger().quit();
	}
	
	@AfterStep
	public void AddScreenshot(Scenario scenario) throws IOException 
	{
		WebDriver driver =contextsetup.basetest.WebDriverManger();
		if(scenario.isFailed()) 
		{
			//Screenshort Code
			File Sourcepath=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//	byte[] fileContent= FileUtils.readFileToByteArray(Sourcepath);
		//	scenario.attach(fileContent, "image/png", "Image");
			
		}
	}
	

}
