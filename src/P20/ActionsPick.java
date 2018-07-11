package P20;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsPick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");    
        
        WebDriver driver = new ChromeDriver();  
          
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);  
                                          
        driver.get("https://www.baidu.com/duty/");  
        
        WebElement stringFirst = driver.findElement(By.xpath("/html/body/center/div/div[2]/table/tbody/tr/td/p"));
        
        WebElement stringSecond = driver.findElement(By.xpath("/html/body/center/div/div[2]/table/tbody/tr/td/ul/li[1]"));
        
        Actions action = new Actions(driver);
        action.clickAndHold(stringFirst).moveToElement(stringSecond).perform();
        action.release();
	}

}
