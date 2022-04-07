package assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 
{

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\DriverChrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("autocomplete")).sendKeys("Ind");
		Thread.sleep(3000);
		
		List<WebElement> options=driver.findElements(By.cssSelector("li[class='ui-menu-item'] div"));
		
		for(WebElement option:options) 
		{
			if(option.getText().equalsIgnoreCase("India")) 
			{
				option.click();
				break;
			}
		}
		
	}
	
}

//driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
//	driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
	
//	System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));
	