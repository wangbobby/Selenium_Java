package P20;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptRoll {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Tools/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("http://blog.csdn.net/u011541946");
		
		Thread.sleep(3000);
		
//		WebElement element = driver.findElement(By.xpath("//*/dd[@class='foot_sub_menu']/a[1]"));
//		
//		//����һ��javascript ִ��ʵ��  
//        JavascriptExecutor je = (JavascriptExecutor) driver;  
//        
//      //ִ��js��䣬��ק�������������ֱ����Ԫ�ص��ײ������ϾͲ����Լ�  
//        je.executeScript("arguments[0].scrollIntoView(true);",element);  
		
		WebElement element = driver.findElement(By.xpath("//*[@id='asideFooter']/div[2]/div/div/div[2]/div[1]/p[1]/a[3]"));
		
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView(true);", element);
		
		
		
//		JavascriptExecutor je = (JavascriptExecutor) driver;
//		je.executeScript("window.scrollTo(100,450);");
		
	}

}
