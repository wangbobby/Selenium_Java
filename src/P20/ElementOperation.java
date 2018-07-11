package P20;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementOperation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Tools/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://www.jd.com/");
		
		Thread.sleep(1000);
		
		WebElement phoneLink = driver.findElement(By.linkText("手机"));
		
		phoneLink.click();
		Thread.sleep(1000);
		
		//current handler
		String handler = driver.getWindowHandle();

		//get all handlers
		for(String handlers: driver.getWindowHandles()) {
			if(handlers.equals(handler))
				continue;
			driver.switchTo().window(handlers);
		}
		
		WebElement xiaomiLink = driver.findElement(By.linkText("小米"));
		xiaomiLink.click();
		Thread.sleep(1000);
	}

}
