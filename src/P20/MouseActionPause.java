package P20;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionPause {
	static WebDriver driver;
	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Tools/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
//		t1();
		t2();
		
//		WebElement settings = driver.findElement(By.xpath("//*[@id='u1']/a[8]"));  
//        
//        Actions action = new Actions(driver);  
//        action.moveToElement(settings).perform();  
//          
//        driver.findElement(By.linkText("高级搜索")).click();  

	}

	public static void t1() throws InterruptedException {
		driver.get("http://www.baidu.com");
		Thread.sleep(1000);

		WebElement settings = driver.findElement(By.xpath("//*[@id=\"u1\"]/a[8]"));
		Actions action = new Actions(driver);
		action.moveToElement(settings).perform();
		driver.findElement(By.linkText("高级搜索")).click();
	}
	
	public static void t2() {
		driver.get("https://www.baidu.com");
		WebElement inputBox = driver.findElement(By.id("kw"));
		inputBox.sendKeys("selenium a");
		
//		WebElement autoText = driver.findElement(By.xpath("//*[@id=\"form\"]/div/ul/li[2]"));
		WebElement autoText = driver.findElement(By.xpath("//*[@id='form']/div/ul/li[@data-key='selenium api文档']"));
		Actions action = new Actions(driver);
		action.moveToElement(autoText).click().perform();
	}
}
