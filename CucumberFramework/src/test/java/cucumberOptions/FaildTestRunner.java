package cucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="@target/failed_scenarios.txt",
glue="finalChecking", monochrome=true,   
plugin= {"html:target/cucumber.html","html:target/cucumber.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class FaildTestRunner  extends AbstractTestNGCucumberTests 
{
	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios()
	{
		
		return super.scenarios();
	}
	

}
