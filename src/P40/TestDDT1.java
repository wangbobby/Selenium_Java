package P40;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDDT1 {
//	@Test
	@Test(dataProvider="testdata")
//	public void TestLogin() throws InterruptedException{
	public void TestLogin(String username, String password) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","./Tools/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/gmail/about/");
		
		driver.findElement(By.xpath("/html/body/nav/div/a[2]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys(username);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div/div[1]/div/content/span")).click();
		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"view_container\"]")).clear();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/content/form/div[1]/div/div[1]/div/div[1]/input")).sendKeys(password);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div/div[1]/div/content/span")).click();
		Thread.sleep(3000);
	}
	
	@DataProvider(name="testdata")
	public Object[][] TestDataFeed(){
		Object[][] google = new Object[2][2];
		
		google[0][0] = "wangyymz";
		google[0][1] = "swksdbgj";
		
		google[1][0] = "nethorde";
		google[1][1] = "_99Yzkzldrx";
		
		return google;
	}

}
