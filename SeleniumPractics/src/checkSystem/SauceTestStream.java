package checkSystem;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SauceTestStream 
{
	
	@Test
	public void  maxPriceStreamTest() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		          driver.get("https://www.saucedemo.com/");
		          
		          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		          driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		          driver.manage().window().maximize();
				  driver.manage().deleteAllCookies();
		          
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		driver.findElement(By.id("login-button")).click();
		
		List<WebElement> priceList = driver.findElements(By.className("inventory_item_price"));
		
		double maxprice = priceList
				.stream()
				.mapToDouble(e -> Double.parseDouble(e.getText().trim().replace("$", "")))
				.max()
				.getAsDouble();
		
		System.out.println(maxprice);
		String xpath="//div[normalize-space()='$"+maxprice+"']/following-sibling::button[text()='Add to cart']";
		driver.findElement(By.xpath(xpath)).clear();
		
				

		
		
	}

}
