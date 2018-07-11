package P30;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CombinedKey {

	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.gecko.driver", ".\\Tools\\geckodriver.exe");  
		System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");  
        
//        WebDriver driver = new FirefoxDriver();  
		WebDriver driver = new ChromeDriver(); 
          
        driver.get("https://www.baidu.com");  
        
//        driver.findElement(By.xpath("//body")).sendKeys(Keys.chord(Keys.CONTROL, "a"));
//        Thread.sleep(2);
//        driver.findElement(By.xpath("//body")).sendKeys(Keys.chord(Keys.CONTROL, "t"));
        
//        driver.findElement(By.xpath("//body")).sendKeys(Keys.chord(Keys.CONTROL, "a"));  
//        Thread.sleep(1000);  
//        driver.findElement(By.xpath("//body")).sendKeys(Keys.chord(Keys.CONTROL, "t")); 
        driver.findElement(By.xpath("//body")).sendKeys(Keys.chord(Keys.CONTROL, "t"));
        Thread.sleep(1000);
        
	}

}
