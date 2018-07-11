package FindElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementByLinkText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Tools/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.baidu.com");
		
		driver.findElement(By.linkText("ÐÂÎÅ")).click();
		
		Thread.sleep(2000);
		
		System.out.println(driver.getCurrentUrl());
		
		assert driver.getCurrentUrl().equals("http://news.baidu.com/");
	}

}
