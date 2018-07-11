package P40;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Reporter;
//import org.testng.annotations.Test;
//
//public class TestReportLog {
//	
//	@Test
//	public void testReport() {
//		
//	System.setProperty("webdriver.chrome.driver", "./Tools/chromedriver.exe");
//	WebDriver driver = new ChromeDriver();
//	
//	Reporter.log("Launch Chrome browser instance");
//	
//	driver.manage().window().maximize();
//	
//	Reporter.log("Max the Browser");
//	
//	driver.get("http://www.baidu.com");
//	
//	Reporter.log("Open baidu site");
//	
//	driver.quit();
//	
//	Reporter.log("Quit Browser");
//	
//	}
//	
//}


public class TestReportLog{
	@Test
	public void testReport() {
		System.setProperty("webdriver.chrome.driver", "./Tools/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		Reporter.log("Launch Chrome browser instance");
		
		driver.manage().window().maximize();
		Reporter.log("Max the browser");
		
		driver.get("https://www.baidu.com");
		Reporter.log("Open Baidu Website");
		
		driver.quit();
		Reporter.log("Quit browser");
	}
}