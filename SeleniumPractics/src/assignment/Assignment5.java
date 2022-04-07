package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment5 {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\DriverChrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

		//Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]/input")).click();
		String text = driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();


		//	WebElement drpdwn = driver.findElement(By.id("dropdown-class-example"));
		//  Select sel = new Select(drpdwn);
		//	sel.selectByVisibleText(text);

		WebElement dropdown=driver.findElement(By.id("dropdown-class-example"));
		Select s=new Select(dropdown);
		       s.selectByVisibleText(text);


		driver.findElement(By.id("name")).sendKeys(text);
		driver.findElement(By.id("alertbtn")).click();

		String alt = driver.switchTo().alert().getText();

		if(alt.contains(text))
		{
			System.out.println("Alert message success");
		}
		else 
		{
			System.out.println("Something wrong with execution");
		}

	  //  System.out.println( driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText());   

	}

}
