package P40;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By; 
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class FluentWait {

	public static void main(String[] args) throws Exception {  
        
        System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");  
          
        WebDriver driver = new ChromeDriver();  
          
        driver.get("www.test.com");  
        driver.manage().window().maximize();  
          
//        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)  
//                  
//                   .withTimeout(60, TimeUnit.SECONDS)  
//               
//                   .pollingEvery(2, TimeUnit.SECONDS)  
//               
//                   .ignoring(NoSuchElementException.class);  
//               
//        WebElement ele1 = wait.until(new Function<WebDriver, WebElement>() {  
//               
//             public WebElement apply(WebDriver driver) {  
//           
//               return driver.findElement(By.id("xxxxxxx"));  
//           
//             }  
//           
//           });     
          
  
    }  

}
