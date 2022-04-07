package assignment;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) 
	{
      
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\DriverChrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		
		
		driver.findElement(By.linkText("Multiple Windows")).click();
		
		driver.findElement(By.cssSelector("a[href='/windows/new']")).click();
		
		//Switch Windows from parent to Child
		//driver.getWindowHandles() get you the window handel id of all the windows which is opened by the Automation
		Set<String> windows =driver.getWindowHandles(); //It Has ParentId And ChildId
		Iterator<String> it=windows.iterator();
		String ParentId=it.next();
		String ChildId=it.next();
		driver.switchTo().window(ChildId);
		
		System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'New Window')]")).getText());
		
		
		driver.switchTo().window(ParentId);
		System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText());

		
		driver.close();
					
		
	}

}
