package actionClass;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandels {

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\DriverChrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");

		
		//Now Driver is on Parent page only
		driver.findElement(By.cssSelector(".blinkingText")).click();
		
		//Switch Windows from parent to Child
		//driver.getWindowHandles() get you the window handel id of all the windows which is opened by the Automation
		Set<String> windows =driver.getWindowHandles(); //It Has ParentId And ChildId
		Iterator<String> it=windows.iterator();
		String ParentId=it.next();
		String ChildId=it.next();
		driver.switchTo().window(ChildId);
		
	
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		
		driver.findElement(By.cssSelector(".im-para.red")).getText();
		String EmailId=driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		
		driver.switchTo().window(ParentId);
		driver.findElement(By.id("username")).sendKeys(EmailId);
		

	}

}
