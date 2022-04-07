package seleniumCheck;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdownCheck 
{
	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\DriverChrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		//  //a[@value='MAA']  - Xpath for Chennai 
		//  //a[@value='BLR']  - Xpath for Bangalore

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);

		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();

		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		//driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		
		System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		                 driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
     	System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		
                          Thread.sleep(3000);
	        //Count how many checkbox is there.
	//	System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
	//	driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-active']")).click();
                          driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
                          Thread.sleep(3000);
		
					
		              System.out.println("It's Working Perfectly");
		                     driver.quit();
	}
	
}
