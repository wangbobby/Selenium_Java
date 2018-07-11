package P40;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import POM.GoogleMail;

public class TestWithPOM {
	WebDriver driver;
	
	@BeforeClass
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Tools/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/gmail/about/");
		Thread.sleep(2000);
	}
	
	@Test
	public void testLogin() throws InterruptedException {
		GoogleMail gm = PageFactory.initElements(driver, GoogleMail.class);
		gm.login("wangyymz", "swksdbgj");
	}
	
	@AfterClass
	public void finish() {
		driver.quit();
	}
}
