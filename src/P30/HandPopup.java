package P30;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class HandPopup {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DesiredCapabilities cap=DesiredCapabilities.chrome(); 
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe"); 
		
		WebDriver driver=new ChromeDriver(cap); 
		driver.get("https://kyfw.12306.cn/otn");
		
		fire();
	}
	
	public static void fire() throws Exception {  
        
        System.setProperty("webdriver.gecko.driver", ".\\Tools\\geckodriver.exe");    
           
        // 创建 firefox profile  
        FirefoxProfile profile = new FirefoxProfile();  
           
        // 把这项值设置为True,就是接受不可信任的证书  
        profile.setAcceptUntrustedCertificates(true);  
           
        // 打开一个带上门设置好profile的火狐浏览器  
        WebDriver driver = new FirefoxDriver();  
          
        driver.manage().window().maximize();  
        driver.get("https://kyfw.12306.cn/otn");  
          
    }  

}
