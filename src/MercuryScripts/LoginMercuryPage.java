package MercuryScripts;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import mercuryObjectModel.MercuryLoginPage;

public class LoginMercuryPage {

	
	@Test
	public void validateMercuryLoginPage()
	{
		System.setProperty("webdriver.chrome.driver","/Users/ivanluz/downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		
		MercuryLoginPage loginPage = new MercuryLoginPage(driver);
		
		loginPage.typeUsername();
		loginPage.typePassword();
		loginPage.clickLoginButton();
		
		List<WebElement> webs = driver.findElements(By.xpath("//font[@color='#000000' and @size='2']"));
		String expected = webs.get(0).getAttribute("innerText");
		assertEquals("Flight Details", expected);
		
		driver.quit();
		
	}
	
}
