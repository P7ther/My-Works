package seleniumCheck;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdateDrpdown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\DriverChrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n']//div//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']")).click();
		
		int i=1;
	    while(i<5) 
	    {
		    driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-k8qxaj r-d9fdf6']//div[1]//div[2]//div[3]")).click();
		    i++;
	    }
	    
	    driver.findElement(By.cssSelector(".css-1dbjc4n.r-1awozwy.r-19m6qjp.r-z2wwpe.r-1loqt21.r-18u37iz.r-1777fci.r-d9fdf6.r-1w50u8q.r-ah5dr5.r-1otgn73")).click();

	}

}

