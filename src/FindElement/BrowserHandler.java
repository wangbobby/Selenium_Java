package FindElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrowserHandler {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Tools/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://www.baidu.com");
		
		Thread.sleep(1000);
		
		WebElement setHome_link = driver.findElement(By.partialLinkText("ÉèÎªÖ÷Ò³"));
		
		System.out.println(setHome_link);
		
		setHome_link.click();
		
		Thread.sleep(1000);
		
		System.out.println(driver.getWindowHandles());
	}

}
