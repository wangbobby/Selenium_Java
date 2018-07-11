package lessons;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {

	public static void main(String[] args) {
//		System.setProperty("webdriver.firefox.marionette", ".\\Tools\\geckodriver.exe"); 
		System.setProperty("webdriver.gecko.driver", "./Tools/geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
		WebDriver driver = new FirefoxDriver();
		
//		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.baidu.com");
		
		System.out.println("The Title Opened is: " + driver.getTitle());
		
		driver.quit();

	}

}
