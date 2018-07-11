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
          
        // �������  
        System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");    
        WebDriver driver = new ChromeDriver();   
        logger.info("���������");  
          
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
        logger.info("��ʽ�ȴ�10��");  
          
        driver.get("https://www.baidu.com");  
        logger.info("�򿪰ٶ���ҳ");  
          
        driver.findElement(By.id("kw")).sendKeys("Selenium");  
        logger.info("���������������selenium");  
          

	}
	
	public static void listFilesInFolder() {
		File file = new File(".");
		for(String fileNames : file.list()) System.out.println(fileNames);
	}

}
