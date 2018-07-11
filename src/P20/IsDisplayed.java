package P20;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
//		driver.get("https://www.sohu.com");
		driver.get("https://mail.sohu.com/fe/#/login");
		Thread.sleep(1000);
		
//		WebElement mailLink = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[3]/ul/li[3]/a"));
//		
//		mailLink.click();
		
//		driver.findElement(By.xpath("//*[@id=\"theme\"]/form/div[1]/div[1]/input")).sendKeys("wangyanyao@sohu.com");;
//		driver.findElement(By.xpath("//*[@id=\"theme\"]/form/div[2]/div[1]/input")).sendKeys("_S5k3dbgj");
//		driver.findElement(By.xpath("//*[@id=\"theme\"]/form/div[5]/input")).click();
		
//		driver.switchTo().frame("mailFrame");
//		driver.findElement(By.className("ipt-box pos-r")).sendKeys("wangyanyao@sohu.com");
		driver.findElement(By.className("addFocus ipt-account ng-pristine ng-valid")).sendKeys("asdfasdf");
//		driver.findElement(By.xpath("//*[placeholder='«Î ‰»Îƒ˙µƒ” œ‰']")).sendKeys("wangyanyao@sohu.com");
//		driver.findElement(By.xpath("//*[placeholder='«Î ‰»Îƒ˙µƒ√‹¬Î']")).sendKeys("_S5k3dbgj");
//		driver.findElement(By.xpath("//*[@id=\"theme\"]/form/div[5]/input")).click();
//		Thread.sleep(2000);

	}

}
