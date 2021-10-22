package accuweather.Testvagrant.pages;

import org.apache.logging.log4j.core.util.Assert;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class WeatherInfoPage extends BasePage {

	@FindBy(className="header-loc")
	WebElement cityHeader;

	@FindBy(className="cur-con-weather-card__body")
	WebElement weatherDetails;

	@FindBy(className="temp")
	WebElement temperature;


	public WeatherInfoPage() {
		PageFactory.initElements(driver, this);
	}

	public void assertDisplayed () {
		try {
			wait.until(ExpectedConditions.visibilityOf(weatherDetails));
		}
		catch(Exception e)
		{
			Assertions.fail("Exception occurred : "+e.getMessage());
		}

	}

	public void verifySelectedCityAppears(String city)
	{
		String headerText=cityHeader.getText().split(",")[0];
		Assertions.assertTrue(city.equalsIgnoreCase(headerText), String.format("Page displayed is not for the city selected.Expected %s , Actual %s",
				city , headerText));
	}

	public float getTemperature()
	{
		try {
			String temp=temperature.getText().replace("\u00b0C", "");
			System.out.println("The temperature captured from UI is : "+temp);
			return Float.parseFloat(temp);
		}
		catch(NumberFormatException e)
		{
			System.err.append("Exception occured : "+e.getMessage());
			return 0;
		}
	}

}
