package P20;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindFrame {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Tools/chromedriver.exe");
		
		WebDriver driver =  new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		
		driver.get("http://data.pharmacodia.com/web/homePage/index?ns=1&ts=1&str=YWSJ");
		
		Thread.sleep(1000);
		
		// 切换到某一个frame内部  
		driver.switchTo().frame("rightMain");
		
		WebElement drugTypeHuaxue = driver.findElement(By.xpath("//*[@id='search_top']/div/div[1]/div/div/span[1]"));
		
//		WebElement drugTypeHuaxue = driver.findElement(By.xpath(".//*/span[@title='化学药']"));
		
		drugTypeHuaxue.click();
	}

}
