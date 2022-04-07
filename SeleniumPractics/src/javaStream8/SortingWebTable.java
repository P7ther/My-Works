package javaStream8;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SortingWebTable 
{
	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\DriverChrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		//Click on the column
		driver.findElement(By.xpath("//tr/th[1]")).click();
		//Capture all webelements into list
		List<WebElement>elements=driver.findElements(By.xpath("//tr/th[1]"));
		//capture text of all webelements into new(original) list
		List<String>orginalList=elements.stream().map(s->s.getText()).collect(Collectors.toList());
		//sort on the orginal list of step 3
		List<String>ShortedList=orginalList.stream().sorted().collect(Collectors.toList());
		//compare orginal list vs sorted list
		Assert.assertTrue(orginalList.equals(ShortedList));
		System.out.println("Working Perfectly");
		
		
		
		
		
		
		
		
		
	}

}