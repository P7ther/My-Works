package stepDefinations;


import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.IssuePage;
import pageObjects.PageObjectIssueWire;
import utils.ContextSetup;

public class IssueWireStepDefination 
{
	public WebDriver driver;
	ContextSetup contextsetup;
	public IssuePage issuepage;
	PageObjectIssueWire pageobjectissuewire;
	
 public IssueWireStepDefination(ContextSetup contextsetup)
	{
		this.contextsetup=contextsetup;
	}
	
	 @Given("User is on HomePage and click on Login button")
	    public void user_is_on_homepage_and_click_on_login_button() 
	    {
		 //System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\Downloads\\FireFoxDriver\\geckodriver.exe");
		 // contextsetup.driver = new FirefoxDriver();
		 //  contextsetup.driver.get("https://www.issuewire.com/");
		 //contextsetup.driver.findElement(By.cssSelector("a[title='login']")).click();
		 //issuepage = new IssuePage(contextsetup.driver);

		 // issuepage =contextsetup.pageobjectisuewire.GetIssueWire();
		 //  pageobjectissuewire = new PageObjectIssueWire(contextsetup.driver);
		 
		 IssuePage issuepage=contextsetup.pageobjectisuewire.GetIssueWire(); 
		 issuepage.ClickLoginBtn();
		 System.out.println("It's Working ");
		 
		 /*
		  * System.setProperty("webdriver.chrome.driver",
		  * "C:\\Users\\Admin\\Downloads\\chromedriver\\chromedriver.exe"); driver = new
		  * ChromeDriver(); driver.get("https://www.issuewire.com/");
		  * driver.findElement(By.cssSelector("a[title='login']")).click();
		  */
	   }

	    @When("User login into application {string} and Password {string} details")
	    public void user_login_into_application_something_and_password_something(String UserName, String PassWord) 
	    {
	    	System.out.println(UserName);
	    	System.out.println(PassWord);
	    	//contextsetup.driver.findElement(By.xpath("//input[@id='email']")).sendKeys(UserName);	 
	    	//contextsetup.driver.findElement(By.xpath("//input[@id='password']")).sendKeys(PassWord);
	    	//issuepage = new IssuePage(contextsetup.driver);
	    	
	    	//issuepage =contextsetup.pageobjectisuewire.GetIssueWire();
	    	// pageobjectissuewire = new PageObjectIssueWire(contextsetup.driver);
	    	IssuePage issuepage= contextsetup.pageobjectisuewire.GetIssueWire(); 
	    	issuepage.LoginDetails(UserName, PassWord);
	    }

	    @Then("^Click on Login button and Dashboard is showing$")
	    public void click_on_login_button_and_dashboard_is_showing() 
	    {
	    	//contextsetup.driver.findElement(By.xpath("//input[@id='submit-btn1']")).click();
	        // issuepage = new IssuePage(contextsetup.driver);
	    	
	    	//  issuepage =contextsetup.pageobjectisuewire.GetIssueWire();
	    	//  pageobjectissuewire = new PageObjectIssueWire(contextsetup.driver);
	    	  IssuePage  issuepage=contextsetup.pageobjectisuewire.GetIssueWire(); 
	    	  issuepage.SubmitButton();
	    	  issuepage.getPageTitle();
	    	//  contextsetup.driver.getTitle().contains("Submit Your Press Release | Press Release Distribution Software");
	    }

	    @And("^User Click on Add Credit Details and Click on Dropdown of Add Credit$")
	    public void user_click_on_add_credit_details_and_select_details_from_dropdown() throws InterruptedException
	    {
	    	// issuepage = new IssuePage(contextsetup.driver);
	    	//  issuepage =contextsetup.pageobjectisuewire.GetIssueWire();
	    	//  pageobjectissuewire = new PageObjectIssueWire(contextsetup.driver);
	    	
	    	SwitchMethodDetails() ;
	    	Thread.sleep(5000);
	    	IssuePage issuepage =contextsetup.pageobjectisuewire.GetIssueWire();
	    	issuepage.SelectDropDwn();

	    	//contextsetup.genericUtils.SelectFromDropDown();
	    	// issuepage.SelectDropDwn();
	    	//contextsetup.driver.findElement(By.xpath("//div[contains(text(),'Add Credits')]")).click();
	    	//.btn.btn-primary
	    	
	    }
	    	
	     public void SwitchMethodDetails() 
	     {
	    	 IssuePage  issuepage=contextsetup.pageobjectisuewire.GetIssueWire(); 
             issuepage.ClickOnAddCredit();
            contextsetup.genericUtils.SwitchToMethod();
	     }
	    
	    
}
