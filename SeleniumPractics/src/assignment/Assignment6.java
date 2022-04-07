package assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment6 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\DriverChrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//[class='table-display'] tr  \
	    WebElement table = driver.findElement(By.id("product"));
		System.out.println(table.findElements(By.tagName("tr")).size());
		System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());
		System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());

		List<WebElement> secondrow=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));

		System.out.println(secondrow.get(0).getText());
		System.out.println(secondrow.get(1).getText());
		System.out.println(secondrow.get(2).getText());
		
			
  //   System.out.println(driver.findElements(By.cssSelector("[class='table-display'] tr")).size());
  //   System.out.println(driver.findElements(By.cssSelector("[class='table-display'] tr")).get(0).findElements(By.tagName("th")).size());
  //   List<WebElement> secondrow = driver.findElements(By.cssSelector("[class='table-display'] tr")).get(2).findElements(By.tagName("td"));
		
  //   System.out.println(secondrow.get(0).getText());
  //   System.out.println(secondrow.get(1).getText());
  //   System.out.println(secondrow.get(2).getText());
	}

}




