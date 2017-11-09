package Testing;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/Users/ivanluz/downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		
		for (int i = 1; i < 10; i++) 
		{
			driver.get("https://alpha.intelius.com/dir/state");
			driver.findElement(By.cssSelector("#pagecontent > div:nth-child(1) > div.large-12.small-12.margin-top > ul > li:nth-child("+i+") > a")).click();
			
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			Thread.sleep(5);
			
		}
		
		driver.quit();
	}

}
