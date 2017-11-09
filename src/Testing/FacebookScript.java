package Testing;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FacebookScript {

	
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver","/Users/ivanluz/downloads/chromedriver");
		
		
		
		WebDriver driver = new ChromeDriver();
		
		
		
		Thread.sleep(5000);
		
	
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ivang201@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("diablo123");
		driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"facebook\"]/body")).click();
		
		List<WebElement> element = driver.findElements(By.xpath("//label[@class='_3rhb navigationFocus _58ak _3ct8']//input[@class='_58al' and @role='combobox']"));
		element.get(1).sendKeys("Ruth de la rosa");
		element = driver.findElements(By.xpath("//div[@class='_5l38 _42ef']//div[@class='_364g']"));
		element.get(0).click();
		Thread.sleep(3000);
		
		Robot r = new Robot();
		System.out.println("ok");
		WebElement ele = driver.findElement(By.xpath("//div//div//div//div[@class='_1mf _1mj']"));
		Actions action= new Actions(driver);
		action.contextClick(ele).build().perform();
		
		 
		 Thread.sleep(4000);
		 r.keyPress(KeyEvent.VK_DOWN);
		 Thread.sleep(2000);
		 r.keyPress(KeyEvent.VK_DOWN);
		 Thread.sleep(2000);
		 r.keyPress(KeyEvent.VK_ENTER);
		 Thread.sleep(3000);
		 r.keyPress(KeyEvent.VK_ENTER);
		 Thread.sleep(2000);
		
		 
		driver.findElement(By.xpath("//a[@class='_6gb _6gf' and @title='Elige un sticker']")).click();
		
		driver.findElement(By.xpath("//div[@aria-label='Sticker Playing, cat in a box de Pusheen']")).click();
		System.out.println("Estoy escribiendo con selenium este mensaje, ejercicio para ti mandarme un pushen por facebook, asi");
		ele.click();
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_ENTER);
		System.out.println("hola");
		
	
		
		
	}
}
