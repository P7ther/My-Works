package seleniumCheck;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class EndToEndTest {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\DriverChrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		// It Will Open the From dropdown box and select the Details
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']"))
				.click();

		// it Will Select the current date from calender section
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		Thread.sleep(3000);

		// It will click the CheckBox of the Friedns And family
		System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());

		// Click on the Passanger Details
		driver.findElement(By.id("divpaxinfo")).click();
		int i = 1;
		while (i < 5) {
			driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
			i++;
		}
		driver.findElement(By.id("btnclosepaxoption")).click();

		// Check the Return date Details.
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
			System.out.println("It's Enabled");
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

		// Select the Currency Details from dropdown
		WebElement staticdropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticdropdown);
		dropdown.selectByIndex(1);
		System.out.println(dropdown.getFirstSelectedOption().getText());

		// Click on Search Button
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_btn_FindFlights']")).click();

		System.out.println(" Code is Working Perfectly");
		driver.quit();

	}

}
