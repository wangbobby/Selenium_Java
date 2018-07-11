package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NonePom {
	
	WebDriver driver;
	
	@BeforeClass
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Tools/chromedriver.exe");
		driver = new ChromeDriver();
//		driver.get("https://www.jd.com/");
		driver.get("https://www.google.com/gmail/about/");
		Thread.sleep(1000);
	}
	
	@Test
	public void testLogin() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/nav/div/a[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("wangyymz");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div/div[1]/div/content/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/content/form/div[1]/div/div[1]/div/div[1]/input")).sendKeys("swksdbgj");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div/div[1]/div/content/span")).click();
		Thread.sleep(1000);
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
