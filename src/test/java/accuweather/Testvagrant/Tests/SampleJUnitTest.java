package accuweather.Testvagrant.Tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import accuweather.Testvagrant.Helper.DriverHelper;
import accuweather.Testvagrant.Helper.NumberUtilHelper;
import accuweather.Testvagrant.Helper.RestAssuredHelper;
import accuweather.Testvagrant.Pages.HomePage;
import accuweather.Testvagrant.Pages.WeatherInfoPage;

public class SampleJUnitTest {




	@BeforeEach
	public void beforeTest()
	{
		DriverHelper.createDriver();
	}

	@Test
	public void verifyTemperature() {

		String city="Bhopal";
		int variance=2;

		HomePage homepage =new HomePage();
		WeatherInfoPage infoPage=new WeatherInfoPage();
		NumberUtilHelper numHelper=new NumberUtilHelper();

		homepage.clickOnSearchBar();
		homepage.searchForCityt(city);
		infoPage.assertDisplayed(); 
		infoPage.verifySelectedCityAppears(city); 
		float uiTemp=infoPage.getTemperature();

		float apiTemp=RestAssuredHelper.getTemperature(city);
		if(numHelper.getVariance(uiTemp, apiTemp)<=variance)
		{
			System.out.println("The difference in temperature recorded is within the variance of 2°C ");
		}
		else
		{
			System.err.append("The difference in temperature recorded is beyond the variance of 2°C ");
		}
	}


	@AfterEach
	public void afterTest()
	{
		DriverHelper.getInstance().close();
	}

}
