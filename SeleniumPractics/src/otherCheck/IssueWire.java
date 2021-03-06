package otherCheck;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IssueWire
{
	public static void main(String[] args) throws InterruptedException 
	{
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\DriverChrome\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.manage().window().maximize();
	driver.get("https://www.issuewire.com/");
	
	driver.findElement(By.cssSelector("a[title='login']")).click();
	driver.findElement(By.id("email")).sendKeys("satyajitmahapatra@elphilltechnology.com");
	driver.findElement(By.id("password")).sendKeys("123asd");
	driver.findElement(By.id("submit-btn1")).click();
	
	driver.findElement(By.xpath("//div[contains(text(),'Add Credits')]")).click();
	
	//Switch Windows from parent to Child
	//driver.getWindowHandles() get you the window handel id of all the windows which is opened by the Automation
	Set<String> windows =driver.getWindowHandles(); //It Has ParentId And ChildId
	Iterator<String> it=windows.iterator();
	String ParentId= it.next();
	String ChildId=  it.next();
	driver.switchTo().window(ChildId);
	
	//driver.findElement(By.xpath("//select[@id='multipck_value1']")).click();
	//Select Details from Static DropDown That Present in Add Credit.
	
	 WebElement staticdropdown = driver.findElement(By.id("multipck_value1"));
     List<WebElement> value = driver.findElements(By.xpath("//select[@id='multipck_value1']//option"));
     
     for(int i=0;i< value.size();i++) 
     {
	    // Select dropdown = new Select(staticdropdown);
    	 staticdropdown.click();
    	 value.get(i).click();
    	// driver.findElement(By.xpath("//button[@id='instamojo1']")).click();
    	 driver.findElement(By.xpath("//button[contains(@class,'btn btn-custom btn-fx btn-promote paypal_pay_btn1')]")).click();
	     Thread.sleep(2000);
	     driver.navigate().back(); 
	   // driver.switchTo().window(ChildId); 
     }
	   // driver.close();
	}
	
}
