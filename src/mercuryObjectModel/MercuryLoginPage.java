package mercuryObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MercuryLoginPage {
	
	WebDriver driver;
	
	By username = By.name("userName");
	By password = By.xpath("//input[@name='password']");
	By loginButton = By.name("login");
	
	public MercuryLoginPage(WebDriver driver)
	{
		this.driver = driver;
		
	}
	
	public void typeUsername()
	{
		driver.findElement(username).sendKeys("tutorial");
	}
	
	public void typePassword()
	{
		driver.findElement(password).sendKeys("tutorial");
	}
	
	public void clickLoginButton()
	{
		driver.findElement(loginButton).click();
	}

}
