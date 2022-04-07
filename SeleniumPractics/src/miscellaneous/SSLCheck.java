package miscellaneous;

import java.time.Duration;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLCheck {

	public static void main(String[] args)
	{
		ChromeOptions options = new ChromeOptions();
		
		Proxy proxy = new Proxy();
		proxy.setHttpProxy("117.247.65.152:8080");
		options.setCapability("proxy", proxy);
		
		options.setAcceptInsecureCerts(true);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\DriverChrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://expired.badssl.com/");
		
		System.out.println(driver.getTitle());
	}

}
