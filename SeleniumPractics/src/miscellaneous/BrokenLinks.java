package miscellaneous;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException ,IOException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\DriverChrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//Broken URL
		//Step 1- Is to get all urls tied up to the links useing Selenium
		// Java method will call URL's and gets you the status code
		// If status code >400 then that url is not working-> link which tied to url is broken
		
		 List<WebElement> links=   driver.findElements(By.cssSelector("li[class='gf-li'] a"));
	      SoftAssert a =new SoftAssert();

		
		for(WebElement link:links) 
		{
			String url= link.getAttribute("href");

			HttpURLConnection   conn= (HttpURLConnection)new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respCode = conn.getResponseCode();
			System.out.println(respCode);
			a.assertTrue(respCode<400, "The link with Text"+link.getText()+" is broken with code" +respCode);
	        
//			if(respCode>400) 
//			{
//				System.out.println("The link with text" +link.getText()+" is the Broken link"+respCode);
//				Assert.assertTrue(false);
//			}

		}
		
	       a.assertAll();
	     
//		String url= driver.findElement(By.xpath("//a[contains(text(),'SoapUI')]")).getAttribute("herf");
//		
//		HttpURLConnection conn= (HttpURLConnection)new URL(url).openConnection();
//		conn.setRequestMethod("HEAD");
//		conn.connect();
//		int respCode=conn.getResponseCode();
//		System.out.println(respCode);
	
	}

	private static Object getReturnCode(WebElement link) {

	
	return null;

	}

}