package deepConcept;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreenKart 
{
	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\DriverChrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		String[] items = {"Cucumber" ,"Brocolli","Beetroot","Tomato"};
		List<WebElement> products =driver.findElements(By.cssSelector("h4.product-name"));
		int j=0;

		for(int i=0;i<products.size();i++) 
		{
			//String name =products.get(i).getText();

			String[] name =products.get(i).getText().split("-");
			String FormattedName=name[0].trim();

			// Format it to get actual vegetable name
			//Convert array into array list for easy Search
			//Check Whether name you extract is present in ArrayList or not-
			List itemsNeedList=Arrays.asList(items);
             
			
			if(itemsNeedList.contains(FormattedName)) 
			{
				j++;
				//Click on Add to Cart
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				//break;
				//user can't user Break concept when user going with multiple array
				if(j==items.length) 
				{
					break;
				}
			}
		}

            driver.close();
	}
}
