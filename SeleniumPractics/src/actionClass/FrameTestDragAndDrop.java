package actionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameTestDragAndDrop {

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\DriverChrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")))	;	
		driver.findElement(By.id("draggable")).click();
		
		WebElement target = driver.findElement(By.id("draggable"));
		WebElement source = driver.findElement(By.id("droppable"));	
		
		Actions a = new Actions(driver);
		a.dragAndDrop(target, source).build().perform();
		

	}

}
