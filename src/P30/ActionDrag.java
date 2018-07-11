package P30;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDrag {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Tools/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
		
		Thread.sleep(1000);
		
		WebElement moveEle = driver.findElement(By.id("draggable"));
		
		WebElement targetEle = driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(moveEle, targetEle).perform();
//		action.dragAndDrop(moveEle, targetEle).build().perform();
		
		assert(driver.findElement(By.xpath("//*[@id='droppable']/p[text()='Dropped!']")).isDisplayed() == true);
		

	}

}
