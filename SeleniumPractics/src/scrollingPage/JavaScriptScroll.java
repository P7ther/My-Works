package scrollingPage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class JavaScriptScroll {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\DriverChrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		// For Scroll down the screen 
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,650)");
		Thread.sleep(5000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=500");
		
		
		// For Count Total amount that present in that box
		List<WebElement> value=driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int sum=0;
		for(int i=0;i<value.size();i++) 
		{
	       sum =sum+Integer.parseInt(value.get(i).getText());
		}
		
		System.out.println(sum);

		
		//Matching the Total value with Table value
		System.out.println(driver.findElement(By.cssSelector("[class='totalAmount']")).getText());
		int total=Integer.parseInt(driver.findElement(By.cssSelector("[class='totalAmount']")).getText().split(":")[1].trim());
		
		if(sum==total) 
		{
			System.out.println("pass");
		}else 
		{
			System.out.println("fail");
		}
		
		Assert.assertEquals(sum, total);

	}

}
