	package cucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//We Can generate some Reports
//Html,xml,json,junit,extent
//tags="@PlaceOrder",

@CucumberOptions(features="src/test/java/features",
    glue="finalChecking", monochrome=true,   
    plugin= {"html:target/cucumber.html","html:target/cucumber.json",
    		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class TestNGTestRunner extends AbstractTestNGCucumberTests 
{
    @Override
	@DataProvider(parallel=true)
	public Object[][] scenarios()
	{
		
		return super.scenarios();
	}
	
}
