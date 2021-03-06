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
		List<WebElement>elements=driver.findElements(By.xpath("//tr/td[1]"));
		//capture text of all webelements into new(original) list
		List<String>orginalList=elements.stream().map(s->s.getText()).collect(Collectors.toList());
		//sort on the orginal list of step 3
		List<String>ShortedList=orginalList.stream().sorted().collect(Collectors.toList());
		//compare orginal list vs sorted list
		Assert.assertTrue(orginalList.equals(ShortedList));

		List<String>price;
		//Scan the name column with getText->Beans->print the price of the rice
		do
		{
		List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));
		price=rows.stream().filter(s->s.getText().contains("Rice"))
				.map(s->getVagePrice(s)).collect(Collectors.toList());
		price.forEach(a->System.out.println(a));
		
		if(price.size()<1) 
		{
			driver.findElement(By.cssSelector("[aria-label='Next']")).click();
		}
		}while(price.size()<1);
		
		
	}

	private static String getVagePrice(WebElement s) 
	{
		String pricevalue=s.findElement(By.xpath("following-sibling::td[1]")).getText();		
		return pricevalue;
	}

}
