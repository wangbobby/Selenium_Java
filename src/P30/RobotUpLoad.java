package P30;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotUpLoad {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");  
        
	    WebDriver driver = new ChromeDriver();   
	          
	    driver.get("https://www.baidu.com");
	    
	    StringSelection sel = new StringSelection("1.jpg");
	    
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null);
	    System.out.println("selection" + sel);
	    
	    driver.findElement(By.xpath("//*[@id=\"form\"]/span[1]/span")).click();
	    
	    driver.findElement(By.xpath("//*[@id=\"form\"]/div/div[2]/div[2]/input")).click();
	    
	    Robot robot = new Robot();
	    Thread.sleep(1000);
//	    robot.keyPress(KeyEvent.VK_ENTER);
//	    robot.keyRelease(KeyEvent.VK_ENTER);
	    
	 // 按下 CTRL+V  
	     robot.keyPress(KeyEvent.VK_CONTROL);  
	     robot.keyPress(KeyEvent.VK_V);  
	          
	     // 释放 CTRL+V  
	     robot.keyRelease(KeyEvent.VK_CONTROL);  
	     robot.keyRelease(KeyEvent.VK_V);  
	     Thread.sleep(1000);  
	                 
	     // 点击回车 Enter   
	     robot.keyPress(KeyEvent.VK_ENTER);  
	     robot.keyRelease(KeyEvent.VK_ENTER);  
	    
	}

}
