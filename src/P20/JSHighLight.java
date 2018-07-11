package P20;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JSHighLight {

	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");    
//        
//        WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver", "./Tools/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
        
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  
        
        driver.get("https://www.baidu.com/");    
         
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//*[@id='u1']/a[7]")).click();  
        Thread.sleep(500); 

        driver.findElement(By.id("TANGRAM__PSP_10__footerULoginBtn")).click();
        Thread.sleep(500);
        WebElement username = driver.findElement(By.id("TANGRAM__PSP_10__userName"));  
        
        // 创建一个JavascriptExecutor对象  
        JavascriptExecutor js= (JavascriptExecutor)driver;  
          
        username.sendKeys("abcdefg");  
        // 设置颜色  
        js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",username);  
          
        WebElement password = driver.findElement(By.id("TANGRAM__PSP_10__password"));  
        js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",password);  
	}

}
