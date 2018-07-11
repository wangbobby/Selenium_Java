package P30;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlerDate {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");    
        
        WebDriver driver = new ChromeDriver();     
         
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        
        driver.get("http://jqueryui.com/resources/demos/datepicker/default.html");  
        
        Thread.sleep(1000); 
 /**       
        WebElement date_inputbox = driver.findElement(By.id("datepicker"));
        
        date_inputbox.click();
        
//        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();
//        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[1]/a")).click();;
//        
        driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/a[@data-handler='next']")).click();  
        // 点击17日，xpath定义第三行第五个元素，可能每个月排序不一样，所以不一定点击的就是17日  
        driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[3]/td[5]/a")).click();  
*/
        
        WebElement dateInputBox = driver.findElement(By.id("datepicker"));
        dateInputBox.sendKeys("08/17/2017");
	}

}
