package FindElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Tools/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		Point targetPosition = new Point(600, 300);
		Dimension targetSize = new Dimension(1024, 768);
		driver.manage().window().setPosition(targetPosition);
		driver.manage().window().setSize(targetSize);
		
		driver.get("https://www.baidu.com");
		
		driver.findElement(By.id("kw")).sendKeys("Java");

	}

}
