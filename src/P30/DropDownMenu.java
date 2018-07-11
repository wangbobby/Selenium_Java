package P30;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownMenu {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");    
        
        WebDriver driver = new ChromeDriver();       
         
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);  
            
        driver.get("http://jqueryui.com/resources/demos/selectmenu/default.html");    
         
        Thread.sleep(2000);  
        
        driver.findElement(By.xpath("//*[@id=\"speed-button\"]/span[2]")).click();
        
        List<WebElement> list =  driver.findElements(By.xpath("//*[@id=\"speed-menu\"]/li/div"));

        for(WebElement ele: list) {
        	if(ele.getAttribute("innerHTML").equals("Fast")) {
        		ele.click();
        		break;
        	}
        }
	}

}
