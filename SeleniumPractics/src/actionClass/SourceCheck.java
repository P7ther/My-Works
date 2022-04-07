package actionClass;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SourceCheck
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\DriverChrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");


		System.out.println(driver.findElements(By.tagName("a")).size());

		// Limiting The WebDriver Scope
		WebElement footerdriver=driver.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());

		// Click on The First coloumn and get the Link Data
		WebElement coloumndriver=footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(coloumndriver.findElements(By.tagName("a")).size());

		// Click on the each link in the coloumn and check if the pages are opening.
		for(int i=1;i<coloumndriver.findElements(By.tagName("a")).size();i++) 
		{
			String clickonLink=Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			
			coloumndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonLink);
			Thread.sleep(5000);
		}
		
		//  Open all the tabs
		//  Go to each Tab grab the title of that Page.
		
			    Set<String> abc = driver.getWindowHandles();
			Iterator<String> it = abc.iterator();
			
			//Here "hasNext" is saying that Next index is present or not
			while(it.hasNext()) 
			{
				driver.switchTo().window(it.next());
				
			//	System.out.println(driver.getTitle());
			}

	}



		//driver.quit();
}


