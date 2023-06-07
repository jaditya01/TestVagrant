package String_Prepration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Demo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//Aditya//Desktop//chromedriver_win32 (2)//chromedriver.exe");

     WebDriver driver  = new ChromeDriver();

      driver.get("https://www.google.com");
      
      driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Test");
      
     // driver.findElement(By.xpath("//body[@jsmodel='hspDDf']")).click();
      
       driver.findElement(By.xpath("(//*[@value=\"Google Search\"])[1]")).sendKeys(Keys.ENTER);
       

	}

}
