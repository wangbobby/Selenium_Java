package P30;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotRobot {

	public static void main(String[] args) throws InterruptedException, HeadlessException, AWTException {
		System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");    
        
        WebDriver driver = new ChromeDriver();    
       
        driver.manage().window().maximize();    
         
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  
            
        driver.get("https://www.baidu.com");    
         
        Thread.sleep(1000); 
        
        BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));

        try {
			ImageIO.write(image, "png", new File(".\\Screenshots\\screen_robot.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
