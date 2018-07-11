package POM;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLog4j {

	public static void main(String[] args) {
		Logger logger = Logger.getLogger("baidu");  
//		listFilesInFolder();
        PropertyConfigurator.configure("./Log4j.properties");  
          
        // 打开浏览器  
        System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");    
        WebDriver driver = new ChromeDriver();   
        logger.info("启动浏览器");  
          
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
        logger.info("隐式等待10秒");  
          
        driver.get("https://www.baidu.com");  
        logger.info("打开百度首页");  
          
        driver.findElement(By.id("kw")).sendKeys("Selenium");  
        logger.info("在搜索输入框输入selenium");  
          

	}
	
	public static void listFilesInFolder() {
		File file = new File(".");
		for(String fileNames : file.list()) System.out.println(fileNames);
	}

}
