package P40;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StringQiePian {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Tools/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.baidu.com");
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		driver.findElement(By.id("kw")).sendKeys("anthony-tester csdn");
		driver.findElement(By.id("su")).click();
		
		Thread.sleep(1000);
		
		WebElement result = driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/div/div[2]/span"));
		
		String resultString = result.getText();
		
		System.out.println(resultString);
		
		String st1 = resultString.split("Ô¼")[1];
		
		String searchNum = st1.split("¸ö")[0];
		
		System.out.println(searchNum);
		
		driver.quit();
	}

}
