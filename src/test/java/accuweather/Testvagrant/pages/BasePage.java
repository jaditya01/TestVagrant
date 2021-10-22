package accuweather.Testvagrant.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import Testvagrant.Helper.DriverHelper;

public class BasePage {
	
	public static WebDriverWait wait;
	public static WebDriver driver;
	

	@FindBy(className="accuweather-logo")
	WebElement siteLogo;
	
	public BasePage()
	{
		driver=DriverHelper.getInstance();
		wait = new WebDriverWait(driver,30);
	}

	public void verySiteLogo() {	
		Assertions.assertTrue(siteLogo.isDisplayed());
	}
	
	public void clickSiteLogo()
	{
		siteLogo.click();
	}
}
