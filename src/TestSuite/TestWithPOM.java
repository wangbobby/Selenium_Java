package TestSuite;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import POM.PageFactoryPOM;

public class TestWithPOM {
  
	WebDriver driver;
	
	@BeforeClass
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Tools/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.jd.com/");
		Thread.sleep(2000);
	}
  
	@Test
	public void testLogin() {
		PageFactoryPOM pfp = PageFactory.initElements(driver, PageFactoryPOM.class);
		pfp.login("user1", "123456");
	}

	@AfterClass
	public void afterClass() {
	}

}
