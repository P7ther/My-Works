package actionClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\DriverChrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companions");
		
		
		driver.findElement(By.xpath(".//*[@id='travel_date']")).click();
		
		//While Loop will keep on executing untill it becomes false
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("November")) 
		{
			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
		}
		
		//Grab the common attribute
		//Put into list and iterate
		List<WebElement> dates = driver.findElements(By.className("day"));
		             int count = driver.findElements(By.className("day")).size();
		
		for(int i=1;i<count;i++) 
		{
			String text = driver.findElements(By.className("day")).get(i).getText();
			if(text.equalsIgnoreCase("30")) 
			{
				driver.findElements(By.className("day")).get(i).click();
				break;
			}
			
		}
		
	}

}
