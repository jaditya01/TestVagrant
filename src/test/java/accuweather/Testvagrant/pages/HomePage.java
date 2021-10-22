package accuweather.Testvagrant.Pages;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage{


	@FindBy(className="search-input")
	WebElement searchBar;

	@FindBy(className="results-container")
	WebElement searchResultList;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public String getTitle() {
		return driver.getTitle();
	}

	public void clickOnSearchBar() {
		wait.until(ExpectedConditions.elementToBeClickable(searchBar));
		searchBar.click();	
	}

	public void searchForCityt(String city)
	{
		searchBar.sendKeys(city);
		wait.until(ExpectedConditions.visibilityOf(searchResultList));
		WebElement cityEle=getResultElement(city);
		cityEle.click();
	}

	public WebElement getResultElement(String city)
	{
		WebElement element = null;
		try {
			for(int i=1;i<=5;i++)
			{
				WebElement cityElement=driver.findElement(By.xpath("//div[@class='search-bar-result search-result']["+i+"]"));
				String name=cityElement.getText().split(",")[0];
				if(city.equalsIgnoreCase(name))
				{
					element=cityElement;
					break;
				}
				else
				{
					Assertions.fail("City passed : "+city+" is not present in the list");
				}
			}
		}catch(Exception e)
		{
			System.err.append("Exception occurred : "+e.getMessage());
		}
		return element;
	}
}