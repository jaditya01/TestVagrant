package Helper;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverHelper {
	public static WebDriver driver;
	
	public static void createDriver()
	{
		String path=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.accuweather.com/");
		driver.manage().window().maximize();	
		/*
		 * driver.getWindowHandles(); driver.switchTo().alert().accept();
		 */
	}
	
	public static WebDriver getInstance() {
		
		// To return the driver instance
		if(driver!=null) {
			return driver;	
		}
		else {
			Assertions.fail("Driver is not initialized");
			return null;
		}
	}
}
