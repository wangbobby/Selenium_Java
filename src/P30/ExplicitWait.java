package P30;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Tools/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		long startTime = System.currentTimeMillis();
		
		driver.get("https://www.icloud.com/");
		
		WebDriverWait wait = new WebDriverWait(driver, 1);
		
		driver.switchTo().frame("auth-frame");
		
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='appleId']")));
		
		boolean status = element.isDisplayed();
		
		if(status) {
			System.out.println("----Element is visible...----");
		}
		else
			System.out.println("----Element is invisible...----");

	}

}
