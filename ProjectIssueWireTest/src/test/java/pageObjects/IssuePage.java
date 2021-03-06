package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class IssuePage 
{
	public WebDriver driver;
	
	public IssuePage(WebDriver driver) 
	{
	    this.driver=driver;
	}

	By LoginBtn =By.cssSelector("a[title='login']");
	By username =By.xpath("//input[@id='email']");
	By password =By.xpath("//input[@id='password']");
	By submitbtn =By.xpath("//input[@id='submit-btn1']");
	By addcrdit =By.xpath("//div[contains(text(),'Add Credits')]");
	By drpdwn   =By.cssSelector("select[id='multipck_value1']");
	By dropdwn  =By.xpath("//select[@id='multipck_value1']");
	By copun    =By.xpath("//span[@id='span11']");
	By Submtbtn =By.xpath("//button[contains(@class,'btn btn-custom btn-fx btn-promote paypal_pay_btn1')]");
	By instaSubmit =By.cssSelector("[class=' btn btn-custom btn-fx btn-promote instamojo_pay1']");
	
	 public void ClickLoginBtn() 
	 {
		 driver.findElement(LoginBtn).click();
	 }
	 
	 public void LoginDetails(String usname ,String Pwd) 
	 {
		 driver.findElement(username).sendKeys(usname);
		 driver.findElement(password).sendKeys(Pwd);
	 }
	
	 public void SubmitButton() 
	 {
		 driver.findElement(submitbtn).click();
	 }
	
	 public void ClickOnAddCredit() 
	 {
		driver.findElement(addcrdit).click();
		// driver.findElement(Pressrls).click();
	 }
	 
	 public void getPageTitle() 
	 {
		 driver.getTitle().contains("Submit Your Press Release | Press Release Distribution Software");
	 }
	 
	
	 public void SelectDropDwn() throws InterruptedException 
	 {
		 //Javascript executer for click on dropdown
		 
		 driver.findElement(dropdwn).click();    
		 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", driver.findElement(By.xpath("//select[@id='multipck_value1']/option[3]")));
		 
		 //  driver.findElement(copun).click();
		 Thread.sleep(5000);
		 System.out.println("Section is Working");
		 driver.findElement(instaSubmit).click();
		 // Select Details from Static DropDown That Present in Add Credit.
		  
		 //    WebElement Staticdropdown = driver.findElement(dropdwn);
		 //    Select Dropdown = new Select(Staticdropdown);
		 //    Dropdown.selectByIndex(2);
		  
	 }
	 
}
